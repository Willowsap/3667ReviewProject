package birds;

/**
 * Squeak strategy object for the QuackBehavior strategy.
 * 
 * @author Willow Sapphire
 * @version 06/10/2024
 */
public class Squeak implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("Squeak!");
  }
}
