// // . . . Develop a program that can assist railway travelers with
// the arrangement of train trips. The available information about
// a specific train includes its schedule, its route, and whether it is
// local. (The opposite is an express train.) The route information
// consists of the origin and the destination station. A schedule
// // specifies the departure and the arrival times. . . .

// train : schedule route local   
// train : schedule route boolean   

class trains {

    schedule s;
    route    r;
    boolean local;

    trains (schedule s, route r, boolean local)
    {
        this.s      = s;
        this.r      = r;
        this.local  = local;
    }

    public static void main(String[] args) {
                 // Prints "Hello, World" in the terminal window. 
                 System.out.println("Hello, World");
             }
}

// - schedule :     departure arrival
// -          :     time      time
class schedule {
    
    time departure;
    time arrival;

    schedule (time departure, time arrival)
    {
        this.departure = departure;
        this.arrival  = arrival;
    }

}

// -- time    :     day    hours mins
// --         :     string int   int
class time {
    String day;
    int hours;
    int mins;

    time (String day, int hours, int mins)
    {
        this.day   = day;
        this.hours = hours;
        this.mins  = mins;
    };
}
// - route    :   origin destination
// --         :   string string
class route {
    String origin;
    String destination; 

    route (String origin, String destination)
    {
        this.origin      = origin;
        this.destination = destination;
    }
}

class example {

    route r1 = new route ("karachi", "lahore");
    train t = new train (schedule s1, r1, true );

    

}


// public class HelloWorld {
//      public static void main(String[] args) {
//          // Prints "Hello, World" in the terminal window. 
//          System.out.println("Hello, World");
//      }
//  }