package source;

import java.io.IOException;

public class A_MainClass {
    public static void main(String[] args) throws IOException {
        FileWork fileWork = new FileWork();
        ChangeFile changeFile = new ChangeFile();
        CatalogWork catalogWork = new CatalogWork();
        //catalogWork.renameCatalog();
        //fileWork.createFile();
        //fileWork.moveFile();
        //changeFile.writeInFile();
        changeFile.readFromFile();
    }
}
