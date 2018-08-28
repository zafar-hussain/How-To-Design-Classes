/*
Examples for Restaurant class
 */
public class RestaurantExamples
{
    Place p1 = new Place(7, 65);
    Place p2 = new Place(2, 86);
    Place p3 = new Place(10, 114);

    Restaurant ex1 = new Restaurant("chez nous", "exp", "french", p1);
    Restaurant ex2 = new Restaurant("das Bier", "cheap", "chinese", p2);
    Restaurant ex3 = new Restaurant("sun", "cheap", "chinese", p3);

    ILoR mt = new MTListing();
    ILoR l1 = new ConsListing(ex1, mt);
    ILoR l2 = new ConsListing(ex2, mt);
    ILoR l3 = new ConsListing(ex3, mt);
    ILoR all = new ConsListing(ex1,
            new ConsListing(ex2,
                    new ConsListing(ex3, mt)));


}
