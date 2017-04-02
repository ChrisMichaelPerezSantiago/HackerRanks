

/*
    Problem: Time Conversion
    
    Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

    Note: Midnight is  12:00:00AM on a 12-hour clock, and 00:00:00 on a 12-hour clock. 
    Noon is 12:00:00 on a 12-hour clock, and 12:00:00 on a 24-hour clock.

    Input Format:
        A single string containing a time in 12-hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM), 
        where 01 <= hh <= 12 and 00 <= mm,ss <= and.

    @Author Chris M. Perez
    @Date   4/2/2017
*/
package Warmup;
import java.util.Scanner;


public class TimeConversion {
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        String time;
        int militaryTime;
        int hour;
        int minute;
        int seconds;
        int temp;
        
        time = console.next();
        
        hour = Integer.parseInt(time.substring(0,time.indexOf(":")));
        minute = Integer.parseInt(time.substring(time.indexOf(":")+1,time.lastIndexOf(":")));
        seconds = Integer.parseInt(time.substring(time.lastIndexOf(":")+1, time.lastIndexOf(":") + 3));
        
        
        if(hour == 12) { militaryTime = 0; }
        else { militaryTime = hour; }
        
        if(time.toLowerCase().contains("pm")){ temp = 12; }
        else { temp = 0; }
        
        System.out.println(String.format("%02d:%02d:%02d", (militaryTime + temp), minute, seconds));

    }
}
