package birds;

public class MallardDuck extends Duck {

  public MallardDuck() {
    super(new RegularFly(), new Quack());
  }

  @Override
  public void display() {
    System.out.println("A beautiful mallard duck");
  }
}
