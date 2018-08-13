 #lang profj/beginner
 
// first commit

// GPS locations
// GPSlocation is a struct : int latitude int longitude
class GPSlocation {
    double latitude;            // degrees
    double longitude;           //degrees

    GPSlocation (double latitude, double longitude){
        this.latitude  = latitude;
        this.longitude = longitude;
    }
}

// Exercise 2.1 Formulate the examples of information from the GPS problem as instances of GPSLocation.
class GPSProblems {
                   GPSLocation A = new GPSLocation (42.34, 71.09);

                   GPSProblems () {}
                   }


                               
                