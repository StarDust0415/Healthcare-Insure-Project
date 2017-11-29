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
public class HomelessPeopleDirectory {
    private ArrayList<HomelessPeople> list;
    
    public HomelessPeopleDirectory(){
        this.list = new ArrayList<>();
    }
    
    
    public void addPeople(HomelessPeople people){
        this.list.add(people);
    }

    public ArrayList<HomelessPeople> getList() {
        return list;
    }
   
}
