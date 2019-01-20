package source;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ChangeFile {
    NameAndPath nameAndPath = new NameAndPath();
    public void writeInFile() {
        String text = "Hello World";
        try(FileWriter writer = new FileWriter(nameAndPath.namePath + "//" + nameAndPath.newCatalogName + "//" + nameAndPath.fileName, false)){
            //перевод строки в байты
            writer.write(text);
            writer.append('\n');
            writer.append('E');
            writer.flush();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
    }
    public void readFromFile(){
        try(FileReader reader = new FileReader(nameAndPath.namePath + "//" + nameAndPath.newCatalogName + "//" + nameAndPath.fileName)){
            int c;
            while ((c = reader.read()) !=-1){
             System.out.print((char)c);
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}