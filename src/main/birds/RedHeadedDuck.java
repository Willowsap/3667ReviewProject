package birds;

/**
 * A simple Red-Headed Duck.
 * Fllies and Quacks normally.
 * 
 * @author Willow Sapphire
 * @version 06/10/2024
 */
public class RedHeadedDuck extends Duck {
  /**
   * Creates a new RedHeadedDuck.
   * Uses RegularFly and Quack.
   */
  public RedHeadedDuck() {
    super(new RegularFly(), new Quack());
  }

  @Override
  public void display() {
    System.out.println("A somewhat beautiful red-headed duck");
  }
}
