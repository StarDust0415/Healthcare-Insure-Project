/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CharityAdminOrganization;
import Business.Organization.Organization;
import Business.Organization.PeopleManagingOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.CharityAdminRole.CharityAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author tianchenglin
 */
public class CharityAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel card, UserAccount account, Organization org, Enterprise ent, EcoSystem business) {
        return new CharityAdminWorkAreaJPanel(card, account,(CharityAdminOrganization)org, ent, business);
    }
    
}
