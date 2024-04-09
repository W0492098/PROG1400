/**
 * Author: Damon Rimmington
 * Date: April 03, 2024
 * File name: HotWings.java
 * Purpose: To be Hot Wings
 */

/**
 * Hotwings enemy class derives from Boss.
 */

public class HotWings extends Boss {
    /**
     * HotWings constructors
     * @param health HotWings health
     */
    public HotWings(int health, int stunDelay)  {
        super(health, stunDelay);
    }
    public void fly() {
        System.out.println("Hot wings flies around.");
    }
    public void lava() {
        System.out.println("Lava rises, the end is near!");
    }

}
