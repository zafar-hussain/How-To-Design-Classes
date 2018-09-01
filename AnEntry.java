public class AnEntry
{
    private String name;
    private int zip;
    private String phone;

    // Constructor
    private AnEntry(String name, int zip, String phone)
    {
        this.name = name;
        this.zip = zip;
        this.phone = phone;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getZip()
    {
        return zip;
    }

    public void setZip(int zip)
    {
        this.zip = zip;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public static void main(String[] args)
    {
        AnEntry phoneBook = new AnEntry("peter lee",
                15270,
                "606-7771");

        System.out.println(phoneBook.getName());
        System.out.println(phoneBook.name);
    }
}
