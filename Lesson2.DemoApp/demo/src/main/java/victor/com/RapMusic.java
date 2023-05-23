package victor.com;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {

  String[] songs = { "Like a 2Pack", "Detroit", "Cool Nigga" };

  public String[] getSong() {
    return songs;
  }
}
