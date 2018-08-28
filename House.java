public class House
{
    String kind;
    int rooms;
    int price;
    int streetNumber;
    String streetName;
    String city;

    public House(String kind, int rooms, String address, int price, int streetNumber, String streetName, String city)
    {
        this.kind = kind;
        this.rooms = rooms;
        this.price = price;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
    }
}
