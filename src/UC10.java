/**
 * ===============================================================
 * MAIN CLASS - UseCase10TrainConsistMgmt
 * ===============================================================
 *
 * Use Case 10: Count Total Seats in Train (reduce)
 *
 * Description:
 * This class demonstrates aggregation of bogie capacities
 * using Stream API and reduce().
 *
 * @author Kunal Krishna
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class UC10 {
    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("========================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("========================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        // Calculate total capacity using reduce
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // Display total seating capacity
        System.out.println("Total Seating Capacity: " + totalSeats);
    }
}