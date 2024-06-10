package birds;

/**
 * A simple Rubber Duck.
 * Cannot fly and squeaks instead of quacks.
 * 
 * @author Willow Sapphire
 * @version 06/10/2024
 */
public class RubberDuck extends Duck {
  /**
   * Creates a new Rubber Duck.
   * Uses NoFly and Squeak.
   */
  public RubberDuck() {
    super(new NoFly(), new Squeak());
  }

  @Override
  public void display() {
    System.out.println("A gorgeous rubber duck");
  }
}
