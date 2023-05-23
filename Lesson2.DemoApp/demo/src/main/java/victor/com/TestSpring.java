package victor.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext.xml");

    MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

    MusicGenre genre = MusicGenre.ROCK;

    musicPlayer.playMusic(genre);

    context.close();
  }
}
