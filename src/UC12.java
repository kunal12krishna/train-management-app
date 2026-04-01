/**
 * ===============================================================
 * MAIN CLASS - UseCase12TrainConsistMgmt
 * ===============================================================
 *
 * Use Case 12: Safety Compliance Check for Goods Bogies
 *
 * Description:
 * This class validates safety rules for goods bogies using
 * Stream API and allMatch().
 *
 * @author Kunal Krishna
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class UC12 {
    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("========================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("========================================\n");

        // Create goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical"));
        goodsBogies.get(0).setCargo("Petroleum");

        goodsBogies.add(new GoodsBogie("Open"));
        goodsBogies.get(1).setCargo("Coal");

        goodsBogies.add(new GoodsBogie("Box"));
        goodsBogies.get(2).setCargo("Grain");

        // Safety validation
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        // Display result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT.");
        } else {
            System.out.println("Train is NOT SAFE.");
        }
    }
}