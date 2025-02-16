package socks.specialoccasions;

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
    void calculateEidIn2017() {
        LocalDate actualEid2017 = LocalDate.of(2017, Month.JUNE, 25);
        LocalDate result = eid.calculate(2017);

        assertEquals(actualEid2017, result);
    }

    @Test
    void returnsJuneFourteenthIfNotKnow() {
        int year = 2024;
        LocalDate expectedApproximateDate = LocalDate.of(year, Month.MAY, 15).plusDays(30);
        LocalDate result = eid.calculate(year);

        assertEquals(expectedApproximateDate, result);
    }

}