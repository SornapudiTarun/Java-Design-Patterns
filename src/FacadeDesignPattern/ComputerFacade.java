package FacadeDesignPattern;

public class ComputerFacade {
    private CPU cpu;
    private HardDrive hardDrive;
    private Memory memory;

    public ComputerFacade(){
        this.cpu= new CPU();
        this.hardDrive=new HardDrive();
        this.memory=new Memory();
    }

    public void startComputer(){
        cpu.start();
        byte[] bootData=hardDrive.read(0,2024);
        memory.load(0,bootData);
    }
}
