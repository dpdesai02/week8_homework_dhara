package programme_17carpetcostcalculator;

public class Carpet {

        double cost;

        // Constructor with one parameter with initialization
        public Carpet(double cost) {

            // if condition to set cost value to 0.
            if (cost < 0) {
                this.cost = 0;
            } else {
                this.cost = cost;
            }
        }

        // Instance variable with no parameters to return the cost value from Carpet constructor
        public double getCost() {

            return this.cost;
        }

    }


