/*
Restaurant class
restaurant: its name, the kind of food it serves, its
price range, and the closest intersection (street/avenue)
 */

public class Restaurant
{
    String name;
    String priceRange;
    String food;
    Place address;

    // Constructor


    public Restaurant(String name, String priceRange, String food, Place address)
    {
        this.name = name;
        this.priceRange = priceRange;
        this.food = food;
        this.address = address;
    }
}

