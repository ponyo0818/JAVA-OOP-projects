/**
 * U-1
 * Rocket cost = $100 Million
 * Rocket weight = 10 Tonnes
 * Max weight (with cargo) = 18 Tonnes
 * Chance of launch explosion = 5% * (cargo carried / cargo limit)
 * Chance of landing crash = 1% * (cargo carried / cargo limit)
 */

public class U1 extends Rocket {


    @Override
    public boolean land() {
        //obtain a int number between [0 - 1]
        double n = Math.random();
        double explosionChance = 0.01 * (super.currentWeight/18);
        //if landing was failed
        if (n < explosionChance){
            return false;
        }
        //if landing was successful
        else {
            return true;
        }
    }

    @Override
    public boolean launch() {
        double n = Math.random();
        double explosionChance = 0.05 * (super.currentWeight/18);
        //if launching was failed
        if (n < explosionChance){
            return false;
        }
        //if launching was successful
        else {
            return true;
        }
    }

    @Override
    /**
     * Max weight (with cargo) = 18 Tonnes
     */
    public boolean canCarry(Item item) {
        if (super.carry(item) > 18){
            return false;
        }
        else {
            return true;
        }
    }
}
