
package Objectives;

import Objectives.BonusWork.Bonus;
import Workers.PayCycle;
import Workers.SalariedPerson;
import static java.lang.System.out;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class ReportsFrame {
    static Date firstDate = new Date();
    static Date secondDate = new Date();
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    ReportHolder ops = new ReportHolder();
    DefaultComboBoxModel personModel = new DefaultComboBoxModel();
    //set dates
    public ReportsFrame(String firstDate, String secondDate){
        try{
             this.firstDate = sdf.parse(firstDate);
             this.secondDate = sdf.parse(secondDate);
        }
        catch(ParseException pe){
             pe.getStackTrace();
        }
        out.println(this.firstDate+" ----- "+this.secondDate);
    }
    public ReportsFrame(JComboBox personBox){
        populatePersonModel();
        personBox.setModel(personModel);
    }
    public ReportsFrame(){
        
    }
    public String payCycleBased(PayCycle cycle){
        String result = "";
        for(int i=0; i<Operations.holder.size(); i++){
            if(ReportHolder.reports.get(i).payCycle == cycle){
                result += Operations.holder.get(i).getReports().get(i)+" "+
                        Operations.holder.get(i);
            }
        }
        return result;
    }
    void populatePersonModel(){
        Workers.PersonOperations global = new Workers.PersonOperations();
        for(int i=0; i<global.getPersonList().size(); i++){
            personModel.addElement(global.getPersonList(i).getPersonFullName());
        } 
    }
    public String byPerson(String name){
        String result = "";
        for(int i=0; i<Operations.holder.size(); i++){
            if(Operations.holder.get(i).getReports().get(i).name.equals(name)){
                result += ReportHolder.reports.get(i)+Operations.holder.get(i).toString();
            }
        }
        return result;
    }
    public String workOutPeriod(){
        String display = "";
        int i = 0;
        for(ReportHolder stackObject : Operations.holder){
            if(stackObject.getDate().compareTo(firstDate) > 0 &&
                    stackObject.getDate().compareTo(secondDate) < 0){
                display += stackObject.getReports().get(i)+stackObject.toString();
                i++;
            }
        }
        return display;
    }
    public String bonusReports(){
        String result = "";
        Bonus bonus = new Bonus();
        for(SalariedPerson person : bonus.getBonusList()){
            result += person;
        }
        return result;
    }
}
