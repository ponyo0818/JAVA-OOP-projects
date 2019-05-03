public class Main {
    public static void main (String [] args){
       /* for (int i = 0; i < 100; i++){
            Person person = new Person();
            System.out.println(person.count);
            System.out.println(person.localCounter);
        }*/
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        // Print the values of both counters
        System.out.println("(" + person4.localCounter + "," + Person.instanceCounter + ")");
    }

}
