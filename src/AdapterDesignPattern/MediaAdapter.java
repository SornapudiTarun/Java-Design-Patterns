package AdapterDesignPattern;

public class MediaAdapter implements MediaPlayer{
    AdvanceMediaPlayer mediaPlayer;
    public MediaAdapter(String audioType){
        if (audioType.equalsIgnoreCase("VLC")){
            mediaPlayer= new VlcPlayer();
        }else if (audioType.equalsIgnoreCase("MP4")){
            mediaPlayer=new Mp4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")){
            mediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            mediaPlayer.playMP4(fileName);
        }
    }
}
