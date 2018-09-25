/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortcustomerdata;

/**
 *
 * @author 91030418
 */
public class CustomerData {
    String name;
    String customerRating;
    String address;
     
    public CustomerData (String name, String customerRating, String address) {
        this.name = name;
        this.customerRating = customerRating;
        this.address = address;
    }
    
    public String toString(){
        return "Customer Name: " + name + 
                "\nCustomer rating: " + customerRating + 
                "\nCustomer address: " + address + "\n" + "\n";
    }
    
    public String getRating(){
    return customerRating;
    }
    
    public String getName(){
    return name;
    }
}
