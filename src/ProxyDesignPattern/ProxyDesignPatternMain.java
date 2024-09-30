package ProxyDesignPattern;

public class ProxyDesignPatternMain {
    public static void main(String[] args) {
        Image image = new ProxyImage("my_photo.jpg");

        System.out.println("Image not loaded yet");
        image.display();

    }
}
