package socks;

import socks.specialoccasion.ChineseNewYear;
import socks.specialoccasion.EasterSunday;
import socks.specialoccasion.Eid;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class SocksApplication {
    private static final int YEAR = 2013;

    public static void main(String[] args) {
        int result = calculateUniqueSockPairsForYear(YEAR);
        System.out.println("The number of socks needed for " + YEAR + " is: " + result);

        printSpecialOccasionDays(YEAR);
    }

    static int calculateUniqueSockPairsForYear(int year) {
        Set<String> uniqueSocks = new HashSet<>();

        LocalDate date = LocalDate.of(year, 1, 1);
        LocalDate endOfYear = LocalDate.of(year, 12, 31);

        while (!date.isAfter(endOfYear)) {
            String dayOfWeek = date.getDayOfWeek().toString();
            int dayOfMonth = date.getDayOfMonth();

            String sockPair = dayOfWeek + " " + dayOfMonth;
            uniqueSocks.add(sockPair);

            date = date.plusDays(1);
        }

        return uniqueSocks.size();
    }

    public static void printSpecialOccasionDays(int year) {
        LocalDate chineseNewYear = new ChineseNewYear().calculate(year);
        LocalDate eid = new Eid().calculate(year);
        LocalDate easterSunday = new EasterSunday().calculate(year);

        System.out.println("Chinese New Year: " + getDayLabel(chineseNewYear));
        System.out.println("Eid: " + getDayLabel(eid));
        System.out.println("Easter Sunday: " + getDayLabel(easterSunday));
    }

    private static String getDayLabel(LocalDate date) {
        String dayOfWeek = date.getDayOfWeek().toString();
        int dayOfMonth = date.getDayOfMonth();
        return dayOfWeek + " " + dayOfMonth;
    }
}
