/**
 * Author: Damon Rimmington
 * Date: April 03, 2024
 * File name: Player.java
 * Purpose: To determine what the Kribys have
 */

public abstract class Player {
    private int health; // Health of the Kriby
    /**
     * Getter method to retrieve the current health of the Kriby.
     * @return Current health of the Kriby
     */
    public int getHealth() {
        return health;
    }
    /**
     * Setter method to set the health of the Kriby.
     * @param health New health value to set
     */
    public void setHealth(int health) {
        this.health = health;
    }
    public abstract void shapeshift();
}
