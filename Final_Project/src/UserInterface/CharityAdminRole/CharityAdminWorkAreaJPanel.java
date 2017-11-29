/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CharityAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CharityAdminOrganization;
import Business.Organization.PeopleManagingOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FundRequest;
import Business.WorkQueue.PeopleInfoRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tianchenglin
 */
public class CharityAdminWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private CharityAdminOrganization organization;
    private PeopleManagingOrganization peopleManagingOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem sys;

    /**
     * Creates new form CharityAdminWorkAreaJPanel
     */
   

    public CharityAdminWorkAreaJPanel(JPanel card, UserAccount account, CharityAdminOrganization charityAdminOrganization, Enterprise ent, EcoSystem business, PeopleManagingOrganization peopleManagingOrganization) {

        initComponents();
        this.userProcessContainer = card;
        this.organization = charityAdminOrganization;
        this.enterprise = ent;
        this.userAccount = account;
        this.sys = business;
        this.peopleManagingOrganization = peopleManagingOrganization;
        NameTxt.setText(enterprise.getName());
        populateRequestTable();
        populatePeopleInfoTable();
    }
    
    public void populatePeopleInfoTable(){
        DefaultTableModel model = (DefaultTableModel)PeopleInfoTable.getModel();
        model.setRowCount(0);
        for(WorkRequest request : peopleManagingOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = ((PeopleInfoRequest)request).getName();
            row[1] = ((PeopleInfoRequest)request).getAge();
            row[2] = ((PeopleInfoRequest)request).getGender();
            row[3] = ((PeopleInfoRequest)request).getMedicalHistory();
            row[4] = ((PeopleInfoRequest)request).getInsuranceType();
            
            model.addRow(row);
        }
//        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
//        
//        model.setRowCount(0);
//        
//        for(WorkRequest request : labOrganization.getWorkQueue().getWorkRequestList()){
//            Object[] row = new Object[4];
//            row[0] = request;
//            row[1] = request.getSender().getEmployee().getName();
//            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
//            row[3] = request.getStatus();
//            
//            model.addRow(row);
    }
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();        
        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request.getRequestDate();
            row[1] = ((FundRequest)request).getAmount();
            row[2] = request.getStatus();
            
            String result = ((FundRequest) request).getResult();
            row[3] = (result == null) ? "Waiting" : result;
            row[4] = request.getSender();
            
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SendBut = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        NameTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        PeopleInfoTable = new javax.swing.JTable();

        SendBut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SendBut.setText("Send New Request");
        SendBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendButActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Amount", "Status", "Result", "Sender Organization"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        NameTxt.setEnabled(false);

        PeopleInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "Medical History", "Insurance Type"
            }
        ));
        jScrollPane2.setViewportView(PeopleInfoTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(SendBut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(SendBut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(408, 408, 408))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SendButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendButActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestFundPanel(userProcessContainer, organization, enterprise, sys));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_SendButActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NameTxt;
    private javax.swing.JTable PeopleInfoTable;
    private javax.swing.JButton SendBut;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}