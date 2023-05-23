package victor.com;

import org.springframework.stereotype.Component;

@Component
public class EnglishBook implements Book {
  public String read() {
    System.out.println("This is English book");
    return "This is English book";
  }
}
