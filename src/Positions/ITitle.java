
package Positions;

import Workers.SalariedPerson;

public interface ITitle {
    public void setPosition();
    public void setBasedSalary();
    public void setManager();
    public void addToPersonList(Object person);    //add individuals to personLists list array
    public void setHourelyRate();
}
