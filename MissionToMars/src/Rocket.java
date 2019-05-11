public class Rocket implements SpaceShip {


    /**
     *  launch and land methods in the Rocket class should always return true. When U1 and U2
     *  classes extend the Rocket class they will override these methods to return true or
     *  false based on the actual probability of each type
     * @return
     */
    int currentWeight = 0;
    int rocketCost;

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public int carry(Item item) {
        currentWeight+= item.weight;
        return currentWeight;
    }

    @Override
    public boolean canCarry(Item item) {
        return false;
    }
}
