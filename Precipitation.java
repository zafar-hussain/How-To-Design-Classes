// Exercise 10.8 Study this class definition:
//// the daily precipitation of three consecutive days
class Precipitation
{
    int day1;
    int day2;
    int day3;

    Precipitation(int day1, int day2, int day3)
    {
        this.day1 = day1;
        this.day2 = day2;
        this.day3 = day3;
    }

    // how much did it rain during these three days?
    int cumulative()
    {
        return this.day1 + this.day2 + this.day3;
    }


    /**
     * Add the method average to this class definition. Follow the design recipe
     * and reuse existing methods, if possible.
     * - returns division of cumulative sum of day's precipitations and the number of
     *
     * @return double
     */
    double average() {return this.cumulative() / 3.0;}
}
