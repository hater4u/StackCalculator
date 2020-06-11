import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import Exception.CalculatorException;
import static junit.framework.TestCase.assertEquals;

public class FullTests {
    private Context context;

    @Before
    public void setUp() {
        context = new Context();
    }

    @Test
    public void defineTest() throws CalculatorException {
        Context expected = new Context();
        expected.put("a", 5.5);
        String[] args = new String[]{"a", "5.5"};

        Define define = new Define();
        define.action(args, context);

        assertEquals(5.5, context.get("a"));
    }

    @Test
    public void divisionTest() throws CalculatorException {
        String[] args = new String[0];
        context.push(884.0);
        context.push(17.0);

        Division division = new Division();
        division.action(args, context);

        assertEquals(52.0, context.peek());
    }

    @Test
    public void minusTest() throws CalculatorException {
        String[] args = new String[0];
        context.push(884.6);
        context.push(237.0);

        Minus minus = new Minus();
        minus.action(args, context);

        assertEquals(647.6, context.peek());
    }

    @Test
    public void multTest() throws CalculatorException {
        String[] args = new String[0];
        context.push(11.0);
        context.push(34.0);

        Multiplication multiplication = new Multiplication();
        multiplication.action(args, context);

        assertEquals(374.0, context.peek());
    }

    @Test
    public void plusTest() throws CalculatorException {
        String[] args = new String[0];
        context.push(884.6);
        context.push(237.0);

        Plus plus = new Plus();
        plus.action(args, context);

        assertEquals(1121.6, context.peek());
    }

    @Test
    public void sqrtTest() throws CalculatorException {
        String[] args = new String[0];
        context.push(441.0);

        Sqrt sqrt = new Sqrt();
        sqrt.action(args, context);

        assertEquals(21.0, context.peek());
    }

    @Test
    public void fullTests() throws IOException, CalculatorException {
        Calculator calculator = new Calculator(context);

        calculator.calculate("fulltest1.txt");
        assertEquals(3.0, context.peek());

        calculator.calculate("fulltest2.txt");
    }


}
