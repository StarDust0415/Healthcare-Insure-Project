/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrderManagingOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.PeopleManagerRole.PeopleManagerRoleWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author yizheliu
 */
public class OrderManagerRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel card, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PeopleManagerRoleWorkAreaJPanel(card,account,(PeopleManagingOrganization)organization,enterprise,business);
    }
}
