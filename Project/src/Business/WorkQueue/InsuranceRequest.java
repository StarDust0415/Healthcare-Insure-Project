/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.HomelessPeople;
import Business.InsuranceQuote;
import Business.InsuranceQuote.AgeType;

/**
 *
 * @author Wenqing
 */
public class InsuranceRequest extends WorkRequest {
    private HomelessPeople people;
    private AgeType type;
    
    private InsuranceQuote assignedQuote;

    public InsuranceQuote getAssignedQuote() {
        return assignedQuote;
    }

    public void setAssignedQuote(InsuranceQuote assignedQuote) {
        this.assignedQuote = assignedQuote;
    }

    public HomelessPeople getPeople() {
        return people;
    }

    public void setPeople(HomelessPeople people) {
        this.people = people;
    }

    public AgeType getType() {
        return type;
    }

    public void setType(AgeType type) {
        this.type = type;
    }
}