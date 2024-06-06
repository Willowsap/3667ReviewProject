package birds;

public abstract class Duck {

  private FlyBehavior myWayToFly;
  private QuackBehavior myWayToQuack;

  public Duck(FlyBehavior myWayToFly, QuackBehavior myWayToQuack) {
    this.myWayToFly = myWayToFly;
    this.myWayToQuack = myWayToQuack;
  }

  public void quack() {
    this.myWayToQuack.quack();
  }

  public void fly() {
    this.myWayToFly.fly();
  }

  public void swim() {
    System.out.println("Swimming about");
  }

  public void setFlyBehavior(FlyBehavior fb) {
    this.myWayToFly = fb;
  }

  public void setQuackBehavior(QuackBehavior qb) {
    this.myWayToQuack = qb;
  }

  public abstract void display();
}