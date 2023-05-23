package victor.com;

public class ClassicalMusic implements Music {

  private ClassicalMusic() {
  }

  public static ClassicalMusic getClassicalMusic() {
    System.out.println("FACTORY METHOD");
    return new ClassicalMusic();
  }

  public String getSong() {
    return "Hungarian Rhapsody";
  }

  public void doMyInit() {
    System.out.println("Do my initialization");
  }

  public void doMyDestroy() {
    System.out.println("Doing my destruction");
  }
}
