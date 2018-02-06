package Workers;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;

public class SalariedPerson extends Person implements IPersonalisable {
    private Date startedWorking;
    private double baseSalary;  //pre set
    private double bonus;   //edittid on form
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private boolean isCEO = false;
    private PayCycle payCycle;
    PersonOperations ops;

    public SalariedPerson(String fName,String sName,String dob,PayCycle paymentCycle,
            String startedWorking){
        super(fName,sName,dob,paymentCycle);
        //setting start date
        try{
            this.startedWorking = sdf.parse(startedWorking);           
        }
        catch(ParseException pe){
            pe.getStackTrace();
        }
        addToWorkerList();  //added to contractors list
    }
    
    public SalariedPerson(){
        
    }
    public void setBaseSalary(double bSalary){
        baseSalary = bSalary;
    }
    public void updateBonus(double amount){
        bonus = amount;
    }
    public double checkBonus(){
        return bonus;
    }
    public String getStartDate(){


        return startedWorking.toString();
    }

    @Override
    public void addToWorkerList() {
        ops.addSalariedWorker(this);
    }
    @Override
    public String getPersonFullName(){
        return super.getPersonFullName();
    }
    @Override
    public String getManagerName(){
        return super.getManagerName();
    }
    @Override
    public String toString(){
        return super.toString()+" has a bonus of $"+bonus+"\n";
    }

    @Override
    public String getPayCycle() {
        return paymentCycle;
    }

    @Override
    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public String getDOB() {
        return super.getDOB();
    }



}
