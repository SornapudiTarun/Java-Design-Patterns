package AdapterDesignPattern;

public class Mp4Player implements AdvanceMediaPlayer{
    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing MP4 media player with file name : "+fileName);
    }

    @Override
    public void playVlc(String fileName) {

    }
}
