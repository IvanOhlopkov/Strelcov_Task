package source;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileWork {

    NameAndPath nameAndPath = new NameAndPath();

        File myFile = new File(nameAndPath.getNamePath() + nameAndPath.getFileName());

        //создание файла
        public void createFile(){
        if(myFile.exists())
            System.out.println("File with this name already exist");
        else
            System.out.println("File not found");
            try {
                boolean created = myFile.createNewFile();
                if(created)
                System.out.println("File created");
                }
            catch (IOException ex){
                System.out.println(ex.getMessage());
            }

        }
        //переименование файла
        public void renameFile(){
         if(myFile.exists())
            System.out.println("File found");
         else
            System.out.println("File not found");

            File renameFile = new File(nameAndPath.getNamePath() + nameAndPath.newFileName);
             boolean renamed = myFile.renameTo(renameFile);
                if(renamed)
                    System.out.println("File renamed");
                 else
                    System.out.println("File not renamed");
        }
        //удаление файла
        public void deleteFile(){
            if(myFile.exists())
                System.out.println("File found");
            else
                System.out.println("File not found");

            boolean deleted = myFile.delete();
                if(deleted)
                    System.out.println("File deleted");
                else
                    System.out.println("File not deleted");
        }
        //перемещение файла
        public void moveFile() throws IOException {
                Files.move(Paths.get(nameAndPath.moveFileFromCatalog + nameAndPath.getFileName()), Paths.get(nameAndPath.moveFileToCatalog + "//" + nameAndPath.getFileName()), StandardCopyOption.REPLACE_EXISTING);

        }

}