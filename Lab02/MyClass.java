import module.Person;

import java.util.Date;
import java.text.SimpleDateFormat;

public class MyClass
{
    public static void main(String args[]) throws Exception
    {
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy/MM/dd");

        Date d;
        d = myFormat.parse("1998/10/23");

        System.out.println(d);

        Person p = new Person("Bap", "P", 19);
        System.out.println(p.getFullName());
        System.out.println(p.getAge());
    }
}