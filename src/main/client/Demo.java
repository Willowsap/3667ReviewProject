package client;

import birds.RubberDuck;

import java.util.ArrayList;

import birds.DecoyDuck;
import birds.Duck;
import birds.MallardDuck;
import birds.RedHeadedDuck;

public class Demo {
  public static void main(String[] args) {
    ArrayList<Duck> ducks = new ArrayList<>();
    ducks.add(new MallardDuck());
    ducks.add(new RedHeadedDuck());
    ducks.add(new RubberDuck());
    ducks.add(new DecoyDuck());

    for (Duck d : ducks) {
      d.display();
      d.swim();
      d.fly();
      d.quack();
      System.out.println();
    }

  }
}
