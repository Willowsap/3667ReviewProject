package birds;

/**
 * Our basic abstraction of a duck.
 * 
 * @author Willow Sapphire
 * @version 06/10/2024
 */
public abstract class Duck {
  /**
   * Strategy object for specifying how the duck flies.
   */
  private FlyBehavior myWayToFly;

  /**
   * Strategy object for specifying how the duck quacks.
   */
  private QuackBehavior myWayToQuack;

  /**
   * Constructs a new duck, setting both its strategy fields.
   * 
   * @param myWayToFly how the duck should fly
   * @param myWayToQuack how the duck should quack
   */
  public Duck(FlyBehavior myWayToFly, QuackBehavior myWayToQuack) {
    this.myWayToFly = myWayToFly;
    this.myWayToQuack = myWayToQuack;
  }

  /**
   * Delegate quack method.
   * Uses strataegy field.
   */
  public void quack() {
    this.myWayToQuack.quack();
  }

  /**
   * Delegate fly method.
   * Uses strategy field.
   */
  public void fly() {
    this.myWayToFly.fly();
  }

  /**
   * Default swim implementation.
   * So far we have not been given reason to turn
   * this into a strategy object.
   * YAGNI
   */
  public void swim() {
    System.out.println("Swimming about");
  }

  /**
   * Setter for the FlyBehavior strategy object.
   * 
   * @param fb thew new FlyBehavior
   */
  public void setFlyBehavior(FlyBehavior fb) {
    this.myWayToFly = fb;
  }

  /**
   * Setter for the QuackBehavior strategy object.
   * 
   * @param qb the new QuackBehavior
   */
  public void setQuackBehavior(QuackBehavior qb) {
    this.myWayToQuack = qb;
  }

  /**
   * Prints out a description of the duck.
   */
  public abstract void display();
}
