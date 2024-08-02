package DateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {
    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.of(2018, 01, 01);
        LocalDate localDate2 = LocalDate.of(2018, 12, 31);

        Period period=localDate1.until(localDate2);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());

        Period period1=Period.ofDays(10);
        System.out.println(period1.getDays());

        Period period2=Period.ofYears(10);
        System.out.println(period2.toTotalMonths());

        Period period3= Period.between(localDate1,localDate2);  // accepts only dates
        System.out.println(period3.getDays()+" "+ period3.getMonths());

    }
}
