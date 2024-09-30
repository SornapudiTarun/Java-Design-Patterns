package ObserverDesignPattern;

public class DisplayElement implements Observer{
    private String name;

    public DisplayElement(String name){
        this.name=name;
    }
    @Override
    public void update(float temp, float humidity) {
        System.out.println(name + " Display - Temperature: " + temp + ", Humidity: " + humidity);
    }
}
