package BridgeDesignPattern;

public class AdvanceRemoteControl extends RemoteControl{
    public AdvanceRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Muting the device.");
        device.setVolume(0);
    }
}
