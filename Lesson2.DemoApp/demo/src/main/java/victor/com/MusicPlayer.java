package victor.com;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
  private List<Music> musicList = new ArrayList<Music>();

  private String name;
  private int volume;

  // IoC
  // public MusicPlayer(Music music) {
  // this.music = music;
  // }

  public void setMusicList(List<Music> musicList) {
    this.musicList = musicList;
  }

  public void playMusic() {
    for (int i = 0; i < musicList.size(); i++) {
      System.out.println("playing :>> " + musicList.get(i).getSong());
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
