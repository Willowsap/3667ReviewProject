package birds;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecoyDuckTest {
  public static final String DISPLAY_OUTPUT = "A stunning wooden duck\n";
  public static final String SWIM_OUTPUT = "Swimming about\n";
  public static final String QUACK_OUTPUT = "";
  public static final String FLY_OUTPUT = "";

  private DecoyDuck obj;
  private PrintStream oldOut;
  private ByteArrayOutputStream baos;

  @BeforeEach
  public void beforeEach() {
    obj = new DecoyDuck();
    this.oldOut = System.out;
    this.baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));
  }

  @AfterEach
  public void afterEach() {
    System.setOut(oldOut);
  }

  @Test
  public void testQuack() {
    obj.quack();
    assertEquals(QUACK_OUTPUT, getOutput());
  }

  @Test
  public void testFly() {
    obj.fly();
    assertEquals(FLY_OUTPUT, getOutput());
  }

  @Test
  public void testDisplay() {
    obj.display();
    assertEquals(DISPLAY_OUTPUT, getOutput());
  }

  @Test
  public void testSwim() {
    obj.swim();
    assertEquals(SWIM_OUTPUT, getOutput());
  }

  @Test
  public void testSetFlyBehavior() {
    obj.setFlyBehavior(new MockFlyBehavior());
    obj.fly();
    assertEquals(MockFlyBehavior.FLY_OUTPUT, getOutput());
  }

  @Test
  public void testSetQuackBehavior() {
    obj.setQuackBehavior(new MockQuackBehavior());
    obj.quack();
    assertEquals(MockQuackBehavior.QUACK_OUTPUT, getOutput());
  }

  private String getOutput() {
    System.out.flush();
    return baos.toString().replaceAll("\r", "");
  }

}
