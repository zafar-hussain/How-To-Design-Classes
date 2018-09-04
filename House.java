public class House
{
    private String kind;
    private int rooms;
    private int price;
    private int streetNumber;
    private String streetName;
    private String city;

    public House(String kind, int rooms, int price, int streetNumber, String streetName, String city)
    {
        this.kind = kind;
        this.rooms = rooms;
        this.price = price;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
    }


    /**
     * 1. isBigger, which determines whether one house has more rooms than some other house;
     * returns true if house1.rooms >= house2.rooms
     */
    boolean isBigger(House h) {return this.rooms >= h.rooms;}

    /**
     * 2. thisCity, which checks whether the advertised house is in some given
     * //        city
     *
     * @param cityName // string
     * @return boolean
     */
    boolean thisCity(String cityName) {return this.city == cityName;}


    /**
     * 3. sameCity, which determines whether one house is in the same city as
     * some other house.
     */

    boolean sameCity(House h) {return this.thisCity(h.city);}

}