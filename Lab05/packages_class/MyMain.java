import models.Person;

import java.util.Date;
import java.text.SimpleDateFormat;

public class MyMain
{
    public static void main(String args[])
    {
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy/MM/dd");

        Date d = null; // Need initialize first.

        try {
            d = myFormat.parse("");
        } catch (NullPointerException e) {
            System.out.println("The date is empty!");
            System.exit(-1);
        } catch (java.text.ParseException e) {
            System.out.println("Parse error!");
            System.exit(-1);
        }

        System.out.println(d);

        Person p = new Person("Bap", "P", 19);
        System.out.println(p.getFullName());
        System.out.println(p.getAge());
    }
}