package source;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GUI extends javax.swing.JFrame{
    public GUI(){
        initGUI();
    }
    private void initGUI() {
        JFrame frame = new JFrame("Работа с файлами");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,300);

        JSplitPane splitPane = new JSplitPane();

        JPanel topPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        JPanel inputPanel = new JPanel();
        JLabel labelTop = new JLabel("Введите путь к файлу");
        JLabel labelBottom = new JLabel ("Имя файла");
        JTextField textTop = new JTextField(40);
        JTextField textBottom = new JTextField(40);

        setPreferredSize(new Dimension(400,400));

        getContentPane().setLayout(new GridLayout());

        getContentPane().add(splitPane);

        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        splitPane.setDividerLocation(200);
        splitPane.setTopComponent(topPanel);
        splitPane.setBottomComponent(bottomPanel);

        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.Y_AXIS));

        bottomPanel.add(inputPanel);

        inputPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 75));
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.X_AXIS));
        inputPanel.add(labelBottom);
        inputPanel.add(textBottom);

        pack();

        frame.setVisible(true);
    }
}
