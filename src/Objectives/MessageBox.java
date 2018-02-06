package Objectives;

import javax.swing.JOptionPane;

public class MessageBox {
    public MessageBox(Object object, String message, String title, int messageType){
        JOptionPane.showMessageDialog(null, message, title, messageType);
    }
}
