/*
Develop a GPS-based navigation program for cars. The GPS
device feeds the program with the current location at least once
a second. The location is given as latitude and longitude.
Examples:
1. latitude 33.5, longitude 86.8;
2. latitude 40.2, longitude 72.4; and
3. latitude 49.0, longitude 110.3


GPSlocation is a struct :
-- GPSlocation [latitude, longitude]
-- GPSlocation [double,  double]
 */

public class GPSlocation
{
    double latitude = 0.0;
    double longitude = 0.0;

    GPSlocation(double latitude, double longitude)
    {
        this.latitude  = latitude;
        this.longitude = longitude;
    }

public static void main (String[] args)
    {
        GPSlocation g1 = new GPSlocation(33.5,
                86.8);
        GPSlocation g2 = new GPSlocation(40.2,
                72.4);
        GPSlocation g3 = new GPSlocation(49.0,
                110.3);

        System.out.println("hi there");
    }

}
