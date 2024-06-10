package birds;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class DuckTest {
  private Duck obj;
  private PrintStream oldOut;
  private ByteArrayOutputStream baos;

  @BeforeEach
  public void beforeEach() {
    obj = new MockDuck();
    this.oldOut = System.out;
    this.baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));
  }

  @AfterEach
  public void afterEach() {
    System.setOut(oldOut);
  }

  @Test
  public void testFly() {
    obj.fly();
    assertEquals(MockDuck.FLY_OUTPUT, getOutput());
  }

  private String getOutput() {
    System.out.flush();
    return baos.toString().replaceAll("\r", "");
  }
}
