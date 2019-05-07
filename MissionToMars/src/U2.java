/**
 * U-2
 * Rocket cost = $120 Million
 * Rocket weight = 18 Tonnes
 * Max weight (with cargo) = 29 Tonnes
 * Chance of launch explosion = 4% * (cargo carried / cargo limit)
 * Chance of landing crash = 8% * (cargo carried / cargo limit)
 */

public class U2 extends Rocket {
    @Override
    public boolean land() {
        //obtain a int number between [0 - 1]
        double n = Math.random();
        double explosionChance = 0.08 * (super.currentWeight/29);
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
        double explosionChance = 0.04 * (super.currentWeight/29);
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
     * Max weight (with cargo) = 29 Tonnes
     */
    public boolean canCarry(Item item) {
        if (super.carry(item) > 29){
            return false;
        }
        else {
            return true;
        }
    }
}
