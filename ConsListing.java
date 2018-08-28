/*
ConsListing is a structure :
- first : Restaurant
- rest : ILoR (Interface List Of Restaurant)
 */
public class ConsListing
        implements ILoR
{
    Restaurant first;
    ILoR rest;

    // Constructor
    public ConsListing(Restaurant first, ILoR rest)
    {
        this.first = first;
        this.rest = rest;
    }
}
