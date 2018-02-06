
package Objectives;

//This class is for staff Personal information and contractor frame

import Frames.FramePersonalInformation;
import Workers.PayCycle;
import Workers.PersonOperations;
import static java.lang.System.out;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class StaffInfo {
    //populate staff combo from person list
    PersonOperations ops = new PersonOperations();
    DefaultComboBoxModel cbuModel = new DefaultComboBoxModel();
    DefaultListModel lstModel;
    boolean isContractor;
    public static String selectedStaff;
    String dob;
    javax.swing.JComboBox cbuTimePeriod = new javax.swing.JComboBox();
    javax.swing.JTextField txtRate = new javax.swing.JTextField();
    MessageBox message;
    public void populateModel(javax.swing.JComboBox cbuName){
        for(int i=0; i<ops.getPersonList().size(); i++){
            System.out.println(ops.getPersonList(i).getPersonFullName());
            cbuModel.addElement(ops.getPersonList(i).getPersonFullName());
        }
        cbuName.setModel(cbuModel);
    }
    //set contractor list cbuModel
    public void contractorBox(javax.swing.JList list){
        lstModel  = new DefaultListModel();
        lstModel.addElement("Yes");
        lstModel.addElement("No");
        list.setModel(lstModel);
    }
    //see if selected is salaried or contractor and allter view
    public void customizeFrame(String staff,JPanel panel,javax.swing.JComboBox cbuTimePeriod,
            javax.swing.JTextField txtRate,javax.swing.JTextField txtStartDate){
        this.cbuTimePeriod = cbuTimePeriod;
        this.txtRate = txtRate;
        for(int i=0; i<ops.getPersonList().size(); i++){
            for(int cont=0; cont<ops.getContractWorkers().size(); cont++){
                if(ops.getContractor(cont).getPersonFullName().equals(staff)){
                    //customize view
                    panel.setVisible(true);
                    txtStartDate.setVisible(false);
                    isContractor = true;
                    break;
                }
            }                
            for(int sal=0; sal<ops.getSalariedWorkers().size(); sal++){
                if(ops.getSalariedWorkers(sal).getPersonFullName().equals(staff)){
                    //return view
                    txtStartDate.setVisible(true);
                    panel.setVisible(false);
                    isContractor = false;
                    popStartDate(sal,txtStartDate);
                    break;
                }                
            }
        }
        selectedStaff = staff;
        popTimePeriod();
        popHourelyRate();
    }
    //populate hourly raete for contractors
    public void popHourelyRate(){
        if(isContractor){
            txtRate.setText(String.valueOf(ops.getContractor(selectedStaff).getRate()));
        }
    }
    public void setTimePeriod(javax.swing.JComboBox cbu){
        cbuModel  = new DefaultComboBoxModel();
        cbuModel.addElement(PayCycle.FORTNIGHTELY);
        cbuModel.addElement(PayCycle.MONTHLY);
        cbu.setModel(cbuModel);
    }
    public void popTimePeriod(){
        if(ops.getPerson(selectedStaff).getPayCycle().equals(PayCycle.FORTNIGHTELY.toString())){
            cbuTimePeriod.setSelectedIndex(0);
        }
        else if(ops.getPerson(selectedStaff).getPayCycle().equals(PayCycle.MONTHLY.toString())){
            cbuTimePeriod.setSelectedIndex(1);
        }
    }
    public String popDOB(){
        for(int i=0; i<ops.getPersonList().size(); i++){
            if(ops.getPersonList(i).getPersonFullName().equals(selectedStaff)){
                dob = ops.getPersonList(i).getDOB();
            }
        }
        return dob;
    }
    public void popStartDate(int i, javax.swing.JTextField startDate){
        try{
            if(!(isContractor)){
                startDate.setText(ops.getSalariedWorkers(i).getStartDate());
            }
        }
        catch(Exception e){
            message = new MessageBox(this,e.getStackTrace().toString(),"Warning!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    public void highLightListChoice(javax.swing.JList list){
        if(isContractor){
            list.setSelectedIndex(0);
        }
        else{
            list.setSelectedIndex(1);
        }
    }
}
