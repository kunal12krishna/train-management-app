/**
 * ===============================================================
 * MAIN CLASS - UseCase4TrainConsistMgmt
 * ===============================================================
 *
 * Use Case 4: Maintain Ordered Bogie IDs (LinkedList)
 *
 * Description:
 * This class demonstrates maintaining ordered train consist
 * using LinkedList.
 *
 * At this stage, the application:
 * - Adds bogies in order
 * - Inserts a bogie in between
 * - Removes first and last bogies
 * - Displays final ordered consist
 *
 * This use case introduces LinkedList and node-based structure.
 *
 * @author Kunal Krishna
 * @version 1.0
 */

import java.util.LinkedList;

public class UC4 {
    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("========================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("========================================\n");

        // Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry");

        // Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Display final consist
        System.out.println("Final Train Consist:");
        System.out.println(trainConsist);
    }
}