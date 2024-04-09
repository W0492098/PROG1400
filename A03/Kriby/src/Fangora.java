/**
 * Author: Damon Rimmington
 * Date: April 03, 2024
 * File name: Fangora.java
 * Purpose: To be Fangora
 */

public class Fangora extends Boss {
    public Fangora(int health, int stunDelay) {
        super(health, stunDelay);
    }
    public void blow() {
        System.out.println("Fangora blows air.");
    }
    public void fly() {
        System.out.println("Fangora flies around.");
    }

}
