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

    public void displaySortedBogies() {

        List<Map.Entry<String, Integer>> list = new ArrayList<>(bogieCapacity.entrySet());

        // Sort using Comparator (by capacity)
        list.sort((a, b) -> a.getValue() - b.getValue());

        System.out.println("Sorted Bogies by Capacity:");

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        TrainConsistManagementApp train = new TrainConsistManagementApp("Express");

        train.addBogie("B1", 50);
        train.addBogie("B2", 60);
        train.addBogie("B3", 45);

        train.displaySortedBogies();
    }
}