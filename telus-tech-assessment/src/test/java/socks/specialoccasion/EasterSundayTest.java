package socks.specialoccasion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class EasterSundayTest {
    SpecialOccasion easterSunday;

    @BeforeEach
    void setUp() {
        easterSunday = new EasterSunday();
    }

    @Test
    void calculateEasterSundayIn2013() {
        LocalDate actualEasterSunday2013 = LocalDate.of(2013, Month.MARCH, 31);
        LocalDate result = easterSunday.calculate(2013);

        assertEquals(actualEasterSunday2013, result);
    }

    @Test
    void calculateEasterSundayIn2017() {
        LocalDate actualEasterSunday2017 = LocalDate.of(2017, Month.APRIL, 16);
        LocalDate result = easterSunday.calculate(2017);

        assertEquals(actualEasterSunday2017, result);
    }

    @Test
    void calculateEasterSundayIn2030() {
        LocalDate actualEasterSunday2030 = LocalDate.of(2030, Month.APRIL, 21);
        LocalDate result = easterSunday.calculate(2030);

        assertEquals(actualEasterSunday2030, result);
    }

}