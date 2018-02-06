package Objectives.BonusWork;
//Used for Subordinate employees only

import Objectives.MessageBox;
import Workers.PersonOperations;
import Workers.SalariedPerson;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Bonus { 
    static SalariedPerson subordinate = new SalariedPerson();
    double enteredAmount = 0;
    static String managerName = new String();
    double checkBonus = 0;
    PersonOperations ops;
    static ArrayList<SalariedPerson> bonusList = new ArrayList();//for bonus report
    MessageBox message;
    
    public Bonus(){
        
    }

    public void execute(){
        ops = new PersonOperations();
        //check if bonus is less than manager bonusFund
        try{
            if(subordinate.checkBonus() == 0){
                if(enteredAmount < ops.getManagers(managerName).getBonusFund()
                        && enteredAmount > 0){
                    subordinate.updateBonus(enteredAmount);
                    updateManagerFund();
                    bonusList.add(subordinate);
                    message = new MessageBox(this,"The bonus of $"+enteredAmount+
                            " has been assigned to "+subordinate.getPersonFullName(),
                            "Announcement", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    //show messagebox
                    if(enteredAmount > ops.getManagers(managerName).getBonusFund()){
                        message = new MessageBox(this,"Not enough bonus fund from "+
                                managerName,
                         "Warning",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            else{
                if(enteredAmount > 0){
                message = new MessageBox(this,subordinate.getPersonFullName()+
                        " has already got a bonus assigned","Announcement",
                        JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        catch(Exception e){
            message = new MessageBox(this,e.getStackTrace().toString(),"Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    public void updateManagerFund(){
        ops = new PersonOperations();
        ops.getManagers(managerName).updateBonusFund(enteredAmount);
    }
    public static void setManager(String name){
        managerName = name;
    }
    public void setSubordinate(String fullName){
        ops = new PersonOperations();
        //go through salariesWorker list and convert sting to salariedPerson
        for(int i=0; i<ops.getSalariedWorkers().size(); i++){
            if(ops.getSalariedWorkers(i).getPersonFullName().equals(fullName)){
                subordinate = ops.getSalariedWorkers(i);
            }
        }
    }
    public ArrayList<SalariedPerson> getBonusList(){
        return bonusList;
    }
    public double checkBonus(){
        for(SalariedPerson bonus : bonusList){
            if(bonus.equals(subordinate)){
                checkBonus = bonus.checkBonus();
            }
        }

        return checkBonus;
    }
    public void displayBonus(){
        message = new MessageBox(this,"The bonus of "+subordinate.getPersonFullName()+
            " is $"+checkBonus(),"Announcement",JOptionPane.INFORMATION_MESSAGE);
    }
    //read entered bonus amount from frame
    public void setEnteredAmount(String amount){
        try{
            enteredAmount = Double.parseDouble(amount);
        }
        catch(NumberFormatException nfe){
            if(amount.isEmpty()){
                message = new MessageBox(this,"You haven't specified the bonus",
                        "No bonus Assigned",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                 message = new MessageBox(this,"please enter a relevant amount",
                         "Warning",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(Exception e){
             message = new MessageBox(this,e.getMessage(),"Error!",
                     JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
