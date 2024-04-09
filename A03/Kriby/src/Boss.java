/**
 * Author: Damon Rimmington
 * Date: April 03, 2024
 * File name: Boss.java
 * Purpose: To determine what the bosses have
 */

/**
 * Boss class
 */

public class Boss {
    private int health; // Health of the boss
    private int stunDelay; // Delay before boss can recover from stun
    private int stunLeft; // Remaining stun duration

    /**
     * Getter method to retrieve the current health of the boss.
     * @return Current health of the boss
     */
    public int getHealth() {
        return health;
    }
    /**
     * Getter method to retrieve the stun delay of the boss.
     * @return Stun delay of the boss
     */
    public int getStunDelay() {
        return stunDelay;
    }
    /**
     * Setter method to set the health of the boss.
     * @param health New health value to set
     */
    public void setHealth(int health) {
        this.health = health;
    }
    /**
     * Setter method to set the stun delay of the boss.
     * @param stunDelay New stun delay value to set
     */
    public void setStunDelay(int stunDelay) {
        this.stunDelay = stunDelay;
    }
    /**
     * Constructor to initialize the Boss object with given health and stun delay.
     * @param health Initial health of the boss
     * @param stunDelay Delay before boss can recover from stun
     */
    public Boss(int health, int stunDelay) {
        this.health = health;
        this.stunDelay = stunDelay;
        this.stunLeft = 0; // Initially not stunned
    }
    /**
     * Method to perform an attack action by the boss.
     */
    public void attack() {
        if (stunLeft == 0) {
            System.out.println("Boss attacks");
        }
        else {
            System.out.println("The boss can't attack when stunned");
            recover();
        }
    }
    /**
     * Method to reduce the remaining stun duration of the boss.
     */
    public void recover() {
        stunLeft -= 1;
    }

}
