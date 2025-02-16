package fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    void returnsFizzForNumbersDivisibleByThree(int integer) {
        String result = fizzBuzz.playFizzBuzz(integer);

        assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20})
    void returnsBuzzForNumbersDivisibleByFive(int integer) {
        String result = fizzBuzz.playFizzBuzz(integer);

        assertEquals("Buzz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    void returnsFizzBuzzForNumbersDivisibleByThreeAndFive(int integer) {
        String result = fizzBuzz.playFizzBuzz(integer);

        assertEquals("FizzBuzz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 7})
    void returnsNumberForNonDivisibleNumbers(int integer) {
        String result = fizzBuzz.playFizzBuzz(integer);

        assertEquals(String.valueOf(integer), result);
    }
}