/**
 * ===============================================================
 * MAIN CLASS - UseCase8TrainConsistMgmt
 * ===============================================================
 *
 * Use Case 8: Filter Passenger Bogies Using Streams
 *
 * Description:
 * This class demonstrates filtering bogies based on capacity
 * using Java Stream API.
 *
 * @author Kunal Krishna
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class UC8 {
    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("========================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("========================================\n");

        // Create list of bogies (same as UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        // Filter bogies with capacity > 60
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("Filtered Bogies (capacity > 60):");
        for (Bogie b : filtered) {
            System.out.println(b);
        }

        // Show original list unchanged
        System.out.println("\nOriginal Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}