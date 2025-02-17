package socks.specialoccasion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class ChineseNewYearTest {
    SpecialOccasion chineseNewYear;

    @BeforeEach
    void setup() {
        chineseNewYear = new ChineseNewYear();
    }

    @Test
    void calculateEasterSundayIn2013() {
        LocalDate actualChineseNewYear2013 = LocalDate.of(2013, Month.FEBRUARY, 10);
        LocalDate result = chineseNewYear.calculate(2013);

        assertEquals(actualChineseNewYear2013, result);
    }

    @Test
    void calculateEasterSundayIn2017() {
        LocalDate actualChineseNewYear2017 = LocalDate.of(2017, Month.JANUARY, 28);
        LocalDate result = chineseNewYear.calculate(2017);

        assertEquals(actualChineseNewYear2017, result);
    }

    @Test
    void returnsFebTenthIfNotKnow() {
        int year = 2024;
        LocalDate expectedApproximateDate = LocalDate.of(year, Month.FEBRUARY, 10);
        LocalDate result = chineseNewYear.calculate(year);

        assertEquals(expectedApproximateDate, result);
    }
}