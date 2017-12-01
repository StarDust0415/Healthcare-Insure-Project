/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InsuranceManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Wenqing
 */
public class InsuranceManagingOrganization extends Organization {

    public InsuranceManagingOrganization(String name) {
        super(name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> list = new ArrayList<>();
        list.add(new InsuranceManagerRole());
        return list;
    }
    
}
