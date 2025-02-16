package fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzRuleTest {
    private FizzBuzzRule fizzBuzzRule;

    @BeforeEach
    public void setUp() {
        fizzBuzzRule = new FizzBuzzRule();
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    void ruleAppliesToMultiplesOfThreeAndFive(int input) {
        assertTrue(fizzBuzzRule.appliesTo(input));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 7})
    void ruleDoesNotApplyToNonMultiplesOfThreeAndFive(int input) {
        assertFalse(fizzBuzzRule.appliesTo(input));
    }

    @Test
    void resultIsFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzzRule.getResult());
    }

}