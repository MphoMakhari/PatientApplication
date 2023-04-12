/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Mpho.Makhari
 */
public class Address
{

    private String street;
    private String town;
     private String postalCode;

    /* 
     * @param street The new street
     * @param town The new town
     */
    public Address(String street, String town, String postalCode)
    {
        setStreet(street);
        setTown(town);
        setPostalCode(postalCode);

    }

    
    public Address()
    {
        this("none", "none", "none");

    }

    /**
 
     * @param street The new Street
     */
    public void setStreet(String street)
    {
        if (street.length()>3)
        
             this.street = street;
        
        
          else 
            throw new IllegalArgumentException("invalid street.Street too short");
            
            

    }

    /**
     * @param town  The new town 
     */
    public void setTown(String town)
    {
        this.town = town;

    }
    
  
    public String getStreet()
    {
        return street;
    }

    public void setPostalCode(String postalCode)
    {
        this.postalCode = postalCode;
    }
    
  
    
    public String getTown()
    {
        return town;
    }

    public String getPostalCode()
    {
        return postalCode;
    }
    
    
    
    @Override
    public String toString()
    {
        return  street + ", " + town + ", " + postalCode;
    }
     
    
}
