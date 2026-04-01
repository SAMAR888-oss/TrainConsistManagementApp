import java.util.TreeSet;

public class TrainConsistManagementApp {

    String trainName;
    TreeSet<String> bogies;

    public TrainConsistManagementApp(String trainName) {
        this.trainName = trainName;
        this.bogies = new TreeSet<>();
    }

    public void addBogie(String bogieId) {
        bogies.add(bogieId);
    }

    public void displayConsistSummary() {
        System.out.println("Train: " + trainName);
        System.out.println("Sorted Bogies:");

        for (String bogie : bogies) {
            System.out.println("Bogie: " + bogie);
        }
    }

    public static void main(String[] args) {

        TrainConsistManagementApp train = new TrainConsistManagementApp("Express");

        train.addBogie("B3");
        train.addBogie("B1");
        train.addBogie("B2");

        train.displayConsistSummary();
    }
}