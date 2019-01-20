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

    String pathAbsolute = new File("").getAbsolutePath();
    public NameAndPath(){
        fileName = "test1.doc";
        namePath = "C://Users//Joni//Desktop//";
        newFileName = "testA.txt";
        catalogName = "NewDir";
        newCatalogName = "DirA";
        moveFileFromCatalog = "C://Users//Joni//Desktop//";
        moveFileToCatalog = "C://Users//Joni//Desktop//DirA";
        if(namePath == null) {
            namePath = pathAbsolute;
        }
    }

    public String getFileName(){
        return fileName;
    }
    public String getNamePath(){
        return namePath;
    }
    public void setNamePath(String namePathTemp){
        this.namePath = namePathTemp;
    }
    public String setFileName(String fileNameTemp){
        this.fileName = fileNameTemp;
        return fileName;
    }
}
