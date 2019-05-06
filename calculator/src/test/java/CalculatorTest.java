import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(7, calculator.add(2, 5));
    }

    @Test
    public void canSubtract(){
        assertEquals(15, calculator.subtract(10, -5));
    }

    @Test
    public void canMultiply(){
        assertEquals(27, calculator.multiply(9, 3));
    }

    @Test
    public void canDivide(){
        assertEquals(0.75, calculator.divide(3.00, 4.00), 0.01);
    }
}
