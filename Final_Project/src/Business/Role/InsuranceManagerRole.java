/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.InsuranceManagingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.InsuranceManagerRole.InsuranceManagerWorkAreaPanel;
import javax.swing.JPanel;

/**
 *
 * @author Wenqing
 */
public class InsuranceManagerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel card, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new InsuranceManagerWorkAreaPanel(card, account,(InsuranceManagingOrganization)organization, enterprise,business);
    }
    
}
