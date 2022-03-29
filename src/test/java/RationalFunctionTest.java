import com.imit.tasks.fourth.LinearFunction;
import com.imit.tasks.fourth.RationalFunction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RationalFunctionTest {
    @Test
    public void rationalFunNormTest() {
        RationalFunction rationalFun = new RationalFunction(1, 2, 2, 0, 0, 100);
        assertEquals(0.7, rationalFun.getValue(5), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void rationalFunOutBorderRightTest() {
        RationalFunction rationalFun = new RationalFunction(1, 2, 2, 0, 0, 100);
        rationalFun.getValue(101);
    }

    @Test(expected = IllegalArgumentException.class)
    public void rationalFunOutBorderLeftTest() {
        RationalFunction rationalFun = new RationalFunction(1, 2, 2, 0, 0, 100);
        rationalFun.getValue(-10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void rationalFunDenominatorZero() {
        RationalFunction rationalFun = new RationalFunction(1, 2, 2, 10, -100, 100);
        rationalFun.getValue(-5);
    }
}
