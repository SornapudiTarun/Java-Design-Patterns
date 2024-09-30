package ProxyDesignPattern;

public class RealImage implements Image{
    //real object
    private String fileName;

    public RealImage(String fileName){
        this.fileName=fileName;
        loadImageFromDisk();
    }

    private void loadImageFromDisk(){
        System.out.println("Loading image from Disk "+fileName);
    }
    @Override
    public void display() {
        System.out.println("Displaying Image "+ fileName);
    }
}
