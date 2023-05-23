package victor.com;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

  public String[] songs = { "It's my life", "Honest" };

  public String[] getSong() {
    return this.songs;
  }
}
