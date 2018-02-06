package Positions;

import Workers.PayCycle;
import Workers.SalariedPerson;
import Workers.PersonOperations;

public class CEO extends SalariedPerson implements ITitle {
    private final String POSITION_TITLE = "CEO";
    private final double BASED_SALARY = 100000.0;
    PersonOperations ops = new PersonOperations();
    
    public CEO(String fName,String sName,String dob,PayCycle paymentCycle,
            String startedWorking){
        super(fName,sName,dob,paymentCycle,startedWorking);
        this.setPosition();
        this.setBasedSalary();
        addToPersonList(this);
        setManager();
    }
  
    @Override
    public void addToPersonList(Object person) {
        ops.getPersonList().add(person);
    }

    @Override
    public void setPosition() {
        super.setPosition(POSITION_TITLE);
    }
    @Override
    public void setBasedSalary(){
        super.setBaseSalary(BASED_SALARY);
    }

    @Override
    public void setManager() {
        super.setManagerName("");
    }

    @Override
    public void setHourelyRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
