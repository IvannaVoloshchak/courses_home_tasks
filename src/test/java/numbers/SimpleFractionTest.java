package numbers;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

public class SimpleFractionTest {
    SimpleFraction simpleFraction1= new SimpleFraction(1,3);
    SimpleFraction simpleFraction2= new SimpleFraction(1,4);
    @Test
    public void checkAddSimpleFraction() {
       SimpleFraction resultSF = simpleFraction1.add(simpleFraction2);
       SimpleFraction expectedSF = new SimpleFraction(7, 12);
        Assert.assertEquals("Fraction are not equals", expectedSF, resultSF);
    }
    @Test
    public void checkSubtractSimpleFraction() {
        SimpleFraction resultSF = simpleFraction1.subtract(simpleFraction2);
        SimpleFraction expectedSF = new SimpleFraction(1, 12);
        Assert.assertEquals("Fraction are not equals", expectedSF, resultSF);
    }
    @Test
    public void checkMultiplySimpleFraction() {
        SimpleFraction resultSF = simpleFraction1.multiply(simpleFraction2);
        SimpleFraction expectedSF = new SimpleFraction(1, 12);
        Assert.assertEquals("Fraction are not equals", expectedSF, resultSF);
    }
    @Test
    public void checkDivideSimpleFraction() {
        SimpleFraction resultSF = simpleFraction1.division(simpleFraction2);
        SimpleFraction expectedSF = new SimpleFraction(4, 3);
        Assert.assertEquals("Fraction are not equals", expectedSF, resultSF);
    }

}
