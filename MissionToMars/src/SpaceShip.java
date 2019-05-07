/**
 * Create a SpaceShip Interface that includes the definitions of these methods:
 */
public interface SpaceShip {
    //a method return true or false indicating if the launch was successful or not
    boolean launch();

    //a method returns true or false based on the success of landing
    boolean land();

    //a method that takes an Item as an argument and return true or false if it will exceed the weight limit
    boolean canCarry(Item item);

    //a method takes an Item object and updates the current weight of the rocket;
    int carry(Item item);
}
