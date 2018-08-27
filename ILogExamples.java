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
    ILog l4 = new ConsLog(e3, l3);

}
