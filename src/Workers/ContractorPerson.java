package Workers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContractorPerson extends Person implements IPersonalisable {
  private double hourlyRate;
  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
  PersonOperations ops;
  
  public ContractorPerson (String fName, String sName, String dob){
    super(fName, sName, dob,PayCycle.MONTHLY);
    setContractor(true);
    addToWorkerList();  //add to contractors list
    }
    public void setRate(double rate){
        hourlyRate = rate;
    }
    public double getRate(){
        return hourlyRate;
    }
    @Override
    public void addToWorkerList() {
       ops.addContractorWorker(this);
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
    public String getPayCycle() {
        return paymentCycle;
    }

  
    @Override
    public String getDOB() {
        return super.getDOB();
    }

    @Override
    public double getBaseSalary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}