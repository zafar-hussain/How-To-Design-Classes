/*a class to describe the collection of balls.
 Movement on a two-dimensional surface suggests
 that a ball object includes two fields, one
per coordinate.
 In addition, the balls also need a radius
*/

/*
Ball is a struct
-- Ball [x,   y,   radius]
-- Ball [int, int, int]
-- radius must stay constant
 */

public class Ball
{
    int x = 0;      // x coordinate of ball
    int y = 0;      // y coordinate of ball
    int radius = 5; //constant radius of the ball

    //constructor
    Ball (int x, int y)
    {
        this.x = x;
        this.y = y;
    }

public static void main (String[] args)
    {
        System.out.println("hi there");
    }

}
