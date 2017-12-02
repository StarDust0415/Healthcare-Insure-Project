/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.OrderManagerRole;
import Business.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author yizheliu
 */
public class OrderManagingOrganization extends Organization{
    
    public OrderManagingOrganization(){
        super(Organization.Type.OrderManaging.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new OrderMangerRole());
        return roles;
    }
    
}
