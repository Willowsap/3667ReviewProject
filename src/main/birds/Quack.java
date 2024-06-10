package birds;

/**
 * Quack strategy object for the QuackBehavior strategy.
 * 
 * @author Willow Sapphire
 * @version 06/10/2024
 */
public class Quack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("Quack!");
  }
}
