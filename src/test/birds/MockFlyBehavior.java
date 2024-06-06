package birds;

public class MockFlyBehavior implements FlyBehavior {
  public static final String FLY_OUTPUT = "mock flying";
  
  @Override
  public void fly() {
    System.out.print(FLY_OUTPUT);
  }
}
