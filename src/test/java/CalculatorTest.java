import org.junit.jupiter.api.BeforeEach;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @org.junit.jupiter.api.Test
    void addition() {
        assertEquals(7,calculator.addition(3,4));
    }

    @org.junit.jupiter.api.Test
    void subtraction() {
        assertEquals(1,calculator.subtraction(4,3));
    }

    @org.junit.jupiter.api.Test
    void mult() {
        assertEquals(12,calculator.mult(3,4));
    }
}
