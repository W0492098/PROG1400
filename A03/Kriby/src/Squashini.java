/**
 * Author: Damon Rimmington
 * Date: April 03, 2024
 * File name: Squashini.java
 * Purpose: To be Squashini
 */

public class Squashini extends Boss {
    public Squashini(int health, int stunDelay) {
        super(health, stunDelay);
    }
    public void floats() {
        System.out.println("Squashini floats around.");
    }
    public void hat() {
        System.out.println("Squashini hides in his hat, like a coward.");
    }
}
