import com.imit.tasks.fourth.ExpFunction;
import com.imit.tasks.fourth.LinearFunction;
import com.imit.tasks.fourth.RationalFunction;
import com.imit.tasks.fourth.SumFunctional;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumFunctionTest {
    @Test
    public void sumFunctionLinearTest() {
        LinearFunction linearFunction = new LinearFunction(1, 1, 2, 6);
        SumFunctional<LinearFunction> sumFunctional = new SumFunctional<>();
        assertEquals(15, sumFunctional.calculate(linearFunction), 0.01);
    }

    @Test
    public void sumFunctionExpTest() {
        ExpFunction expFunction = new ExpFunction(1, 2, 5, 5);
        SumFunctional sumFunctional = new SumFunctional();
        assertEquals(451.23, sumFunctional.calculate(expFunction), 0.01);
    }

    @Test
    public void sumFunctionRationalTest() {
        RationalFunction rationalFunction = new RationalFunction(1, 2, 3, 1, 3, 5);
        SumFunctional sumFunctional = new SumFunctional();
        assertEquals(1.39, sumFunctional.calculate(rationalFunction), 0.01);
    }
}
