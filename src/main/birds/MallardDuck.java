package birds;

/**
 * A simple Mallard Duck.
 * Fllies and Quacks normally.
 * 
 * @author Willow Sapphire
 * @version 06/10/2024
 */
public class MallardDuck extends Duck {
  /**
   * Creates a new Mallard Duck.
   * Uses RegularFly and Quack.
   */
  public MallardDuck() {
    super(new RegularFly(), new Quack());
  }

  @Override
  public void display() {
    System.out.println("A beautiful mallard duck");
  }
}
