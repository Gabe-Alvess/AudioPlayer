package be.intecbrussel.MediaPlayers;

public class AudioPlayer implements MediaPlayer {
    protected MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        mediaAdapter = new MediaAdapter(audioType);

        if (mediaAdapter.getAdvancedMusicPlayer() instanceof VlcPlayer || mediaAdapter.getAdvancedMusicPlayer() instanceof Mp4Player) {
            mediaAdapter.play(audioType, fileName);
        } else if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing " + audioType + " file. " + "Name: " + fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
