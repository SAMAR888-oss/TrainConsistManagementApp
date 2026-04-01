import java.util.ArrayList;

public class TrainConsistManagementApp {

    String trainName;
    ArrayList<String> bogies;

    // Constructor
    public TrainConsistManagementApp(String trainName) {
        this.trainName = trainName;
        this.bogies = new ArrayList<>();
    }

    // Add bogie
    public void addBogie(String bogieId) {
        bogies.add(bogieId);
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

        // Add bogies
        train.addBogie("B1");
        train.addBogie("B2");
        train.addBogie("B3");

        // Display
        train.displayConsistSummary();
    }
}