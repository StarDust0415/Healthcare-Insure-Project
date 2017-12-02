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
    private ArrayList<HomelessPeople> peoplelist;
    
    public HomelessPeopleDirectory(){
        peoplelist = new ArrayList();
    }

    public ArrayList<HomelessPeople> getPeoplelist() {
        return peoplelist;
    }
    
    
    public HomelessPeople addPeople(){
        HomelessPeople homelessPeople = new HomelessPeople();
        peoplelist.add(homelessPeople);
        return homelessPeople;
    }
    
    public void deleteHomelessPeople(HomelessPeople homelessPeople){
        peoplelist.remove(homelessPeople);
    }
   
}
