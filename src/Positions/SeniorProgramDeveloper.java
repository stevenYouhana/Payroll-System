package Positions;

import Workers.Manager;
import Workers.PayCycle;
import Workers.PersonOperations;
import Workers.SalariedPerson;

public class SeniorProgramDeveloper extends SalariedPerson implements ITitle {
    private final String POSITION_TITLE = "Senior Program Developer";
    private final double BASED_SALARY = 75000.0;
    private final String MANAGER_NAME = "Victoria Bell";
    PersonOperations ops = new PersonOperations();
    Manager manager = new Manager();
    
    public SeniorProgramDeveloper(String fName,String sName,String dob,PayCycle paymentCycle,
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
        super.setManagerName(MANAGER_NAME);
    }

    @Override
    public void setHourelyRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}
