package models;

public interface PaymentCheck
{
    public double getGrossWage(); // returning the gross salary

    public String getDiscounts(); // returning the discounts and descriptions

    public double calculateNetWage(); // returning the net wage;
}