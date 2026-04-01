/**
 * ===============================================================
 * MAIN CLASS - UseCase11TrainConsistMgmt
 * ===============================================================
 *
 * Use Case 11: Validate Train ID & Cargo Codes (Regex)
 *
 * Description:
 * This class demonstrates validation of Train ID and Cargo Code
 * using Regular Expressions (Pattern & Matcher).
 *
 * @author Kunal Krishna
 * @version 1.0
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC11 {
    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("========================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("========================================\n");

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter Train ID: ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = scanner.nextLine();

        // Regex patterns
        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        // Matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validation
        if (trainMatcher.matches()) {
            System.out.println("Train ID is valid.");
        } else {
            System.out.println("Invalid Train ID format.");
        }

        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is valid.");
        } else {
            System.out.println("Invalid Cargo Code format.");
        }

        scanner.close();
    }
}