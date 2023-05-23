package victor.com;

import org.springframework.stereotype.Component;

@Component
public class Computer {
  private int id;
  private Reader reader;

  public Computer(Reader reader) {
    this.id = 0;
    this.reader = reader;
  }

  @Override
  public String toString() {
    return "Computer " + this.id + " " + this.reader.readBook();
  }
}
