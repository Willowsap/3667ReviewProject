package birds;

public class RedHeadedDuck extends Duck {

  public RedHeadedDuck() {
    super(new RegularFly(), new Quack());
  }

  @Override
  public void display() {
    System.out.println("A somewhat beautiful red-headed duck");
  }
}
