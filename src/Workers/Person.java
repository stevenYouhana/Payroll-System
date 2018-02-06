package Workers;

import java.util.ArrayList;

/**
 *
 * @author Steven
 */
public abstract class Person {
    private String fName;
    private String sName;
    private String dob;
    private String position;
    String paymentCycle;
    private String manager; //every person has a manager
    
    public Person(String fName,String sName,String dob,PayCycle paymentCycle){
        this.fName = fName;
        this.sName = sName;
        this.dob = dob;
        this.paymentCycle = setPaymentCycle(paymentCycle); 
    }
    public Person(){}//used in Manager
    public String setPaymentCycle(PayCycle cycle){
        return cycle.toString();
    }
    public abstract void addToWorkerList();
    public void setContractor(boolean b){
        //isContractor = b;
    }
    public void setPosition(String p){
        position = p;
    }   
    public void setManagerName(String name){
        manager = name;
    }
    public String getPosition(){
        return position;
    }
    public String getManagerName(){
        return manager;
    }
    public String getPersonFullName(){
        return fName+" "+sName;
    }
    public String getDOB(){
        return dob;
    }
    @Override
    public String toString(){
      return fName+" "+sName;
    }
}
