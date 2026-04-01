public class TrainConsistManagementApp {

    // Train name
    String trainName;

    // Constructor
    public TrainConsistManagementApp(String trainName) {
        this.trainName = trainName;
    }

    // Method to display consist summary
    public void displayConsistSummary() {
        System.out.println("Train: " + trainName);
        System.out.println("Consist Summary:");
        System.out.println("No bogies added yet");
    }

    public static void main(String[] args) {

        // Initialize train
        TrainConsistManagementApp train = new TrainConsistManagementApp("Express");

        // Display summary
        train.displayConsistSummary();
    }
}
