package birds;

/**
 * RegularFly strategy object for the FlyBehavior strategy.
 * 
 * @author Willow Sapphire
 * @version 06/10/2024
 */
public class RegularFly implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("Flying Normally");
  }
}
