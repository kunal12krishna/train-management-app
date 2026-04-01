/**
 * ===============================================================
 * MAIN CLASS - UseCase2TrainConsistMgmt
 * ===============================================================
 *
 * Use Case 2: Add Passenger Bogies to Train (ArrayList Operations)
 *
 * Description:
 * This class demonstrates dynamic insertion, deletion, and
 * inspection of passenger bogies using ArrayList.
 *
 * At this stage, the application:
 * - Adds passenger bogies
 * - Displays bogies
 * - Removes a bogie
 * - Checks existence of a bogie
 *
 * This use case introduces CRUD operations using ArrayList.
 *
 * @author Kunal Krishna
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class UC2 {
    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("========================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("========================================\n");

        // Create list for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after addition
        System.out.println("Passenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a bogie
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence
        System.out.println("\nDoes Sleeper exist? " + passengerBogies.contains("Sleeper"));

        // Final state
        System.out.println("\nFinal Passenger Bogies:");
        System.out.println(passengerBogies);
    }
}