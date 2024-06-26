package Actions;

import Fabrics.EnemyFabric;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import Game_components.Human;
import Game_components.Items;
import Game_components.Player;
import Game_components.Result;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Game {

    public MidGameActions action = new MidGameActions();
    public Fight fight = new Fight();
    private final ArrayList<Result> results = new ArrayList<>();
    private final Player enemies[] = new Player[5];

    EnemyFabric fabric = new EnemyFabric();

    public void setEnemies() {
        enemies[0] = fabric.create(0, 0);
        enemies[1] = fabric.create(1, 0);
        enemies[2] = fabric.create(2, 0);
        enemies[3] = fabric.create(3, 0);
        enemies[4] = fabric.create(4, 0);
    }

    public Player[] getEnemies() {
        return this.enemies;
    }

    public Human newHuman(Mediator mediator, Items[] items) {
        Human human = new Human(0, 80, 16, 1);
        mediator.setHealthBar(human);
        mediator.setPlayerMaxHealthBar(human);
        human.setItems(items);
        return human;
    }

    public void endGameTop(Human human, JTextField text, JTable table) throws IOException {
        results.add(new Result(text.getText(), human.getPoints()));
        results.sort(Comparator.comparing(Result::getPoints).reversed());
        writeToTable(table);
        writeToExcel();
    }

    public void writeToExcel() throws IOException {
        try (XSSFWorkbook book = new XSSFWorkbook()) {
            XSSFSheet sheet = book.createSheet("Результаты ТОП 10");
            XSSFRow r = sheet.createRow(0);
            r.createCell(0).setCellValue("№");
            r.createCell(1).setCellValue("Имя");
            r.createCell(2).setCellValue("Количество баллов");
            for (int i = 0; i < results.size(); i++) {
                if (i < 10) {
                    XSSFRow r2 = sheet.createRow(i + 1);
                    r2.createCell(0).setCellValue(i + 1);
                    r2.createCell(1).setCellValue(results.get(i).getName());
                    r2.createCell(2).setCellValue(results.get(i).getPoints());
                }
            }
            File f = new File("Results.xlsx");
            book.write(new FileOutputStream(f));
        }
    }

    public ArrayList<Result> getResults() {
        return this.results;
    }

    public void readFromExcel() throws IOException {
        XSSFWorkbook book = new XSSFWorkbook("Results.xlsx");
        XSSFSheet sh = book.getSheetAt(0);
        for (int i = 1; i <= sh.getLastRowNum(); i++) {
            results.add(new Result(sh.getRow(i).getCell(1).getStringCellValue(), (int) sh.getRow(i).getCell(2).getNumericCellValue()));
        }

    }

    public void writeToTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (int i = 0; i < results.size(); i++) {
            if (i < 10) {
                model.setValueAt(results.get(i).getName(), i, 0);
                model.setValueAt(results.get(i).getPoints(), i, 1);
            }
        }
    }
}
