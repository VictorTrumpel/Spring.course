package victor.com;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

  @PostConstruct
  public void doMyInit() {
    System.out.println("Doing my init");
  }

  @PreDestroy // работает только в singleton скоупе
  public void doMyDestroy() {
    System.out.println("Doing my destroy");
  }
}
