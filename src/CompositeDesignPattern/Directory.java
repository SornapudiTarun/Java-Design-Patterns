package CompositeDesignPattern;

import BridgeDesignPattern.Device;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemEntity{
    private String fileName;
    private List<FileSystemEntity> entities = new ArrayList<>();

    public Directory(String fileName){
        this.fileName=fileName;
    }
    @Override
    public void showDetails() {
        System.out.println("Directories : "+fileName);
        for (FileSystemEntity entity : entities){
            entity.showDetails();
        }
    }

    public void add(FileSystemEntity entity) {
        entities.add(entity);
    }


    public void remove(FileSystemEntity entity) {
        entities.remove(entity);
    }
}
