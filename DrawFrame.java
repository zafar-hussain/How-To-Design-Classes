
/*
Exercise 6.2.1.   Evaluate the following expressions in order:

(start 300 300), which opens a canvas;

(draw-solid-line (make-posn 10 10) (make-posn 110 10) 'red), which draws a red line close to, and parallel to, the upper end of the canvas;

(draw-solid-rect (make-posn 10 30) 100 50 'blue), which draws a blue rectangle of width 100 and height 50 parallel to the red line;

(draw-circle (make-posn 110 30) 30 'yellow), which draws a yellow circle of radius 30 centered at the upper right corner of the rectangle;

(draw-solid-disk (make-posn 10 80) 50 'green), which draws a green disk of radius 50 centered at the lower left corner of the rectangle; and

(stop), which closes the canvas.
 */
class Posn
{
    double x;
    double y;

    // constructor
    public Posn(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    //getter for x
    public double getX()
    {
        return x;
    }

    // setter for x
    public void setX(double x)
    {
        this.x = x;
    }

    // getter for y
    public double getY()
    {
        return y;
    }

    // setter for y
    public void setY(double y)
    {
        this.y = y;
    }

    /*
    static boolean fnForPosn (Posn p)
    {
        // .... p.getX();
        // .... p.getY();

        return true;

    }

     */
}
public class DrawFrame
{


    public static Posn makePosn(double x, double y)
    {
        return new Posn(x, y);

    }

    /*
    (draw-solid-line (make-posn 10 10) (make-posn 110 10) 'red),
     which draws a red line close to, and parallel to, the upper end of the canvas;
    :drawSolidLine : Posn Posn -> boolean

     */
    static boolean drawSolidLine(Posn p1, Posn p2)
    {

        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.line(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        return true;
    }

    public static void main(String[] args)
    {
        //(start 300 300), which opens a canvas;
        StdDraw.setCanvasSize(300, 300);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.setXscale(0, 300);
        StdDraw.setYscale(0, 300);

        /*
        (draw-solid-line (make-posn 10 10) (make-posn 110 10) 'red),
        which draws a red line close to, and parallel to, the lower end of the canvas;
         */
        //drawSolidLine(new Posn(10, 10), new Posn(110, 10));

//        (draw-solid-rect (make-posn 10 30) 100 50 'blue), which draws a blue rectangle of width 100 and height 50 parallel to the red line;
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledRectangle(10, 30, 100, 50);
//
//        (draw-circle (make-posn 110 30) 30 'yellow), which draws a yellow circle of radius 30 centered at the upper right corner of the rectangle;

        StdDraw.setPenColor(StdDraw.YELLOW);
        StdDraw.circle(300, 300, 30);
//
//        (draw-solid-disk (make-posn 10 80) 50 'green), which draws a green disk of radius 50 centered at the lower left corner of the rectangle; and

        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.filledCircle(0, 0, 50);
//
//        (stop), which closes the canvas.
    }
}