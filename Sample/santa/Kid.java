package santa;

public class Kid
{
    private int YoB;
    private String name;
    private String gender;
    private boolean goodKid;

    public Kid(int y, String n, String gen, boolean good)
    {
        YoB = y;
        name = n;
        gender = gen;
        goodKid = good;
    }

    public int getAge()
    {
        return 2017 - YoB;
    }

    // Getters and Setters

    // toString
    public String toString()
    {
        return name + "(" + getAge() + "," + gender + ")";
    }
}