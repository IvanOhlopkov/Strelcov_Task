package source;

import java.io.File;

class NameAndPath {

    protected String fileName;
    protected String namePath;
    protected String newFileName;
    protected String catalogName;
    protected String newCatalogName;
    protected String moveFileFromCatalog;
    protected String moveFileToCatalog;
    //получение абсолютного пути
    String pathAbsolute = new File("").getAbsolutePath();

    public NameAndPath(){
        fileName = "test1.doc";
        namePath = "C://Users//Joni//Desktop//";
        newFileName = "testA.txt";
        catalogName = "NewDir";
        newCatalogName = "DirA";
        moveFileFromCatalog = "C://Users//Joni//Desktop//";
        moveFileToCatalog = "C://Users//Joni//Desktop//DirA";
        //условие: если имя пути файла, записываем туда абсолютный путь (директория проекта)
        if(namePath == null) {
            namePath = pathAbsolute;
        }
    }
    //получение имени файла
    public String getFileName(){
        return fileName;
    }
    //получения пути файла
    public String getNamePath(){
        return namePath;
    }
    //ввод пути файла
    public void setNamePath(String namePathTemp){
        this.namePath = namePathTemp;
    }
    //ввод имени файла
    public String setFileName(String fileNameTemp){
        this.fileName = fileNameTemp;
        return fileName;
    }
}
