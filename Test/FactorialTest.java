import junit.framework.TestCase;

public class FactorialTest extends TestCase {
    /* gange test med forskellige tal.
    1 : 5
    2 : 3
    3 : 11
    4 : 9
    5 : -11
    6 : 1000
     */
    int resultat;
    public void testBeregn1() {
        resultat =Factorial.beregn1(5);
        assertEquals(5,resultat);
        System.out.println(resultat);
    }

    public void testBeregn2() {
        resultat = Factorial.beregn2(3);
        assertEquals(3,resultat);
        System.out.println(resultat);
    }

    public void testBeregn3() {
        resultat = Factorial.beregn3(11);
        assertEquals(11,resultat);
        System.out.println(resultat);
    }

    public void testBeregn4() {
        resultat = Factorial.beregn4(9);
        assertEquals(9,resultat);
        System.out.println(resultat);
    }

    public void testBeregn5() {
        resultat = Factorial.beregn5(-11);
        assertEquals(-11,resultat);
        System.out.println(resultat);
    }

    public void testBeregn6() {
        resultat = Factorial.beregn6(1000);
        assertEquals(1000,resultat);
        System.out.println(resultat);
    }
}