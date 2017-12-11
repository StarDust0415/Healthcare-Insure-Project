/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Wenqing
 */
public class HomelessPeople {
    private int age;
    private String name;
    private String gender;
    private String medicalHistory;
    
    private ArrayList<InsuranceQuote>list;
    
    
    public HomelessPeople(){
        this.list=new ArrayList<>();
    }

    public ArrayList<InsuranceQuote> getList() {
        return list;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
    
@Override
    public String toString(){
    return name;
}
    
    
    
    
}
