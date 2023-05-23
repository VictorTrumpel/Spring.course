package victor.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Reader {
  @Autowired
  @Qualifier("russianBook")
  private Book book1;

  @Autowired
  @Qualifier("englishBook")
  private Book book2;

  public String readBook() {
    return this.book1.read() + this.book2.read();
  }
}
