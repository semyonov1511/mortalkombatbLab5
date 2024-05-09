package Actions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import Game_components.Human;
import Game_components.Player;
import Game_components.Result;
import javax.swing.ImageIcon;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Game {

    public CharacterAction action = new CharacterAction();
    public ChangeTexts change = new ChangeTexts();
    public Fight fight = new Fight();
    private ArrayList<Result> results = new ArrayList<>();

    public ArrayList<Player> enemiesAtLocation(int i) {
        Player enemy = null;
        ArrayList<Player> list = new ArrayList<>();
        for (int j = 0; j < 1 + (int) (Math.random() * i); j++) {
            int k = (int) (Math.random() * 4);
            ImageIcon icon1 = null;
            switch (k) {
                case 0 -> {
                    enemy = action.getEnemies()[0];
                    enemy.setPhoto("B.jpg");
                }
                case 1 -> {
                    enemy = action.getEnemies()[1];
                    enemy.setPhoto("SZ.jpg");
                }
                case 2 -> {
                    enemy = action.getEnemies()[2];
                    enemy.setPhoto("LK.jpg");
                }
                case 3 -> {
                    enemy = action.getEnemies()[3];
                    enemy.setPhoto("SB.jpg");
                }
            }
            list.add(enemy);
        }
        return list;
    }

    public void newLocation(ArrayList<Player> list, Player human, JLabel label, JProgressBar pr1,
            JProgressBar pr2, JLabel label2, JLabel text, JLabel label3, CharacterAction action) {
        for (Player enemy : list) {

        }
    }

    public Player NewEnemy(JLabel L1, JLabel L2,
            JLabel L3, JLabel L4, JProgressBar pr2) {
        action.setEnemies();
        Player enemy = action.ChooseEnemy(L1, L2, L3, L4);
        action.HP(enemy, pr2);
        pr2.setMaximum(enemy.getMaxHealth());
        return enemy;
    }

    public Human NewHuman(JProgressBar pr1) {
        Human human = new Human(0, 80, 16, 1);
        action.HP(human, pr1);
        pr1.setMaximum(human.getMaxHealth());
        return human;
    }

    public void EndGameTop(Human human, JTextField text, JTable table) throws IOException {
        results.add(new Result(text.getText(), human.getPoints()));
        results.sort(Comparator.comparing(Result::getPoints).reversed());
        WriteToTable(table);
        WriteToExcel();
    }

    public void WriteToExcel() throws IOException {
        XSSFWorkbook book = new XSSFWorkbook();
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
        File f = new File("C:\\Users\\semyo\\Desktop\\Results.xlsx");
        book.write(new FileOutputStream(f));
        book.close();
    }

    public ArrayList<Result> getResults() {
        return this.results;
    }

    public void ReadFromExcel() throws IOException {
        /*
        XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\semyo\\Desktop\\Results.xlsx");
        XSSFSheet sh = book.getSheetAt(0);
        for (int i=1; i<=sh.getLastRowNum();i++) {
            results.add(new Result(sh.getRow(i).getCell(1).getStringCellValue(),(int)sh.getRow(i).getCell(2).getNumericCellValue()));
        }
         */
    }

    public void WriteToTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (int i = 0; i < results.size(); i++) {
            if (i < 10) {
                model.setValueAt(results.get(i).getName(), i, 0);
                model.setValueAt(results.get(i).getPoints(), i, 1);
            }
        }
    }
}
