package socks.specialoccasion;

import java.time.LocalDate;
import java.time.Month;

public class ChineseNewYear implements SpecialOccasion {
    @Override
    public LocalDate calculate(int year) {
        //use known lookup for some years, otherwise approximate
        switch (year) {
            case 2013: return LocalDate.of(2013, Month.FEBRUARY, 10);
            case 2014: return LocalDate.of(2014, Month.JANUARY, 31);
            case 2015: return LocalDate.of(2015, Month.FEBRUARY, 19);
            case 2016: return LocalDate.of(2016, Month.FEBRUARY, 8);
            case 2017: return LocalDate.of(2017, Month.JANUARY, 28);
            case 2018: return LocalDate.of(2018, Month.FEBRUARY, 16);
            case 2019: return LocalDate.of(2019, Month.FEBRUARY, 5);
            case 2020: return LocalDate.of(2020, Month.JANUARY, 25);
            default:
                return LocalDate.of(year, Month.FEBRUARY, 10); // Approximation taken from 2013
        }
    }
}
