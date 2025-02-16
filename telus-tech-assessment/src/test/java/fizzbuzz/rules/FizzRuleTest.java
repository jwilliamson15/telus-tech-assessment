package fizzbuzz.rules;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzRuleTest {
    private FizzRule fizzRule;

    @BeforeEach
    public void setUp() {
        fizzRule = new FizzRule();
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    void ruleAppliesToMultiplesOfThree(int input) {
        assertTrue(fizzRule.appliesTo(input));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 7})
    void ruleDoesNotApplyToNonMultiplesOfThree(int input) {
        assertFalse(fizzRule.appliesTo(input));
    }

    @Test
    void resultIsFizz() {
        assertEquals("Fizz", fizzRule.getResult());
    }

}