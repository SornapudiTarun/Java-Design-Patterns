package CommandDesignPattern;

public class CommandDesignPatternMain {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(lightOn);
        remoteController.pressButton();

        remoteController.setCommand(lightOff);
        remoteController.pressButton();
    }
}
