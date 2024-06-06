package birds;

public class MockQuackBehavior implements QuackBehavior {
  public static final String QUACK_OUTPUT = "mock quacking";
  
  @Override
  public void quack() {
    System.out.print(QUACK_OUTPUT);
  }
}
