/*
    Try This 1-1
    
    This program converts gallons to liters.
 */

package galtolit;

/**
 *
 * @author Jim
 */
public class GalToLit {

    public static void main(String[] args) {
        double gallons;  //  holds the number of gallons
        double liters;  //  holds conversion to liters
        gallons = 10;  //  start with 10 gallons
        liters = gallons * 3.7854;  //  convertto liters
        
        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
    
}
