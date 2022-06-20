package Dates;


import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Date {

    
    public static void main(String args[]) {
    
       Calendar c = Calendar.getInstance();
       c.set(2022, Calendar.JUNE, 17);
       java.util.Date data = c.getTime();
       
       DateFormat f = DateFormat.getDateInstance();
       System.out.println(f.format(data));
       
       f = DateFormat.getDateTimeInstance();
       System.out.println(f.format(data));
       
       f =  DateFormat.getTimeInstance();
       System.out.println(f.format(data));
       
        f =  DateFormat.getDateTimeInstance(1, 2, Locale.ENGLISH);
       System.out.println(f.format(data));
       
        f =  DateFormat.getTimeInstance(DateFormat.FULL);
       System.out.println(f.format(data));
       
        f =  DateFormat.getTimeInstance(DateFormat.SHORT);
       System.out.println(f.format(data));
    }
}
