package Frames;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

//This class takes care of main menu navigation
public class Operations {
    FrameBonus bonusFrame;
    FrameAddPayments paymentFrame;
    FramePersonalInformation personalInfoFrame;
    FrameReports reportsFrame;
    
    //used first in main class
    public void setMainFrame(){
        FrameMain mainFrame = new FrameMain();
        mainFrame.setVisible(true); 
        mainFrame.setResizable(false);
        
    }
    // used for main frame navigations
    public void switchForms(ActionEvent e, JFrame main){
        switch(e.getActionCommand()){
            case "Assign Bonus": 
                bonusFrame = new FrameBonus();
                main.setVisible(false); bonusFrame.setVisible(true);
                bonusFrame.setResizable(false);
            break;
            case "Personal Details and Contractor Data Entry": 
                personalInfoFrame = new FramePersonalInformation();
                main.setVisible(false); personalInfoFrame.setVisible(true);
                personalInfoFrame.setResizable(false);
            break;
            case "Create Payment": 
                paymentFrame = new FrameAddPayments();
                main.setVisible(false); paymentFrame.setVisible(true);
                paymentFrame.setResizable(false);
            break;
            case "Run Reports": 
                reportsFrame = new FrameReports();
                main.setVisible(false); reportsFrame.setVisible(true);
                reportsFrame.setResizable(false);
            break;
        }       
    }
    //used per back button to set frame visibilities
    public void backToMain(JFrame frame){
        frame.setVisible(false);
        setMainFrame(); 
    }

}
