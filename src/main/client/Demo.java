package client;

import birds.RubberDuck;
import birds.Squeak;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import birds.DecoyDuck;
import birds.Duck;
import birds.MallardDuck;
import birds.MuteQuack;
import birds.NoFly;
import birds.Quack;
import birds.RedHeadedDuck;
import birds.RegularFly;
import birds.RocketPoweredFlying;

/**
 * Playing with ducks!
 * 
 * @author Willow Sapphire
 * @version 06/10/2024
 */
public class Demo {
  /**
   * Demo program for messing around with our Duck system.
   * 
   * @param args unused for now
   */
  public static void main(String[] args) {
    ArrayList<Duck> ducks = new ArrayList<>();
    Scanner kb = new Scanner(System.in);
    int choice = 0;
    do {
      System.out.println("Please select from the following menu");
      System.out.println("1) Add Duck");
      System.out.println("2) Roll Call");
      System.out.println("3) Edit Duck");
      System.out.println("4) Quit");
      choice = getNumber(kb, 1, 4);
      switch (choice) {
        case 1:
          addDuck(ducks, kb);
          break;
        case 2:
          rollCall(ducks);
          break;
        case 3:
          editDuck(ducks, kb);
          break;
      }
    } while (choice != 4);
    System.out.println("Goodbye!");
  }

  /**
   * Edits the qualities of a specific duck.
   * 
   * @param ducks the list of ducks in which to find the duck to edit
   * @param kb the Scanner from which to get user input
   */
  private static void editDuck(ArrayList<Duck> ducks, Scanner kb) {
    System.out.println("Please select the duck you would like to edit");
    for (int i = 0; i < ducks.size(); i++) {
      Duck d = ducks.get(i);
      System.out.printf("%d) ", i + 1);
      d.display();
    }
    int choice = getNumber(kb, 1, ducks.size());
    Duck selectedDuck = ducks.get(choice - 1);
    System.out.println("What would you like to do?");
    System.out.println("1) Change Fly Behavior");
    System.out.println("2) Change Quack Behavior");
    System.out.println("3) Delete Duck");
    System.out.println("4) Abort");
    choice = getNumber(kb, 1, 4);
    switch (choice) {
      case 1:
        changeFlyBehavior(selectedDuck, kb);
        break;
      case 2:
        changeQuackBehavior(selectedDuck, kb);
        break;
      case 3:
        ducks.remove(selectedDuck);
        break;
      case 4:
        return;
    }
  }

  /**
   * Changes the fly behavior of a given duck based on user input.
   * 
   * @param duck the duck to edit
   * @param kb the Scanner from which to get user input
   */
  public static void changeFlyBehavior(Duck duck, Scanner kb) {
    System.out.println("What fly behavior would you like?");
    System.out.println("1) Regular Flying");
    System.out.println("2) Rocket Powered Flying");
    System.out.println("3) No Flying");
    int choice = getNumber(kb, 1, 3);
    switch (choice) {
      case 1:
        duck.setFlyBehavior(new RegularFly());
        break;
      case 2:
        duck.setFlyBehavior(new RocketPoweredFlying());
        break;
      case 3:
        duck.setFlyBehavior(new NoFly());
        break;
    }
  }

  /**
   * Changes the quack behavior of a given duck based on user input.
   * 
   * @param duck the duck to edit
   * @param kb the Scanner from which to get user input
   */
  public static void changeQuackBehavior(Duck duck, Scanner kb) {
    System.out.println("What quack behavior would you like?");
    System.out.println("1) Quack");
    System.out.println("2) Squeak");
    System.out.println("3) Mute Quack");
    int choice = getNumber(kb, 1, 3);
    switch (choice) {
      case 1:
        duck.setQuackBehavior(new Quack());
        break;
      case 2:
        duck.setQuackBehavior(new Squeak());
        break;
      case 3:
        duck.setQuackBehavior(new MuteQuack());
        break;
    }
  }

  /**
   * Goes through a list of ducks and prints information about each.
   * 
   * @param ducks the list through which to iterate
   */
  private static void rollCall(ArrayList<Duck> ducks) {
    for (int i = 0; i < ducks.size(); i++) {
      Duck d = ducks.get(i);
      System.out.printf("Duck %d: ", i + 1);
      d.display();
      System.out.printf("Swim Behavior: ");
      d.swim();
      System.out.printf("Quack Behavior: ");
      d.quack();
      System.out.printf("Fly Behavior: ");
      d.fly();
      System.out.println("\n");
    }
  }

  /**
   * Gets a selection for a type of duck to add and adds
   * it to a provided ArrayList of ducks.
   * 
   * @param ducks the list in which to add the duck
   * @param kb the Scacnner from which to get user input
   */
  private static void addDuck(ArrayList<Duck> ducks, Scanner kb) {
    System.out.println("What kind of duck would you like to add?");
    System.out.println("1) Mallard Duck");
    System.out.println("2) Red-Headed Duck");
    System.out.println("3) Rubber Duck");
    System.out.println("4) Decoy Duck");
    int choice = getNumber(kb, 1, 4);
    switch (choice) {
      case 1:
        ducks.add(new MallardDuck());
        System.out.println("New mallard duck added");
        break;
      case 2:
        ducks.add(new RedHeadedDuck());
        System.out.println("New red-headed duck added");
        break;
      case 3:
        ducks.add(new RubberDuck());
        System.out.println("New rubber duck added");
        break;
      case 4:
        ducks.add(new DecoyDuck());
        System.out.println("New decoy duck added");
        break;
    }
  }

  /**
   * Gets a number from the user and verifies it is
   * in the specified range
   * 
   * @param kb the Scanner from which to read input
   * @return the number entered by the user
   */
  private static int getNumber(Scanner kb, int min, int max) {
    int choice = 0;
    do {
      try {
        choice = Integer.parseInt(kb.nextLine());
        if (choice < min || choice > max) {
          throw new IllegalArgumentException();
        }
      } catch (InputMismatchException | IllegalArgumentException e) {
        System.out.printf("Please enter a number between %d and %d\n", min, max);
      }
    } while (choice < min || choice > max);
    return choice;
  }
}
