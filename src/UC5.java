/**
 * ===============================================================
 * MAIN CLASS - UseCase5TrainConsistMgmt
 * ===============================================================
 *
 * Use Case 5: Preserve Insertion Order of Bogies (LinkedHashSet)
 *
 * Description:
 * This class demonstrates maintaining insertion order while
 * ensuring uniqueness using LinkedHashSet.
 *
 * At this stage, the application:
 * - Adds bogies
 * - Prevents duplicates automatically
 * - Preserves insertion order
 * - Displays final formation
 *
 * @author Kunal Krishna
 * @version 1.0
 */

import java.util.LinkedHashSet;
import java.util.Set;

public class UC5 {
    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("========================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("========================================\n");

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        trainFormation.add("Sleeper");

        // Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(trainFormation);
    }
}