package Objectives.BonusWork;

import Objectives.BonusWork.BonusCombos;
import Workers.Manager;
import Workers.PersonOperations;
import static java.lang.System.out;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

 
public class ManagerModel extends BonusCombos {
    String[] values = new String[9];
    SubModel sub;
    
    public ManagerModel(JComboBox cBox, String[] values){
        super(cBox);
        this.values = values;
        populateCBox();
    }
    void populateCBox(){
        model = new DefaultComboBoxModel();
        for(String value : values){
            model.addElement(value);
        }
        cBox.setModel(model);
    }
}
