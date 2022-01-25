package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void noBrackets() {
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("Launchcode"));
    }

    @Test
    public void unBalancedBrackets(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("[unbalanced"));
    }
    /*
    @Test(expected = IllegalArgumentException.class)
    public void invertedBrackets(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("]Lions["));
    }
    */
    @Test
    public void nullString() {
        assertTrue(main.BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void doubleBracket() {
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));
    }

    @Test
    public static void rightSideBracket(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }




}
