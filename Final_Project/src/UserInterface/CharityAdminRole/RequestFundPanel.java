/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CharityAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.FundManagingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FundRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author Wenqing
 */
public class RequestFundPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Organization organization;
    private EcoSystem sys;

    /**
     * Creates new form RequestFundPanel
     */
    public RequestFundPanel(JPanel userProcessContainer, Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.sys = system;
        NameTxt.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        NameTxt = new javax.swing.JTextField();
        enterpriseLabel = new javax.swing.JLabel();

        requestTestJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        requestTestJButton.setText("send request");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Amount requesting: ");

        messageJTextField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        NameTxt.setEnabled(false);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(requestTestJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameTxt))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(requestTestJButton))
                .addGap(98, 98, 98))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        int amount = Integer.parseInt(messageJTextField.getText());

        FundRequest request = new FundRequest();
        request.setAmount(amount);
        request.setSender(organization);
        request.setStatus("Sent");        
        
        organization.getWorkQueue().getWorkRequestList().add(request);
        //System.out.println(organization.getWorkQueue().getWorkRequestList());

        Organization receiverorg = null;
        for (Network n: sys.getNetworkList()){
            //System.out.println("network name is:" + n.getName());
            for (Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                //System.out.println("ent name is:" + e.getName());
                for (Organization o: e.getOrganizationDirectory().getOrganizationList()){
                    //System.out.println("org name is:" + o.getName());
                    if (o instanceof FundManagingOrganization){
                        receiverorg = o;
                        request.setReceiver(o);
                        //System.out.println("receiving org is: " + o);
                        receiverorg.getWorkQueue().addRequest(request);
                        break;
                    }                    
                }
            }
        }

        if (receiverorg!=null){
            receiverorg.getWorkQueue().getWorkRequestList().add(request);
        }
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CharityAdminWorkAreaJPanel dwjp = (CharityAdminWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NameTxt;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton requestTestJButton;
    // End of variables declaration//GEN-END:variables
}
