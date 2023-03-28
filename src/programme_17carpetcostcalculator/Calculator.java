package programme_17carpetcostcalculator;

public class Calculator {
    Floor floor;
    Carpet carpet;

    // Constructor with two args with initialization
    public Calculator(Floor floor, Carpet carpet){

        this.floor=floor;
        this.carpet=carpet;
    }

    // Instance method to calculate the total cost to cover floor with carpet
    public double getTotalCost(){
        double totalCost;
        totalCost=floor.getArea()* carpet.getCost();
        return totalCost;
    }


}


