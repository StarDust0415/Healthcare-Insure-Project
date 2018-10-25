/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.HomelessPeopleDirectory;
import Business.Role.PeopleManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author tianchenglin
 */
public class PeopleManagingOrganization extends Organization {
    
    
    public PeopleManagingOrganization() {
        super(Organization.Type.PeopleManaging.getValue());
        
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PeopleManagerRole());
        return roles;
        
    }
}