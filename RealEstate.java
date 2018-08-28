
/*
Exercise 3.1 Design a data representation for this problem:
. . . Develop a “real estate assistant” program. The “assistant” helps real estate agents
 locate available houses for clients.

The information about a house includes its kind, the number of
rooms, its address, and the asking price. An address consists of
a street number, a street name, and a city. . . .

Represent the following examples using your classes:
1. Ranch, 7 rooms, $375,000, 23 Maple Street, Brookline;
2. Colonial, 9 rooms, $450,000, 5 Joye Road, Newton; and
3. Cape, 6 rooms, $235,000, 83 Winslow Road, Waltham.
 */

/*
interface ILOH
is one (union) of :
- empty             - class mt
- (cons House LOH)  - class LOH

LOH - is one of (ListOfHouses)
- first - house
- ILOH


House is a Structure comprising : - class house
- kind          - string
- rooms         - int
- address       - string
- price         - int
- street-number - int
- street-name   - string
- city          - string
 */


public class RealEstate
{
    House h1 = new House("ranch", 7, "", 375000, 23, "maple Street", "brooklin");
    House h2 = new House("Colonial", 9, "", 450000, 5, "Joyce Road", "Newton");
    House h3 = new House("Cape", 6, "", 235000, 83, "winslow road", "Waltham");

    ILOH empty = new mt();
    ILOH l1 = new LOH(h1, empty);
    ILOH l2 = new LOH(h2, l1);
    ILOH l3 = new LOH(h3, l2);






}