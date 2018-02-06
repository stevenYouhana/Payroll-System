package Objectives;

import Objectives.ReportHolder;
import Workers.PayCycle;
import static java.lang.System.out;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Report {
    String name;
    double amount;
    //Date salariedPayDate  = new Date(); REWORK
    Date contractorPayDate = new Date();
    PayCycle payCycle;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    ReportHolder stackHolder = new ReportHolder();
    MessageBox message;
    //pay cycle
    public Report(String name, double payment,PayCycle payCycle){
        this.name = name;
        this.amount = payment;
        this.payCycle = payCycle;
    }
    //used for contractor pay add
    public Report(String name, double payment,PayCycle payCycle,String contractorPayDate){
        this.name = name;
        this.amount = payment;
        this.payCycle = payCycle;
        try{
            this.contractorPayDate = sdf.parse(contractorPayDate);
        }
        catch(ParseException pe){
            pe.getStackTrace();
        }
    }
    public Report(){
        
    }
    //add contractor Payments
    public void addContractorPayment(javax.swing.JTextField txtRate,
            javax.swing.JTextField txtHours,javax.swing.JTextField txtStartPay){
        try{
            if(txtStartPay.getText().isEmpty()){
                message = new MessageBox(this,"Enter a valid date","Announcement",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            ReportHolder rH = new ReportHolder(new Report(Objectives.StaffInfo.selectedStaff,Double.parseDouble( 
                txtRate.getText())*Double.parseDouble(txtHours.getText()),PayCycle.MONTHLY,txtStartPay.getText()),PayCycle.MONTHLY);
            out.println(contractorPayDate.toString());
            new Operations(rH);
            message = new MessageBox(this,"Contract payment of $"+txtRate.getText()+
                    " was added", "Announcemet",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(NumberFormatException nfe){
            if(txtHours.getText().isEmpty()){
             message = new MessageBox(this,"You haven't specified hours\n"+
                     nfe.getMessage(),"Warning",JOptionPane.ERROR_MESSAGE);               
            }
            else if(!(CheckNumeric.isNumeric(txtHours.getText()))){
                message = new MessageBox(this,"eneter a valid hours number",
                        "Announcement",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
             message = new MessageBox(this,"please inter a valid houre value\n"+
                     nfe.getMessage(),"Warning",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e){
            message = new MessageBox(this,e.getMessage(),"Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

// USE ReportHolder toString() instead!
    @Override
    public String toString(){
        return name+" was paid $"+amount+" on the ";//go to ReportHolder
    }
}
