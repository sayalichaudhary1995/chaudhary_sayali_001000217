/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sayu
 */
public class UpdateManagerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateManagerJPanel
     */
    JPanel userContainer;
    EcoSystem system;
    Enterprise enterprise;
    Organization organization;
    UserAccount userAccount;

    UpdateManagerJPanel(JPanel userProcessContainer,EcoSystem system,Enterprise enterprise) {
        initComponents(); //To change body of generated methods, choose Tools | Templates.
        this.userContainer = userProcessContainer;
        this.system = system;
        this.enterprise = enterprise;
        this.organization = (Organization)enterprise.getRestaurantDirectory().searchOrganization("RestaurantAdmin");
        this.userAccount = organization.getUserAccountDirectory().getUserAccountList().get(0);
        System.out.println(" In update Manager screen "+organization.getUserAccountDirectory().getUserAccountList().get(0).getEmployee().getName());
        txtOrgName.setText(organization.getName());
        txtOrgName.setEnabled(false);
        txtEmployeeName.setText(userAccount.getEmployee().getName());
        txtUserName.setText(userAccount.getUsername());
        txtPassword.setText(userAccount.getPassword());
        btnUpdateMangerDetails.setEnabled(true);
        btnSave.setEnabled(false);
        txtEmployeeName.setEnabled(false);
        txtUserName.setEnabled(false);
        txtPassword.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtOrgName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        usrNameLabel = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnUpdateMangerDetails = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Manager Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Organization");

        txtOrgName.setText("RestaurantAdmin");
        txtOrgName.setEnabled(false);
        txtOrgName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrgNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Manager Name");

        usrNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usrNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usrNameLabel.setText("UserName");

        PasswordLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordLabel.setText("Password");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnBack.setText(" Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnUpdateMangerDetails.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdateMangerDetails.setText("Update");
        btnUpdateMangerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMangerDetailsActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(260, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(usrNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOrgName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateMangerDetails, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(306, 306, 306))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOrgName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usrNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateMangerDetails)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtOrgNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrgNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrgNameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)userContainer.getLayout();
        userContainer.remove(this);
        layout.previous(userContainer);
        
        
        Component[] comps = this.userContainer.getComponents();
        for(Component comp : comps){
            if(comp instanceof ManageRestaurantsJPanel){
                ManageRestaurantsJPanel manageRestaurantsJPanel= (ManageRestaurantsJPanel) comp;
               manageRestaurantsJPanel.populateTable(); 
            }
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateMangerDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMangerDetailsActionPerformed
        // TODO add your handling code here:
        txtEmployeeName.setEnabled(true);
        txtUserName.setEnabled(true);
        txtPassword.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdateMangerDetails.setEnabled(false);
    }//GEN-LAST:event_btnUpdateMangerDetailsActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()){
            if(ua.getUsername().equals(txtUserName.getText())){
                JOptionPane.showMessageDialog(null, "Username should be unique. UserName is already in use.");
                return;
            }
        }
        if (usernamePatternCorrect()==false){
            usrNameLabel.setForeground (Color.red);
            txtUserName.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Username should be in the format of xx_xx@xx.xx");
            return;
        } else{
            usrNameLabel.setForeground (Color.BLUE);
            txtUserName.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        }
        if (passwordPatternCorrect()==false){
            PasswordLabel.setForeground (Color.red);
            txtPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Password should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
            return;
        }else{
            PasswordLabel.setForeground (Color.BLUE);
            txtPassword.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        }

        
        
        String employeeName=txtEmployeeName.getText();
        String userName=txtUserName.getText();
        String password=txtPassword.getText();
        
        userAccount.getEmployee().setName(employeeName);
        userAccount.setUsername(userName);
        userAccount.setPassword(password);
        
        JOptionPane.showMessageDialog(null, "Manager updated successfully");
        txtEmployeeName.setEnabled(false);
        txtUserName.setEnabled(false);
        txtPassword.setEnabled(false);
        btnSave.setEnabled(false);
        btnUpdateMangerDetails.setEnabled(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private boolean usernamePatternCorrect(){
        Pattern p=Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m=p.matcher(txtUserName.getText());
        boolean b=m.matches();
        return b;
    }
    
     private boolean passwordPatternCorrect(){
        Pattern p1;
        p1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1=p1.matcher(txtPassword.getText());
        boolean b1=m1.matches();
        return b1;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdateMangerDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JTextField txtOrgName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JLabel usrNameLabel;
    // End of variables declaration//GEN-END:variables
}