import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDateTIme {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        System.out.println(date);
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-y HH:mm:ss aa");
        String d1= sdf.format(date);
        System.out.println(d1);
        long timestamp=date.getTime();
        System.out.println(timestamp);
        String d3= sdf.format(timestamp);
        System.out.println("Current time: "+d3);

        String d4="01-08-2021 00:00:00 PM";
        Date thatDay=sdf.parse(d4);
        System.out.println(thatDay);
        System.out.println(sdf.format(thatDay));
        System.out.println("That day timestamp: "+thatDay.getTime());

        Calendar calendar=Calendar.getInstance();
        //calendar.setTime(date);
        calendar.setTime(thatDay);
        calendar.add(Calendar.DATE,-7);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.HOUR,2);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.YEAR,1);
        System.out.println(calendar.getTime());
    }
}
