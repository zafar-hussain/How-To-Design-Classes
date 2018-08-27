// adding an entry to a log

public class ConsLog
        implements ILog
{
    Entry first;
    ILog rest;

    public ConsLog(Entry first, ILog rest)
    {
        this.first = first;
        this.rest = rest;
    }
}
