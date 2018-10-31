/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.item;

/**
 *
 * @author ektasharma
 */
public class ItemDetails implements java.io.Serializable{
    private static final long serialVersionUID = 1L;
    private String itemNumber;
    private int quantity;
    private double priceEach;
    private String firstName;
    private String lastName;
    private String middleInitial;
    private String shippingAddress;
    private String payment;
    private String creditCardNumber;
//    private String repeatCreditCardNumnber;

    public ItemDetails()
    {
        
    }

    public ItemDetails(String itemNumber, int quantity, double priceEach, String firstName, String lastName, String shippingAddress, String payment, String creditCardNumber) {

    }
    
    

    public String getItemNumber() 
    {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber)
    {
      
        this.itemNumber = itemNumber;
    }            
    

    public int getQuantity() 
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
          this.quantity = quantity;

    }

    public double getPriceEach() 
    {
        return priceEach;
    }

    public void setPriceEach(double priceEach)
    {
        this.priceEach = priceEach;
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;

    }

    public String getLastName() 
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;

    }

    public String getMiddleInitial() 
    {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) 
    {
        this.middleInitial = middleInitial;
    }

    public String getShippingAddress() 
    {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress)
    {
        this.shippingAddress = shippingAddress;

    }

    public String getCreditCardNumber() 
    {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) 
    {
        this.creditCardNumber = creditCardNumber;

    }

//    public String getRepeatCreditCardNumnber() 
//    {
//        return repeatCreditCardNumnber;
//    }
//
//    public void setRepeatCreditCardNumnber(String repeatCreditCardNumnber) 
//    {
//        this.repeatCreditCardNumnber = repeatCreditCardNumnber;
//
//    }
   
    
}
