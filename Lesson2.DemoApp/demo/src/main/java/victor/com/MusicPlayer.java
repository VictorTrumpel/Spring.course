package victor.com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

  // Внедряем значения из musicPlayer.properties
  @Value("${musicPlayer.name}")
  private String name;

  @Value("${musicPlayer.volume}")
  private int volume;

  private Music classicalMusic;
  private Music rockMusic;

  @Autowired
  public MusicPlayer(
      @Qualifier("classicalMusic") Music classicalMusic,
      @Qualifier("rapMusic") Music rockMusic) {
    this.classicalMusic = classicalMusic;
    this.rockMusic = rockMusic;
  }

  public void playMusic(MusicGenre genre) {
    Music musicToPlay = genre == MusicGenre.ROCK
        ? this.rockMusic
        : this.classicalMusic;

    String[] songs = musicToPlay.getSong();

    for (int i = 0; i < songs.length; i++) {
      System.out.println("song is playing :>> " + songs[i]);
    }
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getVolume() {
    return this.volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }
}
