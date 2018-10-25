/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.HomelessPeople;
/**
 *
 * @author tianchenglin
 */
public class PeopleInfoRequest extends WorkRequest {
//    private String name;
//    private int age;
//    private String gender;
//    private String medicalHistory;
    private HomelessPeople people;
    private String insuranceType;

    public HomelessPeople getPeople() {
        return people;
    }

    public void setPeople(HomelessPeople people) {
        this.people = people;
    }
    
    public String getName(){
        return people.getName();
    }
    
    public int getAge(){
        return people.getAge();
    }
    
    public String getGender(){
        return people.getGender();
    }
    
    public String getMedicalHistory(){
        return people.getMedicalHistory();
    }

    

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }    
}