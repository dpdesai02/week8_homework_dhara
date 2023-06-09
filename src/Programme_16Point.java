
/*Point
You have to represent a point in 2D space. Write a class with the name Point. The class needs two
fields (instance variables) with name x and y of type int.
The class needs to have two constructors. The first constructor does not have any parameters (no-arg
constructor). The second constructor has parameters x and y of type int and it needs to initialize the
fields.
Write the following methods (instance methods):
* Method named getX without any parameters, it needs to return the value of x field.
* Method named getY without any parameters, it needs to return the value of y field.
* Method named setX with one parameter of type int, it needs to set the value of the x field.
* Method named setY with one parameter of type int, it needs to set the value of the y field.
* Method named distance without any parameters, it needs to return the distance between this
Point and Point 0,0 as double.
* Method named distance with two parameters x, y both of type int, it needs to return the distance
between this Point and Point x,y as double.
* Method named distance with parameter another of type Point, it needs to return the distance
between this Point and another Point as double.
How to find the distance between two points?
To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
Where √ represents square root.

 */

public class Programme_16Point {

    int x, y;

    // First constructor without args.
    public Programme_16Point() {

    }

    // Second constructor with args.
    public Programme_16Point(int x, int y) {

        this.x = x;
        this.y = y;
    }

    // getX instance method without any parameters
    public int getX() {
        return x;
    }

    // get instance method without any parameters
    public int getY() {
        return y;
    }

    // setX instance method with one parameter
    public int setX(int x) {
        return x;
    }

    // setY instance method with one parameter
    public int setY(int y) {
        return y;
    }

    /*distance method without parameter with double return type
    to calculate distance between two points
    */
    public double distance() {

        return Math.sqrt((x * x) + (y * y));
    }

    /*distance method with two parameter with double return type
    to calculate distance between two points
    */
    public double distance(int x, int y) {

        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    /*distance method with parameter with double return type
        to calculate distance between two points
        */
    public double distance(Programme_16Point point1) {
        return Math.sqrt((this.x - point1.getX()) * (this.x - point1.getX()) +
                (this.y - point1.getY()) * (this.y - point1.getY()));
    }

    public static void main(String[] args) {

        Programme_16Point first = new Programme_16Point(6, 5);
        Programme_16Point second = new Programme_16Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Programme_16Point point = new Programme_16Point();
        System.out.println("distance()= " + point.distance());
    }
}

