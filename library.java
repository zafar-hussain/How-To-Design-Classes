 //#lang profj/beginner

//;Exercise 2.2 Take a look at this problem statement:
//;
//;. . . Develop a program that assists bookstore employees. For
//;each book, the program should track the book’s title, its price,
//;its year of publication, and the author’s name. . . .
//;
//;Develop an appropriate class diagram (by hand) and implement it with a
//;class. Create instances of the class to represent these three books:
//;
//;1. Daniel Defoe, Robinson Crusoe, $15.50, 1719;
//;2. Joseph Conrad, Heart of Darkness, $12.80, 1902;
//;3. Pat Conroy, Beach Music, $9.50, 1996.
//;
//;What does new Book("D. P. Friedman","The Little LISPer",900,1974) mean?
//;Does the question make sense? What do you need to know to interpret this
//;piece of data?

// (define-struct  book [title price year author])
//  - a compound structure : string double integer string

// class diagramm
//       book
//  string title
//  double price
//  year   ineger
//  string author

class book {
            String title;
            double price;
            int year;
            String author;

            book (String title, double price, int year, String author)
            {
             this.title = title;
             this.price = price;
             this.year  = year;
             this.author = author;}
            }

//1. Daniel Defoe, Robinson Crusoe, $15.50, 1719;
//2. Joseph Conrad, Heart of Darkness, $12.80, 1902;
//3. Pat Conroy, Beach Music, $9.50, 1996.                                                             

class books 
{
 book A = new book ("Robinson Crusoe", 15.50, 1719, "Daniel Dafoe");
 book B = new book ("Heart of Darkness", 12.80, 1902, "joseph Conrad");
 book C = new book ("Beach Music", 9.50, 1996, "Pat Conroy");
      
       books () {}}


//;Exercise 2.3 Add a constructor to the following partial class definition and
//;draw the class diagram (by hand):
//;
//;// represent computer images
//;class Image {
//;                 int height; // pixels
//;                 int width; // pixels
//;                 String source; // file name
//;                 String quality; // informal
//;. . .
//;}
//;
//;The class definition was developed for this problem statement:
//;. . . Develop a program that creates a gallery from image descriptions that specify the height, width, and name of the source
//;file, plus some additional information about their quality

// represent computer images
class Image {
                 int height;     // pixels
                 int width;      // pixels
                 String source;  // file name
                 String quality; // informal
                 String gallery = "zafar's place"; // location of the image

           Image (int height, int width, String source, String quality)
           {
            this.height  = height;
            this.width   = width;
            this.source  = source;
            this.quality = quality;
            
            }
}

//;                Automobile
//;            String         model
//;            int            price    [in dollars]
//;            double         mileage  [in miles per gallon]
//;            boolean        used
//;
//;// A class diagram for automobiles

class Automobile
{
 String model;
 int    price;       // dollars
 double  mileage;    // miles per gallons
 boolean used;       // whether it id used or nor

 Automobile (String model, int price, double mileage, boolean used)
 {
  this.model  = model;
  this.price  = price;
  this.mileage = mileage;
  this.used   = used;
  }
 }

 public class HelloWorld {
     public static void main(String[] args) {
         // Prints "Hello, World" in the terminal window.
         System.out.println("Hello, World");
     }
 }