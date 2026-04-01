import java.util.HashMap;

public class TrainConsistManagementApp {

    String trainName;
    HashMap<String, Integer> bogieCapacity;

    // Constructor
    public TrainConsistManagementApp(String trainName) {
        this.trainName = trainName;
        this.bogieCapacity = new HashMap<>();
    }

    // Add bogie with capacity
    public void addBogie(String bogieId, int capacity) {
        bogieCapacity.put(bogieId, capacity);
    }

    // Display summary
    public void displayConsistSummary() {
        System.out.println("Train: " + trainName);
        System.out.println("Bogie Capacity Details:");

        for (String bogie : bogieCapacity.keySet()) {
            System.out.println("Bogie: " + bogie + " → Capacity: " + bogieCapacity.get(bogie));
        }
    }

    public static void main(String[] args) {

        TrainConsistManagementApp train = new TrainConsistManagementApp("Express");

        // Add bogies with capacity
        train.addBogie("B1", 50);
        train.addBogie("B2", 60);
        train.addBogie("B3", 45);

        // Display
        train.displayConsistSummary();
    }
}