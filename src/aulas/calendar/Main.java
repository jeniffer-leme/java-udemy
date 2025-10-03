package aulas.calendar;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        //utilizando a classe Calendar
        Calendar data = Calendar.getInstance();
        
        System.out.println(data.get(Calendar.DAY_OF_WEEK));
        System.out.println(data.get(Calendar.DAY_OF_MONTH));
        System.out.println(data.get(Calendar.DAY_OF_YEAR));
        
        System.out.printf("%tc\n", data);
        System.out.printf("%tr\n", data);
        System.out.printf("%tD\n", data);
    
        //utilizando a classe Date
        //data corrente
        Date date = new Date();
        System.out.println(date);
    
    }
}
