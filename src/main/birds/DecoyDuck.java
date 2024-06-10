package birds;

/**
 * A simple Decoy Duck.
 * It cannot fly or quack.
 * 
 * @author Willow Sapphire
 * @version 06/10/2024
 */
public class DecoyDuck extends Duck {
  /**
   * Creates a new DecoyDuck.
   * Uses NoFly and MuteQuack.
   */
  public DecoyDuck() {
    super(new NoFly(), new MuteQuack());
  }
  
  @Override
  public void display() {
    System.out.println("A stunning wooden duck");
  }
}
