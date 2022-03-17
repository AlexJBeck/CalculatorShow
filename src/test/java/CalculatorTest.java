import org.junit.jupiter.api.Assertions;
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
        Assertions.assertEquals(7, Calculator.addition(3,4));
    }

    @org.junit.jupiter.api.Test
    void subtraction() {
        Assertions.assertEquals(1, Calculator.subtraction(4,3));
    }

    @org.junit.jupiter.api.Test
    void mult() {
        Assertions.assertEquals(12, Calculator.mult(3,4));
    }


    @org.junit.jupiter.api.Test
    void mult1() {
        Assertions.assertEquals(12, Calculator.mult(3,4));
    }

}
