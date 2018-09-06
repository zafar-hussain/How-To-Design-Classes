public class Circle
    implements Ishape
{
    // a circle requires a radius and a loc point
    int radius = 0;
    CartPt loc;


    public Circle(int radius, CartPt loc)
    {
        this.radius = radius;
        this.loc = loc;
    }

    /**
     *
     * @return
     *
     * public xxx fnForCircle()
     *     {
     *         ... this.loc.nnn();
     *         ... this.radius;
     *     }
     */
}
