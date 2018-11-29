import models.Driver;

public class MyMain
{
    public static void main(String args[])
    {
        Driver a = new Driver("LMN", "A", 100, 10, "10 'cause I like it'");
        Driver b = new Driver("NML", "B", 200, 5, "5 for nothing");
        a.setAditionalNightHours(10);
        b.setAditionalNightHours(20);
        a.setGottenFines(23.3);
        b.setGottenFines(10.8);
        System.out.println(a);
        System.out.println(b);
    }
}