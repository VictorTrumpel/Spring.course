package victor.com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
        SpringConfig.class);

    MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

    ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);

    context.close();
  }
}
