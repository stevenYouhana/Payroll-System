package Objectives;

import static Objectives.ReportHolder.*;
import Workers.PayCycle;
import Workers.PersonOperations;
import static java.lang.System.out;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import javax.swing.JOptionPane;

public class CreatePayment {
    //create report item for each payment
    
    PersonOperations ops = new PersonOperations();
    final int FORTNIGHTS_PER_YEAR = 26;
    final int MONTHS_PER_YEAR = 12;
    MessageBox messageBox;
    //Report report = new Report();
    //go through lists
    public void executeMonthly(){
        DateHolder.setMonthly();
        for(int i=0; i<ops.getSalariedWorkers().size(); i++){
            out.println(i);
            if(ops.getSalariedWorkers(i).getPayCycle() == PayCycle.MONTHLY.toString()){
                monthlyPayment(getName(i),getPayment(i));
            }          
        }
        messageBox = new MessageBox(this,"Monthly payment have been added for "+
               DateHolder.getMonthlyDate()," Announcement",JOptionPane.INFORMATION_MESSAGE);
    }
    public void executeFortnightlty(){
        DateHolder.setFortnightly();
        for(int i=0; i<ops.getSalariedWorkers().size(); i++){
            out.println(i);
            if(ops.getSalariedWorkers(i).getPayCycle() == PayCycle.FORTNIGHTELY.toString()){
                fortnightlyPayment(getName(i),getPayment(i));
            }      
        }
        messageBox = new MessageBox(this,"Fortnightly payment have been added for "+
               DateHolder.getFortnightlyDate()," Announcement",JOptionPane.INFORMATION_MESSAGE);
    }
    //create fortnightly payment
    public void monthlyPayment(String name, double payment){
        ReportHolder sHolder = new ReportHolder(new Report(name,payment,PayCycle.MONTHLY),
            PayCycle.MONTHLY);
        new Operations(sHolder);
    }
    
    public void fortnightlyPayment(String name, double payment){
        ReportHolder sHolder = new ReportHolder(new Report(name,payment,PayCycle.FORTNIGHTELY),
            PayCycle.FORTNIGHTELY);
        new Operations(sHolder);
    }
    //retrieve attributes from lists
    String getName(int i){
        return ops.getSalariedWorkers(i).getPersonFullName();
    }
    //return payment for monthly and fortnightely workers
    double getPayment(int i){
        //double payment = 0;
        BigDecimal payment;
        if(ops.getPersonList(i).getPayCycle() == PayCycle.FORTNIGHTELY.toString()){
            payment = new BigDecimal(ops.getSalariedWorkers(i).getBaseSalary()
                    /FORTNIGHTS_PER_YEAR);
        }
        else{
             payment = new BigDecimal(ops.getSalariedWorkers(i).getBaseSalary()
                     /MONTHS_PER_YEAR);
        }
        //return rounded figure to double
        return payment.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

}
