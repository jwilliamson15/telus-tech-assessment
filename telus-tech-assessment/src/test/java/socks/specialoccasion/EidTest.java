package socks.specialoccasion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class EidTest {
    SpecialOccasion eid;

    @BeforeEach
    void setup() {
        eid = new Eid();
    }

    @Test
    void calculateEidIn2013() {
        LocalDate actualEid2013 = LocalDate.of(2013, Month.AUGUST, 8);
        LocalDate result = eid.calculate(2013);

        assertEquals(actualEid2013, result);
    }

    @Test
    void calculateEidIn2014() {
        LocalDate actualEid2014 = LocalDate.of(2014, Month.JULY, 28);
        LocalDate result = eid.calculate(2014);

        assertEquals(actualEid2014, result);
    }

    @Test
    void calculateEidIn2015() {
        LocalDate actualEid2015 = LocalDate.of(2015, Month.JULY, 17);
        LocalDate result = eid.calculate(2015);

        assertEquals(actualEid2015, result);
    }

    @Test
    void calculateEidIn2016() {
        LocalDate actualEid2016 = LocalDate.of(2016, Month.JULY, 6);
        LocalDate result = eid.calculate(2016);

        assertEquals(actualEid2016, result);
    }

    @Test
    void calculateEidIn2017() {
        LocalDate actualEid2017 = LocalDate.of(2017, Month.JUNE, 25);
        LocalDate result = eid.calculate(2017);

        assertEquals(actualEid2017, result);
    }

    @Test
    void calculateEidIn2018() {
        LocalDate actualEid2018 = LocalDate.of(2018, Month.JUNE, 15);
        LocalDate result = eid.calculate(2018);

        assertEquals(actualEid2018, result);
    }

    @Test
    void returnsJuneFourteenthIfNotKnow() {
        int year = 2024;
        LocalDate expectedApproximateDate = LocalDate.of(year, Month.MAY, 15).plusDays(30);
        LocalDate result = eid.calculate(year);

        assertEquals(expectedApproximateDate, result);
    }

}