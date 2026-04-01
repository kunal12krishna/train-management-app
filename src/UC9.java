/**
 * ===============================================================
 * MAIN CLASS - UseCase9TrainConsistMgmt
 * ===============================================================
 *
 * Use Case 9: Group Bogies by Type (Collectors.groupingBy)
 *
 * Description:
 * This class demonstrates grouping bogies based on type
 * using Stream API and Collectors.groupingBy().
 *
 * @author Kunal Krishna
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UC9 {
    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("========================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("========================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("AC Chair", 60));

        // Group bogies by type (name)
        Map<String, List<Bogie>> grouped = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped bogies
        System.out.println("Grouped Bogies:");
        for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {
            System.out.println("\n" + entry.getKey() + ":");
            for (Bogie b : entry.getValue()) {
                System.out.println(b);
            }
        }
    }
}