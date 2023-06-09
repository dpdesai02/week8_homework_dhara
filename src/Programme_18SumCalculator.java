public class Programme_18SumCalculator {
    public static void main(String[] args) {
        Programme_18SumCalculator calculator =  new Programme_18SumCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }

    double firstNumber;
    double secondNumber;

    public double getFirstNumber() {

        return this.firstNumber;
    }

    public double getSecondNumber() {

        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumber) {

        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {

        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {

        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {

        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {

        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {

        if (secondNumber == 0) {
            return 0;
        } else {
            return firstNumber / secondNumber;
        }
    }
}