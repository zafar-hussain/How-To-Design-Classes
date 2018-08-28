public class ILogExamples
{
    Date d1 = new Date("June", 5, 2003);
    Date d2 = new Date("June", 6, 2003);
    Date d3 = new Date("June", 23, 2003);

    Entry e1 = new Entry(d1, 5.3, 27, "Good");
    Entry e2 = new Entry(d2, 2.8, 24, "Tired");
    Entry e3 = new Entry(d3, 26.2, 150, "Exhausted");

    ILog l1 = new MtLog();
    ILog l2 = new ConsLog(e1, l1);
    ILog l3 = new ConsLog(e2, l2);
//    ILog l4 = new ConsLog(e3, l3);

    /*
        Exercise 5.1 Translate these two objects of type ILog
        ILog l5 = new ConsLog(e3,l1);
        ILog l6 = new ConsLog(e3,l2);
        into the runner’s world of logs. Assume these examples were constructed
        in the context of the four examples above
     */
//    ILog l5 = new ConsLog(e3, l1);
//    ILog l6 = new ConsLog(e3, l2);

    /*
        Exercise 5.2 Represent the following runner’s log as objects:
        1. on June 15, 2004: 15.3 miles in 87 minutes, feeling great;
        2. on June 16, 2004: 12.8 miles in 84 minutes, feeling good;
        3. on June 23, 2004: 26.2 miles in 250 minutes, feeling dead;
        4. on June 28, 2004: 26.2 miles in 150 minutes, good recovery
    */

    Date d4 = new Date("June", 15, 2004);
    Date d5 = new Date("June", 16, 2004);
    Date d6 = new Date("June", 23, 2004);
    Date d7 = new Date("June", 28, 2004);

    Entry e4 = new Entry(d4, 15.3, 87, "Great");
    Entry e5 = new Entry(d5, 12.8, 84, "Good");
    Entry e6 = new Entry(d6, 26.2, 250, "dead");
    Entry e7 = new Entry(d7, 26.2, 150, "Recovery");

    ConsLog l4 = new ConsLog(e4, l3);
    ConsLog l5 = new ConsLog(e5, l4);
    ConsLog l6 = new ConsLog(e6, l5);
    ConsLog l7 = new ConsLog(e7, l6);


}
