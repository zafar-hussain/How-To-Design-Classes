public class Square
// square is belong to the union IShape
    implements Ishape
{
    // square requires a side and an origin

    int side;
    CartPt origin;

    // constructor

    Square (int side, CartPt origin)
    {
        this.side = side;
        this.origin = origin;
    }

}
