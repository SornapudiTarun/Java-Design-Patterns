package AdapterDesignPattern;

public class VlcPlayer implements AdvanceMediaPlayer{
    @Override
    public void playMP4(String fileName) {

    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing Vlc media player with file name : "+fileName);
    }
}
