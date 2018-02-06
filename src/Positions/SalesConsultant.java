package Positions;

import Workers.ContractorPerson;
import Workers.PersonOperations;

public class SalesConsultant extends ContractorPerson implements ITitle {
    private final String POSITION_TITLE = "Sales Consultant";
    private final double RATE = 27.5;
    private final String MANAGER_NAME = "Michael Brown";
    PersonOperations ops = new PersonOperations();
    
    public SalesConsultant(String fName, String sName, String dob){
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
