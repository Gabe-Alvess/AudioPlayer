package be.intecbrussel.MediaPlayers;

public class MediaAdapter implements MediaPlayer {

    protected AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("mp4")) {
            setAdvancedMusicPlayer(new Mp4Player());
        } else if (audioType.equalsIgnoreCase("vlc")){
            setAdvancedMusicPlayer(new VlcPlayer());
        }
    }

    public AdvancedMediaPlayer getAdvancedMusicPlayer() {
        return advancedMusicPlayer;
    }

    public void setAdvancedMusicPlayer(AdvancedMediaPlayer advancedMusicPlayer) {
        this.advancedMusicPlayer = advancedMusicPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (advancedMusicPlayer instanceof Mp4Player) {
            advancedMusicPlayer.playMp4(fileName);
        } else if (advancedMusicPlayer instanceof VlcPlayer) {
            advancedMusicPlayer.playVlc(fileName);
        }
    }
}
