package BasicJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.time.format.DateTimeFormatter;
public class dateClass {
    public static void main(String[] args) {
        //old methods not recommended
        Date d=new Date();
        System.out.println(d);
        long time = d.getTime();
        System.out.println(time);
        Calendar c=Calendar.getInstance();//it is a legacy and abstract class
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.getTimeZone());
        //Modern way
        LocalDate ld= LocalDate.now();//date
        System.out.println(ld);
        LocalTime lt=LocalTime.now();//time
        System.out.println(lt);
        LocalDateTime ldt=LocalDateTime.now();//date and time
        System.out.println(ldt);
        //custom date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(now.format(fmt));
        //methods
        LocalDate date = LocalDate.now();
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
    }
}
