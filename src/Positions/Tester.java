package Positions;

import Workers.ContractorPerson;
import Workers.PersonOperations;

public class Tester extends ContractorPerson implements ITitle{
    private final String POSITION_TITLE = "Tester";
    private final double RATE = 25.0;
    private final String MANAGER_NAME = "Charlotte Hond";
    PersonOperations ops = new PersonOperations();
    
    public Tester(String fName, String sName, String dob){
        super(fName,sName,dob);
        this.setPosition();
        this.setHourelyRate();
        addToPersonList(this);
        setManager();
    }

    @Override
    public void setPosition() {
       super.setPosition(POSITION_TITLE);
    }

    @Override
    public void setBasedSalary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setManager() {
        super.setManagerName(MANAGER_NAME);
    }

    @Override
    public void addToPersonList(Object person) {
        ops.getPersonList().add(person);
    }

    @Override
    public void setHourelyRate() {
        setRate(RATE);
    }
}
