
package Objectives.BonusWork;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public abstract class BonusCombos extends Bonus {
  
    public DefaultComboBoxModel model = new DefaultComboBoxModel();
    JComboBox cBox = new JComboBox();
    
    BonusCombos(JComboBox cBox){
        this.cBox = cBox;
    }
    BonusCombos(){}
    
}
