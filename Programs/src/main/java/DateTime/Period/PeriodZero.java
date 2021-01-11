package DateTime.Period;

import java.time.Period;

public class PeriodZero {
    public static void main(String [] args) {
        Period period = Period.of(1,0,1);
        System.out.println(period);
    }
}
