import java.util.HashSet;

public class TrainConsistManagementApp {

    String trainName;
    HashSet<String> bogies;

    // Constructor
    public TrainConsistManagementApp(String trainName) {
        this.trainName = trainName;
        this.bogies = new HashSet<>();
    }

    // Add bogie (no duplicates)
    public void addBogie(String bogieId) {
        if (bogies.add(bogieId)) {
            System.out.println(bogieId + " added successfully");
        } else {
            System.out.println("Duplicate bogie not allowed: " + bogieId);
        }
    }

    // Display summary
    public void displayConsistSummary() {
        System.out.println("Train: " + trainName);
        System.out.println("Consist Summary:");

        if (bogies.isEmpty()) {
            System.out.println("No bogies added yet");
        } else {
            for (String bogie : bogies) {
                System.out.println("Bogie: " + bogie);
            }
        }
    }

    public static void main(String[] args) {

        TrainConsistManagementApp train = new TrainConsistManagementApp("Express");

        // Add bogies (with duplicate)
        train.addBogie("B1");
        train.addBogie("B2");
        train.addBogie("B1"); // duplicate

        // Display
        train.displayConsistSummary();
    }
}