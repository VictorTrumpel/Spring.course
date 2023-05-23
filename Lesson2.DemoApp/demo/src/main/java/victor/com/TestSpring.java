package victor.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext.xml");

    MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
    MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

    ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);

    firstMusicPlayer.playMusic();

    System.out.println("musicPlayer.name :>> " + firstMusicPlayer.getName());
    System.out.println("musicPlayer.volume :>> " + firstMusicPlayer.getVolume());

    context.close();
  }
}
