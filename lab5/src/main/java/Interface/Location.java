package Interface;

import javax.swing.*;
import java.awt.*;

public class Location extends JFrame {
    public final JTextArea text=new JTextArea();
    public Location(String message ){
        super("Выберите количество локаций");
        this.setBounds(500, 100, 200, 200);
        Container container = this.getContentPane();
        container.add(text);
        text.setText(message);
    }
}
