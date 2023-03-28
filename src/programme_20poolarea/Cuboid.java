package programme_20poolarea;

public class Cuboid extends Rectangle{
    double height;
    public Cuboid(double width, double height, double lenght) {
        super(width, lenght);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return getArea() * height;
    }

}


