package CompositeDesignPattern;

public class File implements FileSystemEntity{
    private String fileName;
    public File(String fileName){
        this.fileName=fileName;
    }
    @Override
    public void showDetails() {
        System.out.println("File : "+fileName);
    }
}
