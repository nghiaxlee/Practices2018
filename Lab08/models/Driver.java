package models;

public class Driver extends Person implements PaymentCheck
{
    private String license;
    private String description;
    private double fines;
    private double salary;
    private double discounts;
    private int extra;

    public Driver(String name, String license, double salary, double discounts, String description)
    {
        super(name);
        this.license = license;
        this.salary = salary;
        this.discounts = discounts;
        this.description = description;
    }

    public void setAditionalNightHours(int hours)
    {
        extra = hours;
    }

    public void setGottenFines(double fines)
    {
        this.fines = fines;
    }

    public double getGrossWage()
    {
        return salary + 40 * extra;
    }

    public String getDiscounts()
    {
        return description;
    }

    public double calculateNetWage()
    {
        return getGrossWage() + discounts - fines;
    }

    public String toString()
    {
        return "Gross Wage: " + getGrossWage()
            + "\nDiscounts: " + discounts
            + "\nDiscounts description: " + description
            + "\nNet Wage: " + calculateNetWage() + '\n';
    }
}