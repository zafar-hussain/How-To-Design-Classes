/*Coffee is a structure - kind, price, weight
-- (make-Coffee (string, int, int)
 */


public class Coffee
{
    private String kind;
    private int price;
    private int weight;

    /**
     * constructor
     *
     * @param kind   - String
     * @param price  - int
     * @param weight - int
     */
    // constructor
    Coffee(String kind, int price, int weight)
    {
        this.kind   = kind;
        this.price  = price;
        this.weight = weight;
    }

/**
 * Exercise 10.5 Modify the Coffee class from figure 38 so that cost takes into
 * account bulk discounts:
 * . . . Develop a program that computes the cost of selling bulk
 * coffee at a specialty coffee seller from a receipt that includes
 * the kind of coffee, the unit price, and the total amount (weight)
 * sold. If the sale is for less than 5,000 pounds, there is no discount. For sales of 5,000 pounds to 20,000 pounds, the seller
 * grants a discount of 10%. For sales of 20,000 pounds or more,
 * the discount is 25%. . . .
 * Don’t forget to adapt the examples, too.
 */
}


