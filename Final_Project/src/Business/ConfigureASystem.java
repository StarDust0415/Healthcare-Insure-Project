/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Empolyee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author tianchenglin
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        Network net1 = system.createAndAddNetwork();
        net1.setName("Network1");
        
        net1.getEnterpriseDirectory().createAndAddEnterprise("funding", Enterprise.EnterpriseType.Funding);
        net1.getEnterpriseDirectory().createAndAddEnterprise("charity", Enterprise.EnterpriseType.Charity);
        net1.getEnterpriseDirectory().createAndAddEnterprise("insurance", Enterprise.EnterpriseType.Insurance);

        
     
        Employee employee = system.getEmployeeDirectory().createEmployee("Lam");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}
