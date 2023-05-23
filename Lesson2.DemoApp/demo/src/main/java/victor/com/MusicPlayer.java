package victor.com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
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
}
