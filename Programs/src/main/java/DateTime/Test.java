package DateTime;

import java.time.LocalDate;

public class Test {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("2020-08-31");
        System.out.println(date.plusMonths(-6));
    }
}