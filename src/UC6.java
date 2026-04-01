/**
 * ===============================================================
 * MAIN CLASS - UseCase6TrainConsistMgmt
 * ===============================================================
 *
 * Use Case 6: Map Bogie to Capacity (HashMap)
 *
 * Description:
 * This class demonstrates mapping bogies to their seating or
 * load capacity using HashMap.
 *
 * At this stage, the application:
 * - Stores bogie-capacity pairs
 * - Uses key-value mapping
 * - Iterates and displays all entries
 *
 * @author Kunal Krishna
 * @version 1.0
 */

import java.util.HashMap;
import java.util.Map;

public class UC6 {
    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("========================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("========================================\n");

        // Create HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Insert values
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Display entries
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}