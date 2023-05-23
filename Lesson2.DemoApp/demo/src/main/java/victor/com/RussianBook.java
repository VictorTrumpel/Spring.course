package victor.com;

import org.springframework.stereotype.Component;

@Component
public class RussianBook implements Book {
  public String read() {
    System.out.println("This is Englisj book");
    return "This is Russian book";
  }
}
