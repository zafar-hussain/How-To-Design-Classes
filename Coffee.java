/*Coffee is a structure - kind, price, weight
-- (make-Coffee (string, int, int)
 */


public class Coffee
{
    String kind;
    int price;
    int weight;




    // constructor
    Coffee (String kind, int price, int weight)
    {
        this.kind   = kind;
        this.price  = price;
        this.weight = weight;
    }


public static void main (String[] args)
    {
        Coffee a = new Coffee(
                    "Arabian",
                    800,
                    100);

        System.out.println("hi there");
    }

}
