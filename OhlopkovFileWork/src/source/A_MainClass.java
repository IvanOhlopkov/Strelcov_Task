package source;

import javax.swing.*;
import java.io.IOException;

public class A_MainClass extends JFrame {
    public static void main(String[] args) throws IOException {
        FileWork fileWork = new FileWork();
        ChangeFile changeFile = new ChangeFile();
        CatalogWork catalogWork = new CatalogWork();
        GUI gui = new GUI();
        //catalogWork.renameCatalog();
        //fileWork.createFile();
        //fileWork.moveFile();
        //changeFile.writeInFile();
        //changeFile.readFromFile();
        gui.getGraphics();
    }
}
