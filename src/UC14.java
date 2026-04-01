/**
 * ===============================================================
 * MAIN CLASS - UseCase14TrainConsistMgmt
 * ===============================================================
 *
 * Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)
 *
 * @author Kunal Krishna
 * @version 1.0
 */

// Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie Class with Validation
class PassengerBogie {
    String name;
    int capacity;

    PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class UC14 {
    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("========================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("========================================\n");

        try {
            // Valid bogie
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created: " + b1);

            // Invalid bogie (will throw exception)
            PassengerBogie b2 = new PassengerBogie("AC Chair", 0);
            System.out.println("Created: " + b2);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}