/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.InsuranceManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.HomelessPeople;
import Business.InsuranceQuote;
import Business.Organization.InsuranceManagingOrganization;
import Business.Organization.Organization;
import Business.QuoteCatalogue;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.InsuranceRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.CharityAdminRole.RequestFundingPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wenqing
 */
public class InsuranceManagerWorkAreaPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private InsuranceManagingOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem sys;
    /**
     * Creates new form InsuranceManagerWorkAreaPanel
     */
    

    public InsuranceManagerWorkAreaPanel(JPanel card, UserAccount account, InsuranceManagingOrganization org, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = card;
        this.organization = org;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.sys = business;
        populateQuoteTable();
        populateRequestTable();
        NameTxt.setText(organization.getName());
        
        
        
    }
    
    public void populateQuoteTable(){
        DefaultTableModel model1 = (DefaultTableModel)QuoteTable.getModel();
        model1.setRowCount(0);
        
        QuoteCatalogue qc = organization.getQc();
        for(InsuranceQuote quote: qc.getList()){
            Object[] row = new Object[5];
            row[0] = quote;
            row[1] = quote.getProvider();
            row[2] = quote.getTotalPremium();
            row[3] = quote.getPrice();
            row[4] = quote.getAge();

            model1.addRow(row);            
        }
    }
    private void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel)RequestTable.getModel();
        model.setRowCount(0);
        

        for(WorkRequest r: organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            InsuranceRequest ir = (InsuranceRequest) r;
            
            row[0] = ir;
            row[1] = ir.getPeople();
            row[2] = ir.getType();
            row[3] = ir.getStatus();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        QuoteTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        RequestTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        AddBut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        assignBut = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        NameTxt = new javax.swing.JTextField();

        QuoteTable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        QuoteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Provider", "Total Premium", "Price", "Age Type"
            }
        ));
        jScrollPane1.setViewportView(QuoteTable);

        RequestTable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date", "People", "Type", "Status"
            }
        ));
        jScrollPane2.setViewportView(RequestTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Insurance Quotes:");

        AddBut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AddBut.setText("Add New Quote");
        AddBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Insurance Requests:");

        assignBut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        assignBut.setText(" Assign Selected Quote to People");
        assignBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Enterprise:");

        NameTxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NameTxt.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBut, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignBut, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assignBut)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("AddQuotePanel", new AddQuotePanel(userProcessContainer, userAccount, organization, enterprise, sys));
        layout.next(userProcessContainer);    }//GEN-LAST:event_AddButActionPerformed

    private void assignButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignButActionPerformed

        int selectedRequest = RequestTable.getSelectedRow();
        int selectedQuote = QuoteTable.getSelectedRow();
        
        if(selectedRequest <0 ||selectedQuote <0){
            JOptionPane.showMessageDialog(null, "you should select a row from each of the above table");
            
            return;
        }else{
        
        InsuranceQuote quote = (InsuranceQuote)QuoteTable.getValueAt(selectedQuote, 0);

        InsuranceRequest request = (InsuranceRequest)RequestTable.getValueAt(selectedRequest, 0);
        request.setAssignedQuote(quote);
        request.setStatus("Processed");
        HomelessPeople people = request.getPeople();
        people.getList().add(quote);
        
        populateRequestTable();
        }
        
    }//GEN-LAST:event_assignButActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBut;
    private javax.swing.JTextField NameTxt;
    private javax.swing.JTable QuoteTable;
    private javax.swing.JTable RequestTable;
    private javax.swing.JButton assignBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}