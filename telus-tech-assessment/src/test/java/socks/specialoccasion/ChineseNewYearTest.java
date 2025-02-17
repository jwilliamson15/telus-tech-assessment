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
    void calculateEasterSundayIn2014() {
        LocalDate actualChineseNewYear2014 = LocalDate.of(2014, Month.JANUARY, 31);
        LocalDate result = chineseNewYear.calculate(2014);

        assertEquals(actualChineseNewYear2014, result);
    }

    @Test
    void calculateEasterSundayIn2015() {
        LocalDate actualChineseNewYear2015 = LocalDate.of(2015, Month.FEBRUARY, 19);
        LocalDate result = chineseNewYear.calculate(2015);

        assertEquals(actualChineseNewYear2015, result);
    }

    @Test
    void calculateEasterSundayIn2016() {
        LocalDate actualChineseNewYear2016 = LocalDate.of(2016, Month.FEBRUARY, 8);
        LocalDate result = chineseNewYear.calculate(2016);

        assertEquals(actualChineseNewYear2016, result);
    }

    @Test
    void calculateEasterSundayIn2017() {
        LocalDate actualChineseNewYear2017 = LocalDate.of(2017, Month.JANUARY, 28);
        LocalDate result = chineseNewYear.calculate(2017);

        assertEquals(actualChineseNewYear2017, result);
    }
    @Test
    void calculateEasterSundayIn2018() {
        LocalDate actualChineseNewYear2018 = LocalDate.of(2018, Month.FEBRUARY, 16);
        LocalDate result = chineseNewYear.calculate(2018);

        assertEquals(actualChineseNewYear2018, result);
    }

    @Test
    void returnsFebTenthIfNotKnow() {
        int year = 2024;
        LocalDate expectedApproximateDate = LocalDate.of(year, Month.FEBRUARY, 10);
        LocalDate result = chineseNewYear.calculate(year);

        assertEquals(expectedApproximateDate, result);
    }
}