/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.HomelessPeople;

/**
 *
 * @author Wenqing
 */
public class InsuranceRequest extends WorkRequest {
    private HomelessPeople people;

    public HomelessPeople getPeople() {
        return people;
    }

    public void setPeople(HomelessPeople people) {
        this.people = people;
    }
}
