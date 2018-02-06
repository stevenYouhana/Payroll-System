package Objectives;

import Workers.PayCycle;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateHolder implements Runnable {
    static Calendar monthlyDate;
    static Calendar fortDate;
    static Report report = new Report();
    static Operations ops = new Operations();
    void setStartDates(){
        monthlyDate = new GregorianCalendar(2015,01,01);
        fortDate = new GregorianCalendar(2015,01,01);
    }

    public static void setMonthly(){
        monthlyDate.add(Calendar.MONTH, 1);
    }
    public static void setFortnightly(){
       fortDate.add(Calendar.DAY_OF_WEEK, 14); 
    }
    public static Date getMonthlyDate(){
        return (Date)monthlyDate.getTime();
    }
    public static Date getFortnightlyDate(){
        return (Date)fortDate.getTime();
    }
    
    //set first date
    @Override
    public void run() {
        setStartDates();
    }
    
}
