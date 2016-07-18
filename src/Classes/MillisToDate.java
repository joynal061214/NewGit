
package Classes;

import java.util.Calendar;
import java.util.Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * @author Joynal Abedin
 * 04-Aug-2013
 */


public class MillisToDate {
  
    public static void main(String args[]) {
      
       //Converting milliseconds to Date using java.util.Date
       //current time in milliseconds
       long currentDateTime = System.currentTimeMillis();
      
       //creating Date from millisecond
       Date currentDate = new Date(currentDateTime);
      
       //printing value of Date
       System.out.println("current Date: " + currentDate);
      
       DateFormat df = new SimpleDateFormat("dd:MM:yy:HH:mm:ss");
      
       //formatted value of current Date
       System.out.println("Milliseconds to Date: " + df.format(currentDate));
      
       //Converting milliseconds to Date using Calendar
       Calendar cal = Calendar.getInstance();
       cal.setTimeInMillis(currentDateTime);
       System.out.println("Milliseconds to Date using Calendar:"
               + df.format(cal.getTime()));
      
       //copying one Date's value into another Date in Java
       Date now = new Date();
       Date copiedDate = new Date(now.getTime());
      
       System.out.println("original Date: " + df.format(now));
       System.out.println("copied Date: " + df.format(copiedDate));
    }
      
}


//Read more: http://javarevisited.blogspot.com/2012/12/how-to-convert-millisecond-to-date-in-java-example.html#ixzz2ayTjscuT
