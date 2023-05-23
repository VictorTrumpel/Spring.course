package victor.com;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

  String[] songs = { "Shopen", "Ludvick", "Sebastian" };

  private ClassicalMusic() {
  }

  public static ClassicalMusic getClassicalMusic() {
    return new ClassicalMusic();
  }

  public String[] getSong() {
    return this.songs;
  }
}
