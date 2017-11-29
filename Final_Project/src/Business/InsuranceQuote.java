/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Wenqing
 */
public class InsuranceQuote {
    private int totalPremium;
    private int price;
    private String provider;
    
    public enum AgeType{
        Youth (25),
        MiddleAged (45),
        Old(100);
        
        private int age;
        private AgeType(int age){
            this.age = age;
        }
        public int getAge(){
            return this.age;
        }
    }

    public int getTotalPremium() {
        return totalPremium;
    }

    public void setTotalPremium(int totalPremium) {
        this.totalPremium = totalPremium;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }    
}