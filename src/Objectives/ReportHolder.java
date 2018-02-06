package Objectives;

import Workers.PayCycle;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Date;

public class ReportHolder {
    static ArrayList<Report> reports = new ArrayList(20);
    public Date date = new Date();
    PayCycle cycle;
    public ReportHolder(Report report, PayCycle cycle){
        reports.add(report);
        if(cycle == PayCycle.FORTNIGHTELY){
            date = DateHolder.getFortnightlyDate();
        }
        else{
            date = DateHolder.getMonthlyDate();
        }
        this.cycle = cycle;
    }
    public ReportHolder(){
        
    }
    public ArrayList<Report> getReports(){
        return reports;
    }
    public Date getDate(){
        return date;
    }
    @Override
    public String toString(){
        return date.toString()+" Payment Period: "+cycle+"\n";
    }

}
