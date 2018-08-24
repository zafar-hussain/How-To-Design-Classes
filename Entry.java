/*
. . . Develop a program that manages a runner’s training log.
Every day the runner enters one entry about the day’s run. Each
entry includes the day’s date, the distance of the day’s run, the
duration of the run, and a comment describing the runner’s
post-run disposition. . . .

Entry is a struct :
Entry (Date, distance, duration, comment)
Entry (Date, int,        int,     String)

Examples :
on June 5, 2003 5.3 miles 27 minutes feeling good
on June 6, 2003 2.8 miles 24 minutes feeling tired
on June 23, 2003 26.2 miles 150 minutes feeling exhausted
*****************************************

Date is a structure:
Date (month,  day,  year)
Date (string, int,  int)

Examples :
June 5, 2003
June 6, 2003
June 23, 2003
 */

public class Entry
{
    Date d;
    double distance;
    int    duration = 0;
    String comment = "";

    Entry(Date d, double distance, int duration, String comment)
    {
        this.d = d;
        this.distance = distance;
        this.duration = duration;
        this.comment  = comment;
    }

    public static void main (String[] args)
    {
        System.out.println(" These are Entries");
    }
}


class ExamplesEntry
{
    Entry e1 = new Entry (new Date ("June", 5, 2003), 5.3, 27, "Feeling good");
    Entry e2 = new Entry (new Date ("June", 6, 2003), 2.8, 24, "Feeling tired");

}