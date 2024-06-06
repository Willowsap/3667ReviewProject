package birds;

public class DecoyDuck extends Duck {
  public DecoyDuck() {
    super(new NoFly(), new MuteQuack());
  }
  
  @Override
  public void display() {
    System.out.println("A stunning wooden duck");
  }
}
