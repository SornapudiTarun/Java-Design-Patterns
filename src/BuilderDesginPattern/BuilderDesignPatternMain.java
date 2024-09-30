package BuilderDesginPattern;

public class BuilderDesignPatternMain {
    public static void main(String[] args) {

        Phone phone = new PhoneBuilder().setOs("iOS").setRam(8).setProcessor("A18").setBattery(3780).getPhone();
        System.out.println(phone);
    }
}
