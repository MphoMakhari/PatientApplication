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
public class InPatientClass extends PatientClass
{
    
    private int numberOfDays;
    private boolean  intensiveCare ;

    public InPatientClass()
    {
    }

  

    public InPatientClass(int numberOfDays, boolean intensiveCare, String surname, String id, String telephone, Address address)
    {
        super(surname, id, telephone, address);
        setNumberOfDays(numberOfDays);
        setIntensiveCare(intensiveCare);
    }
    
    
    
    

    public int getNumberOfDays()
    {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays)
    {
        if (numberOfDays >= 0)
        {
            this.numberOfDays = numberOfDays;
        }
        else
        {
            throw new IllegalArgumentException("numberOfDays must be positive");
        }
      
    }

    public boolean isIntensiveCare()
    {
        return intensiveCare;
    }

    public void setIntensiveCare(boolean intensiveCare)
    {
        this.intensiveCare = intensiveCare;
    }

    @Override
    public double calculateAmountDue()
    {
        if (isIntensiveCare() == true)
        {
            return 1500 * numberOfDays;
        }
        else
        {
          return 1000 * numberOfDays;  
        }
        
        
    }

    @Override
    public String toString()
    {
        return "In Patient: " + super.toString() + ", " + getNumberOfDays() + ", " + isIntensiveCare() + ", " + calculateAmountDue();
    }
    
    
    
    
    
    
}
