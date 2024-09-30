package BridgeDesignPattern;

public class BridgeDesignPatternMain {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        // Using basic remote control with TV
        RemoteControl basicRemote = new RemoteControl(tv);
        basicRemote.togglePower();
        basicRemote.setVolume(50);

        System.out.println();

        // Using advanced remote control with Radio
        AdvanceRemoteControl advancedRemote = new AdvanceRemoteControl(radio);
        advancedRemote.togglePower();
        advancedRemote.setVolume(80);
        advancedRemote.mute();
    }
}
