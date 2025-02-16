package fizzbuzz.rules;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BuzzRuleTest {
    private BuzzRule buzzRule;

    @BeforeEach
    public void setUp() {
        buzzRule = new BuzzRule();
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25})
    void ruleAppliesToMultiplesOfFive(int input) {
        assertTrue(buzzRule.appliesTo(input));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 7})
    void ruleDoesNotApplyToNonMultiplesOfFive(int input) {
        assertFalse(buzzRule.appliesTo(input));
    }

    @Test
    void resultIsBuzz() {
        assertEquals("Buzz", buzzRule.getResult());
    }

}