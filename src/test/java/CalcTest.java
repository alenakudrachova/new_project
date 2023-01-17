package src.test.java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {

    @Test
    public void sumTest() {
        Calc calc = new Calc();
        Assert.assertEquals(calc.sum(3,3), 6, "check operation of sum");
    }

    @Test
    public void subTest() {
        Calc calc = new Calc();
        Assert.assertEquals(calc.sub(7,3), 4, "check operation of subtraction");
    }

    @Test
    public void multiTest() {
        Calc calc = new Calc();
        Assert.assertEquals(calc.multi(2,4), 8, "check operation of multiply");
    }

    @Test
    public void divTest() {
        Calc calc = new Calc();
        Assert.assertEquals(calc.div(10,5), 2, "check operation of division");
    }
}
