/**
 * Exercise 10.9 Design the class JetFuel, whose purpose it is to represent the sale of some quantity of jet fuel.
 * Each instance contains
 * - quantitySold (in integer gallons),
 * - qualityLevel (a string),
 * - currentBasePrice of jet fuel (in integer cents per gallon).
 * The class should come with two  methods:
 * - totalCost: which computes the cost of the sale, and
 * - discountPrice:  which computes the discounted price.
 * The buyer gets a 10% discount if the sale is for more than 100,000 gallons.
 */


public class JetFuel
{
    private int quantitySold;       // ( in integer gallons)
    private String qualityLevel;    // (a string)
    private int currentBasePrice;   // of jet fuel (in integer cents per gallon).

    // Constructor
    public JetFuel(int quantitySold, String qualityLevel, int currentBasePrice)
    {
        this.quantitySold = quantitySold;
        this.qualityLevel = qualityLevel;
        this.currentBasePrice = currentBasePrice;
    }

    /**
     * - totalCost: which computes the cost of the sale
     * - returns the product of quantitySold and currentBasePrice
     */
    int totalCost() {return this.quantitySold * this.currentBasePrice;}

    /**
     * - discountPrice:  which computes the discounted price.
     * - The buyer gets a 10% discount if the sale is for more than 100,000 gallons.
     * - it is one of :
     * -- quantitySold <= 100000 / gallons -> no discount ; totalCost returned
     * -- else                             -> totalCost deducted by 10% ; return totalCost - totalCost * 0.1
     */
    double discountPrice()
    {
        if (this.quantitySold <= 100000)
        {
            return this.totalCost();                            // no discount
        } else
        {
            return this.totalCost() - (this.totalCost() * 0.1); // 10% discount deducted
        }
    }

}
