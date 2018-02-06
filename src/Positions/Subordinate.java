package Positions;
//this class is used to map subordinates to managers using a hashmap

import Workers.IPersonalisable;
import Workers.Manager;
import Workers.PersonOperations;
import java.util.ArrayList;

public class Subordinate {
    IPersonalisable person;
    
    //create an array of Subordinates in Manager class

    public Subordinate(IPersonalisable person) {     
        this.person = person;
    }
    public Subordinate(){
        
    }
    public IPersonalisable getSubordinate(){
        return person;
    }
}
