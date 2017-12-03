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
        Youth ("Youth: 0-25"),
        MiddleAged ("Middle Aged: 25-50"),
        Old("Over 50");
        
        private String age;
        private AgeType(String age){
            this.age = age;
        }
        public String getAge(){
            return this.age;
        }
        
        public String toString(){
            return age;
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