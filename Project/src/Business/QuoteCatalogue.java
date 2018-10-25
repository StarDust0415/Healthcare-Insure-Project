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
public class QuoteCatalogue {
    private ArrayList<InsuranceQuote> list;
    
    
    public QuoteCatalogue(){
        this.list = new ArrayList<>();
    }

    public ArrayList<InsuranceQuote> getList() {
        return list;
    }
    
    public InsuranceQuote addQuote(){
        InsuranceQuote quote = new InsuranceQuote();
        list.add(quote);
        return quote;
    }
}