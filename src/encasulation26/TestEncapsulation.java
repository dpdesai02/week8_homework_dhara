package encasulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        // setting variable of the variables
        obj.setName("Dhara");
        obj.setAge(38);
        obj.setRollNo(11);
        //Displaying values of the variables
        System.out.println("My name:" + obj.getName());
        System.out.println("My age:" + obj.getAge());
        System.out.println("My rollNo:" + obj.getRollNo());
        // Direct access of rollNo is not possible due to encapsulation
        // System.out.println( My rollNo : " + obj.geekName);



    }



}

