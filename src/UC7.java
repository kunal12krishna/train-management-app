/**
 * ===============================================================
 * MAIN CLASS - UseCase7TrainConsistMgmt
 * ===============================================================
 *
 * Use Case 7: Sort Bogies by Capacity (Comparator)
 *
 * Description:
 * This class demonstrates sorting bogie objects based on
 * capacity using Comparator.
 *
 * @author Kunal Krishna
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UC7 {
    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("========================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("========================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        // Sort by capacity
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("Bogies sorted by capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}