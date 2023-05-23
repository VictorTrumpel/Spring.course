package victor.com;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {

  public String getSong() {
    return "2Pac rapping";
  }
}
