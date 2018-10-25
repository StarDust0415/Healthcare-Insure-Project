/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.WorkQueue.WorkQueue;
import Business.Empolyee.EmployeeDirectory;
import Business.HomelessPeopleDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author tianchenglin
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    private HomelessPeopleDirectory hpd;
    
    public enum Type{
        FundManaging("FundManaging Organization"),
        PeopleManaging("PeopleManaging Organization"),
        CharityAdmin("CharityAdmin Organization"),
        InsuranceManaging("InsuranceManaging Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        this.hpd = new HomelessPeopleDirectory();
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
    
    public HomelessPeopleDirectory getHpd() {
        return hpd;
    }

    public void setHpd(HomelessPeopleDirectory hpd) {
        this.hpd = hpd;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }  

    @Override
    public String toString() {
        return name;
    }
    
}
