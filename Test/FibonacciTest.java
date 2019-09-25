import junit.framework.TestCase;

public class FibonacciTest extends TestCase {
// lav test på 8 forskellige tal
    /*
    1
    5
    -7
    -10
    12
    8
    -3
    -9
     */
    public void testBeregn() {
        int resultatPlus = Fibonacci.beregn(1);
        assertEquals(1, resultatPlus);
    }

    public void testBeregnPlus5() {
        int resultatPlus = Fibonacci.beregnPlus5(5);
        assertEquals(5, resultatPlus);
    }

    public void testBeregnMinus7() {
        int resultatMinus = Fibonacci.beregnMinus7(7);
        assertEquals(-7, resultatMinus);
    }
    public void testBeregnMinus10() {
        int resultatMinus = Fibonacci.beregnMinus10(10);
        assertEquals(-10, resultatMinus);
    }
    public void testBeregnPlus12() {
        int resultatPlus = Fibonacci.beregnPlus12(12);
        assertEquals(12, resultatPlus);
    }
    public void testBeregnPlus8() {
        int resultatPlus = Fibonacci.beregnPlus8(8);
        assertEquals(8, resultatPlus);
    }
    public void testBeregnMinus3() {
        int resultatMinus = Fibonacci.beregnMinus3(3);
        assertEquals(3, resultatMinus);
    }
    public void testberegnMinus9() {
        int resultatMinus = Fibonacci.beregnMinus9(9);
        assertEquals(9, resultatMinus);
    }


}

