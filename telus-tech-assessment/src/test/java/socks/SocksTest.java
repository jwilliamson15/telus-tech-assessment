package socks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import static socks.Socks.calculateUniqueSockPairsForYear;

class SocksTest {

    @ParameterizedTest
    @ValueSource(ints = {2011, 2012, 2013}) //2011 is non-leap year, 2012 is a leap year and 2013 is asked in requirements
    void uniqueNumberOfSocksForTheYear() {
        int expectedPairs = 216;
        int actualPairs = calculateUniqueSockPairsForYear(2011);
        assertEquals(expectedPairs, actualPairs);
    }

    @Test
    void specialOccasionDaysArePrinted() {
        final PrintStream standardOut = System.out;
        final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        Socks.printSpecialOccasionDays(2013);
        final String chineseNewYearPrintString = "Chinese New Year: SUNDAY 10";
        final String eidPrintString = "Eid: THURSDAY 8";
        final String easterSundayPrintString = "Easter Sunday: SUNDAY 31";

        assertTrue(outputStreamCaptor.toString().contains(chineseNewYearPrintString));
        assertTrue(outputStreamCaptor.toString().contains(eidPrintString));
        assertTrue(outputStreamCaptor.toString().contains(easterSundayPrintString));

        System.setOut(standardOut);
    }
}