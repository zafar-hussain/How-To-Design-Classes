/*
class Date is a struct :
-- Date [day, month, year]
-- Date [int, int,   int]

 */

public class Date
{
    int day;
    int month;
    int year;

    /* constructor */
    Date (int day, int month, int year)
    {
        this.day   = day;
        this.month = month;
        this.year  = year;
    }




public static void main (String[] args)
    {
        // examples :
        Date d1 = new Date (5, 6, 2003);
        Date d2 = new Date (6, 6, 2006);

        System.out.println("hi there");
    }

}
