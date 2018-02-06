package Objectives.BonusWork;

import Workers.PersonOperations;
import static java.lang.System.out;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class SubModel extends BonusCombos {
    static String selectedManager = "Amanda Green";
    ArrayList<String> subsList = new ArrayList();
    PersonOperations ops;
    
    public SubModel(JComboBox cBox, String selectedManager){
        super(cBox);
        this.selectedManager = selectedManager;
        setManager(selectedManager);
        populateCBox();
    }
    public SubModel(){
        
    }
    
    public void setSelectedManager(String selection){
        selectedManager = selection;   
    }

    // getting subs and populateing them in an array
    public ArrayList<String> matchSubs(){
        //subsList = new ArrayList();
        ops = new PersonOperations();
        for(int i=0; i<ops.getSalariedWorkers().size(); i++){
            if(ops.getSalariedWorkers(i).getManagerName().equals(selectedManager)){
                out.println(ops.getSalariedWorkers(i).getPersonFullName());
                subsList.add(ops.getSalariedWorkers(i).getPersonFullName());
            }
        }
        return subsList;
    }
    public void populateCBox(){
        model = new DefaultComboBoxModel();
        for(String sub : matchSubs()){
            model.addElement(sub);
        }
        cBox.setModel(model);
    }
    public void getSubordinate(String selectedSub){
        setSubordinate(selectedSub);
    }


}
