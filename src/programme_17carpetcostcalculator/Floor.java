package programme_17carpetcostcalculator;

public class Floor {
    // two instance variables with both values set to zero
    double length = 0;
    double width = 0;

    // Constructor with two args with initialization
    public Floor(double length, double width) {

        this.length = length;
        this.width = width;
    }

    // Instance method to calculate the area
    public double getArea() {

        double area = this.length * this.width;
        return area;
    }

}


