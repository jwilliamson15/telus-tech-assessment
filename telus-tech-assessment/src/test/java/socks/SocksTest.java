package socks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
}