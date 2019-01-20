package source;

import java.io.File;

public class CatalogWork {
    NameAndPath nameAndPath = new NameAndPath();

    File dir = new File (nameAndPath.getNamePath() + nameAndPath.catalogName);
    public void createCatalog(){
        boolean created = dir.mkdir();
        if(created)
            System.out.println("Folder has been created");
    }

    File newDir = new File(nameAndPath.getNamePath() + nameAndPath.newCatalogName);
    public void renameCatalog(){
        dir.renameTo(newDir);
    }

    public  void deleteCatalog(){
        boolean deleted = dir.delete();
        if(deleted)
            System.out.println("Folder has been deleted");
    }
}