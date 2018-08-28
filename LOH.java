// cons first rest
public class LOH
        implements ILOH
{
    House first;
    ILOH rest;

    public LOH(House first, ILOH rest)
    {
        this.first = first;
        this.rest = rest;
    }
}
