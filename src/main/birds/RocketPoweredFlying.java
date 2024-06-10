package birds;

/**
 * RocketPoweredFlying strategy object for the FlyBehavior strategy.
 * 
 * @author Willow Sapphire
 * @version 06/10/2024
 */
public class RocketPoweredFlying implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("Rocket boost actived: ZOOOM!!!");
  }
}
