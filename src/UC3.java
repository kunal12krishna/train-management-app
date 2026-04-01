/**
 * ===============================================================
 * MAIN CLASS - UseCase3TrainConsistMgmt
 * ===============================================================
 *
 * Use Case 3: Track Unique Bogie IDs (Set – HashSet)
 *
 * Description:
 * This class demonstrates how to ensure uniqueness of bogie IDs
 * using HashSet.
 *
 * At this stage, the application:
 * - Adds bogie IDs (including duplicates)
 * - Automatically removes duplicates
 * - Displays unique bogie IDs
 *
 * This use case introduces Set and HashSet for uniqueness.
 *
 * @author Kunal Krishna
 * @version 1.0
 */

import java.util.HashSet;
import java.util.Set;

public class UC3 {
    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("========================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("========================================\n");

        // Create a HashSet for bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs:");
        System.out.println(bogieIDs);
    }
}