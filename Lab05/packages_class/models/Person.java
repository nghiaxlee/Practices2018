package models;

import java.util.Date;

public class Person
{
    // My Attributes.
    private String name;
    private String family_name;
    private int age;
    private Date birthday;

    // Constructors.
    public Person()
    {}

    public Person(String name, String family_name)
    {
        this.name = name;
        this.family_name = family_name;
    }

    public Person(String name, String family_name, int age)
    {
        this.name = name;
        this.family_name = family_name;
        this.age = age;
    }

    // Getters and Setters.
    public String getName()
    {
        return name;
    }

    public String getFamilyName()
    {
        return family_name;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setFamilyName(String family_name)
    {
        this.family_name = family_name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    // customize methods.
    public String getFullName()
    {
        return name + " " + family_name;
    }

    // equals

    // toString
}