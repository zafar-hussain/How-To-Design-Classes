/*
class Date is a struct :
-- Date [day, month, year]
-- Date [int, int,   int]

 */

public class Date
{
    String month;
    int day;
    int year;

    /* constructor */
    Date (String month, int day, int year)
    {
        this.month = month;
        this.day   = day;
        this.year  = year;
    }




public static void main (String[] args)
    {
        // examples :
        Date d1 = new Date ("May",  6, 2003);
        Date d2 = new Date ("June", 6, 2006);

        System.out.println("hi there");
    }

}
