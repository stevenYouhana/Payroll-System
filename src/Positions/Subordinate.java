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

//    public String getSubordinatesFor(Manager manager) {
//        matchSubordinates();    //get the right array
//        return subordinateName;
//    }
//
//    private void matchSubordinates() {   //used only in this class
//        switch (manager.getManagerName()) {   //based on name
//            //case of all created managers
//            case "Amanda Green":
//                refreshSubordinate();
//                break;
//            case "Ashley Simpson":
//                refreshSubordinate();
//                break;
//            case "Bill Johns":
//                refreshSubordinate();
//                break;
//            case "Charlotte Hond":
//                refreshSubordinate();
//                break;
//            case "Christine Bennet":
//                refreshSubordinate();
//                break;
//            case "James Mint":
//                refreshSubordinate();
//                break;
//            case "John Norton":
//                refreshSubordinate();
//                break;
//            case "Julia Smith":
//                refreshSubordinate();
//                break;
//            case "Kate Hudson":
//                refreshSubordinate();
//                break;
//            case "Michael Brown":
//                refreshSubordinate();
//                break;
//            case "Scarlet Green":
//                refreshSubordinate();
//                break;
//            case "Victoria Bell":
//                refreshSubordinate();
//                break;
//            default:
//                subordinateName = null;
//        }
//    }
//
//    public void refreshSubordinate() {
//        ops = new PersonOperations();
//        //pupulate subordinates based on manager value
//        //got through list and check manager if is equal to this.manager vale
//        for (int i = 0; i < ops.getPersonList().size(); i++) {           
//            if(ops.getPersonList(i).getManagerName() == manager.getManagerName()){  
//                subordinateName = ops.getPersonList(i).getPersonFullName(); 
//            }
//        }
//    
//    }

}
