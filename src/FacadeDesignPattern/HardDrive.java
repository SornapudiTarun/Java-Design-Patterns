package FacadeDesignPattern;

public class HardDrive {
    public byte[] read(long lba,int size){
        System.out.println("Hard Drive ready");
        return new byte[size];
    }
}
