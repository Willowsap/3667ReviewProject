package birds;

public class MockDuck extends Duck {
  public static final String FLY_OUTPUT = MockFlyBehavior.FLY_OUTPUT;
  public static final String QUACK_OUTPUT = MockQuackBehavior.QUACK_OUTPUT;
  
  public MockDuck() {
    super(new MockFlyBehavior(), new MockQuackBehavior());
  }

  @Override
  public void display() {}
}
