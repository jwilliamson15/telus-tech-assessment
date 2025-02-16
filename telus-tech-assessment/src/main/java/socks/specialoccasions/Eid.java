package socks.specialoccasions;

import java.time.LocalDate;
import java.time.Month;

public class Eid implements SpecialOccasion {

    @Override
    public LocalDate calculate(int year) {
        // Known dates for some years
        switch (year) {
            case 2013: return LocalDate.of(2013, Month.AUGUST, 8);
            case 2014: return LocalDate.of(2014, Month.JULY, 28);
            case 2015: return LocalDate.of(2015, Month.JULY, 17);
            case 2016: return LocalDate.of(2016, Month.JULY, 6);
            case 2017: return LocalDate.of(2017, Month.JUNE, 25);
            case 2018: return LocalDate.of(2018, Month.JUNE, 15);
            case 2019: return LocalDate.of(2019, Month.JUNE, 4);
            case 2020: return LocalDate.of(2020, Month.MAY, 24);
            default:
                LocalDate ramadanStart = LocalDate.of(year, Month.MAY, 15); // Ramadan start
                return ramadanStart.plusDays(30); // Add 30 days for Eid
        }
    }
}
