package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import code.StringCalc;

public class StringCalculatorTest {
	
	

    private StringCalc stringCalc;

    @BeforeEach
    public void init() {
        stringCalc = new StringCalc();
    }

    @Test
    public void singleValueShouldReturnItself() throws Exception {
        assertEquals(10, stringCalc.add("10"));
    }

    @Test
    public void twoNumbersReturnsSum() throws Exception {
        assertEquals(10, stringCalc.add("5,5"));
    }

    @Test
    public void threeNumbersReturnsSum() throws Exception {
        assertEquals(15, stringCalc.add("5,5,5"));
    }

    @Test
    public void twoNumbersnewLineReturnsSum() throws Exception {
        assertEquals(15, stringCalc.add("5\n5,5"));
    }

    @Test
    void testExpectedException() {

        Assertions.assertThrows(Exception.class, () -> {
            assertEquals(15, stringCalc.add("-1"));
        });
    }
}
