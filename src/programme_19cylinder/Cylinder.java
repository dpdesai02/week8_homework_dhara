package programme_19cylinder;


    public class Cylinder extends Circle {
        double radius;
        double height;

        public Cylinder(double radius, double height) {

            super(radius);
            if (height < 0) {
                this.height = height;
            } else {
                this.height = height;
            }
        }

        public double getHeight() {

            return this.height;
        }

        public double getVolume() {

            return height * getArea();
        }
    }
