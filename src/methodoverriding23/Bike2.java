package methodoverriding23;
//creating a child class
class Bike2 extends Vehicle {
    //defining the same method as in the parent Class
    public void run(){
        System.out.println("Bike is running safely");
        Bike2 obj = new Bike2();//creating object
        obj.run();//calling method
    }
}
