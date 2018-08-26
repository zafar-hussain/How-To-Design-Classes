public class Circle
    implements Ishape
{
// a circle requires a radius and a centre point
    int radius = 0;
    CartPt centre;


    public Circle(int radius, CartPt centre)
    {
        this.radius = radius;
        this.centre = centre;
    }
}
