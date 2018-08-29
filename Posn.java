/*
Class Posn is a compound structure
- Posn -> make-struct x y
- posn -> int int

(fn-for-Posn p
(
    cond
        [(empty? p) (...)]
        [(Posn? p)
            ... (Posn-x p)
            ... (Posn-y p)
        ]
)
*/
public class Posn
{
    int x;
    int y;

    public Posn(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public double distanceToZero()
    {
        return Math.sqrt((getX() * getX()) + (getY() * getY()));
    }


    public static void main(String[] args)
    {
        Posn a = new Posn(1, 2);
        System.out.println(a.distanceToZero());

    }

}


