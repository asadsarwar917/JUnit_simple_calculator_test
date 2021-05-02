import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	private static final double DELTA = 0.0000001;
  @Test
  public void evaluatesExpression() {
    Calculator calculator = new Calculator();
    double sum = calculator.evaluate("2+3");

    	assertEquals(5.00001, sum,DELTA);
    
  }
}