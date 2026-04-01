import java.util.*;

public class TrainConsistManagementApp {

    String trainName;
    HashMap<String, Integer> bogieCapacity;

    public TrainConsistManagementApp(String trainName) {
        this.trainName = trainName;
        this.bogieCapacity = new HashMap<>();
    }

    public void addBogie(String bogieId, int capacity) {
        bogieCapacity.put(bogieId, capacity);
    }

    public void countTotalSeats() {

        int total = bogieCapacity.values()
                .stream()
                .reduce(0, Integer::sum);

        System.out.println("Total Seats: " + total);
    }

    public static void main(String[] args) {

        TrainConsistManagementApp train = new TrainConsistManagementApp("Express");

        train.addBogie("B1", 50);
        train.addBogie("B2", 60);
        train.addBogie("B3", 40);

        train.countTotalSeats();
    }
}