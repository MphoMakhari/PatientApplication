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
public abstract class PatientClass
{
   
     private String surname, id, telephone;
     private int patientNr = 1001;
     private Address address;
     
     public PatientClass()
    {
        this("none", "none", "none",new Address());
    }
     

    public PatientClass(String surname, String id, String telephone,Address address)
    {
        this.surname = surname;
        this.id = id;
        this.telephone = telephone;
    }


    
     public void setSurname(String surname)
    {
        if (surname != null && surname.length() > 3)
        {
            this.surname = surname;
        }
        else
        {
            throw new IllegalArgumentException("Surname must contain a value or value is less than 3 characters");
        }
    }

    
    public void setID(String id)
    {
        if (id != null)
        {
            if (id.matches("\\d{13}"))
            {
                this.id = id;
            }
            else
            {
                throw new IllegalArgumentException("ID Number must contain 13 digits");
            }
        }
        else
        {

            throw new IllegalArgumentException("ID Number must a value");
        }
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    public void setPatientNr()
    {
        this.patientNr += 1;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }
    
    

    public String getSurname()
    {
        return surname;
    }

    public String getId()
    {
        return id;
    }

    public String getTelephone()
    {
        return telephone;
    }

    public int getPatientNr()
    {
        return patientNr;
    }

    public Address getAddress()
    {
        return address;
    }

    
  public abstract double calculateAmountDue();
   
   
   @Override 
  public String toString()
  {
     return patientNr + ", " + surname + ", " + id + ", " + telephone + ", " + address + ", ";
  }
    
    
    
    
     
     
     
     
    
    
}
