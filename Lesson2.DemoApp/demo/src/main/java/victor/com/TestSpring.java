package victor.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext.xml");

    MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

    ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);

    context.close();
  }
}
