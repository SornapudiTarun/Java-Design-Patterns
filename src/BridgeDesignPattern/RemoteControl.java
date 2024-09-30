package BridgeDesignPattern;

public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device){
        this.device=device;
    }

    public void togglePower(){
        if (device.isOn()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }

    public void setVolume(int volume) {
        device.setVolume(volume);
    }
}
