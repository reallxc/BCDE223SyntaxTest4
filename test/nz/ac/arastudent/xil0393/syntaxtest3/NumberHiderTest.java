package nz.ac.arastudent.xil0393.syntaxtest3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberHiderTest {
    private NumberHider aNumberHider;
    @Test
    public final void testLowGuess() {
        aNumberHider = new NumberHider(42);
        String expected = "Try higher";
        String actual = aNumberHider.makeGuess(1);
        String errorMessage = "Expected " + expected + " but got " + actual; assertEquals(expected, actual, errorMessage );
    }
    @Test
    public final void testHighGuess() {
        aNumberHider = new NumberHider(42);
        String expected = "Try lower";
        String actual = aNumberHider.makeGuess(43);
        String errorMessage = "Expected " + expected + " but got " + actual; assertEquals(expected, actual, errorMessage );
    }
    @Test
    public final void testCorrectGuess() {
        aNumberHider = new NumberHider(42);
        String expected = "You got it in 1 trials!";
        String actual = aNumberHider.makeGuess(42);
        String errorMessage = "Expected " + expected + " but got " + actual; assertEquals(expected, actual, errorMessage );
    }
    @Test
    public final void testGuessCounting() {
        aNumberHider = new NumberHider(42);
        String expected = "You got it in 3 trials!"; aNumberHider.makeGuess(40);
        aNumberHider.makeGuess(41);
        String actual = aNumberHider.makeGuess(42);
        String errorMessage = "Expected " + expected + " but got " + actual; assertEquals(expected, actual, errorMessage );
    }
}