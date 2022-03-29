import com.imit.tasks.fourth.LinearFunction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinearFunctionTest {

    @Test
    public void linearFunNormTest() {
        LinearFunction linearFunction = new LinearFunction(2, 5, 0, 100);
        assertEquals(15, linearFunction.getValue(5), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void linearFunOutBorderRightTest() {
        LinearFunction linearFunction = new LinearFunction(2, 5, 0, 100);
        linearFunction.getValue(101);
    }

    @Test(expected = IllegalArgumentException.class)
    public void linearFunOutBorderLeftTest() {
        LinearFunction linearFunction = new LinearFunction(2, 5, 0, 100);
        linearFunction.getValue(-10);
    }
}
