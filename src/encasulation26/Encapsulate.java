package encasulation26;

public class Encapsulate {

    //private  variable declared these can only be accessed by public methods of class
    private String name;
    private int rollNo;
    private int age;

    //set method for name to access private variable name

    public void setName(String name) {
        this.name = name;
    }
// set method for roll to access private variable rollNo
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
//set method for age to access private variable age
    public void setAge(int age) {
        this.age = age;
    }
    //get method for name to access private variable name
    public String getName() {
        return name;
    }
    // get method for roll to access private variable rollNo

    public int getRollNo() {
        return rollNo;
    }
// get method for age to access private variable age
    public int getAge() {
        return age;
    }
}
