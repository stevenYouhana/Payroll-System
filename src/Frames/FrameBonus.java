package Frames;

import Objectives.BonusWork.ManagerModel;
import Objectives.BonusWork.SubModel;
import Objectives.BonusWork.Bonus;
import Objectives.MessageBox;
import Workers.PersonOperations;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class FrameBonus extends javax.swing.JFrame {

    public FrameBonus() {
        initComponents();
        populateManagers();
        bonus = new Bonus();
        System.out.println("BONUS");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbuManager = new javax.swing.JComboBox<>();
        cubSubordinateList = new javax.swing.JComboBox<>();
        txtBonus = new javax.swing.JTextField();
        btnAssignBonus = new javax.swing.JButton();
        btnCheckBonus = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Assign Bonus");

        jLabel2.setText("Manager:");

        jLabel3.setText("Subordinate List");

        jLabel4.setText("Bonus:");

        cbuManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbuManagerActionPerformed(evt);
            }
        });

        cubSubordinateList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubSubordinateListActionPerformed(evt);
            }
        });

        btnAssignBonus.setText("Assign Bonus");
        btnAssignBonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignBonusActionPerformed(evt);
            }
        });

        btnCheckBonus.setText("Check current Bonus");
        btnCheckBonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckBonusActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCheckBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbuManager, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cubSubordinateList, 0, 163, Short.MAX_VALUE)
                            .addComponent(txtBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAssignBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbuManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cubSubordinateList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtBonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(btnAssignBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCheckBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Operations ops;
    ManagerModel mModel;
    PersonOperations personOps;
    SubModel sub;
    Bonus bonus;
    //FrameMain mainFrame;
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        //mainFrame = new FrameMain();
        ops  = new Operations();
        ops.backToMain(this);              
    }//GEN-LAST:event_btnBackActionPerformed

    private void cbuManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbuManagerActionPerformed
        //set selected manager
        sub = new SubModel(cubSubordinateList,cbuManager.getSelectedItem().toString());
        sub = new SubModel();
    }//GEN-LAST:event_cbuManagerActionPerformed

    private void cubSubordinateListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cubSubordinateListActionPerformed
        sub.getSubordinate(cubSubordinateList.getSelectedItem().toString());
       
    }//GEN-LAST:event_cubSubordinateListActionPerformed

    private void btnAssignBonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignBonusActionPerformed
        bonus = new Bonus();
        bonus.setEnteredAmount(txtBonus.getText());
        bonus.execute();
    }//GEN-LAST:event_btnAssignBonusActionPerformed

    private void btnCheckBonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckBonusActionPerformed
        bonus = new Bonus();
        bonus.displayBonus();
    }//GEN-LAST:event_btnCheckBonusActionPerformed
    public void populateManagers(){
        String[] managers = new String[9];
        personOps = new PersonOperations();
        for(int i=0; i<personOps.getManagers().size(); i++){
            managers[i] = personOps.getManagers().get(i).getManagerName();  
        }
        mModel = new ManagerModel(cbuManager,managers);
    }
    public JComboBox getManagerCBO(){
        return cbuManager;
    }
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignBonus;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckBonus;
    private javax.swing.JComboBox<String> cbuManager;
    private javax.swing.JComboBox<String> cubSubordinateList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtBonus;
    // End of variables declaration//GEN-END:variables
}
