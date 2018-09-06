public class Square
// square is belong to the union IShape
    implements Ishape
{

    // square requires a side and an origin

    int side;
    CartPt loc;

    // constructor


    public Square(int side, CartPt loc)
    {
        this.side = side;
        this.loc = loc;
    }

    /**
     *
     * @return
     *
     * public xxx fnForSquare()
     *     {
     *         ... this.loc.nnn();
     *         ... this.side;
     *         return xxx;
     *     }
     */


}
