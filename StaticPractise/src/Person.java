public class Person {

    public static int instanceCounter; //static counter, associated with class, rather than with any object
    // static field/class variable
    public int localCounter; //local counter, for each object
    //each object has its own values for it and stored in different memory locations


    //default constructor
    public Person(){
        instanceCounter++;
        localCounter++;
    }
}
