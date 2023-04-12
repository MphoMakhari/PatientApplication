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
public class OutPatientClass extends PatientClass
{

    private double medicineAmount;

    public OutPatientClass()
    {
        this(0, "none", "none", "none", new Address());
    }

    public OutPatientClass(double medicineAmount, String surname, String id, String telephone, Address address)
    {
        super(surname, id, telephone, address);
        setMedicineAmount(medicineAmount);
    }

    @Override
    public double calculateAmountDue()
    {

        return getMedicineAmount() + 120;
    }

    public double getMedicineAmount()
    {
        return medicineAmount;
    }

    public void setMedicineAmount(double medicineAmount)
    {
        if (medicineAmount >= 0)
        {
            this.medicineAmount = medicineAmount;
        }
        else
        {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }

    @Override
    public String toString()
    {
        return "Out Patient: " + super.toString() + ", " + calculateAmountDue();
    }

}
