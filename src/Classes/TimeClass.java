
package Classes;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author Joynal Abedin
 * 28-Jul-2013
 */


public class TimeClass {
    
public static void test(long time){
    //while(true){
        try
        {
            Thread.sleep(time);
            System.out.println("1 more sec");
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
  
}    
public static Date covDate(Date Userdate){
     SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        try
        {
            String getDate = sdf.format(Userdate.getDate());
            Date date = sdf.parse(getDate);
            System.out.println(date.getTime());
            
            long conv = date.getTime();
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTimeInMillis(conv);
            sdf.format(cal.getTime());
           
         System.out.println( sdf.format(cal.getTime()));
        }
        catch (ParseException ex)
        {
            ex.printStackTrace();
        }
        return Userdate;
    }

public static void main(String args[]){
    try
    {
        //    long p = System.currentTimeMillis();
        //    test(10 * 1000);
        //   
        //    System.out.println((System.currentTimeMillis()-p)/1000);
        //    System.out.println(System.currentTimeMillis());
        //     
        //    int time = 0;
        //    Date dt = new Date("13-Aug-2013");
        //    System.out.println(covDate(dt));
            
            Date dt = new Date();
            System.out.println("Date is: "+dt);
            
            System.out.println("Milliseconds since January 1, 1970, 00:00:00 GMT : "
                              + dt.getTime());
         
            // another way of converting date and time 
                      
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                sdf.setTimeZone(TimeZone.getTimeZone("UTC"));

                String inputString = "00:01:30.500";

                Date date = sdf.parse("1970-01-01 " + inputString);
                System.out.println("in milliseconds: " + date.getTime());   
    }
    catch (ParseException ex)
    {
        ex.printStackTrace();
    }
    
}

}
