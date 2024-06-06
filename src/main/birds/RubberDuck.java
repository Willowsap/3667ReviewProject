package birds;

public class RubberDuck extends Duck {

  public RubberDuck() {
    super(new NoFly(), new Squeak());
  }

  @Override
  public void display() {
    System.out.println("A gorgeous rubber duck");
  }
}
