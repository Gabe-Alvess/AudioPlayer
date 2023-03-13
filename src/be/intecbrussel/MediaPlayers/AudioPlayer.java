package be.intecbrussel.MediaPlayers;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        mediaAdapter = new MediaAdapter(audioType);

        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing " + audioType + " file. " + "Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
