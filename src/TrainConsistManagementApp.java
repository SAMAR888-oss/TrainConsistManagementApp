import java.util.*;
import java.util.stream.Collectors;

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

    public void filterBogies(int minCapacity) {

        List<Map.Entry<String, Integer>> filtered =
                bogieCapacity.entrySet()
                        .stream()
                        .filter(entry -> entry.getValue() >= minCapacity)
                        .collect(Collectors.toList());

        System.out.println("Filtered Bogies (Capacity >= " + minCapacity + "):");

        for (Map.Entry<String, Integer> entry : filtered) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        TrainConsistManagementApp train = new TrainConsistManagementApp("Express");

        train.addBogie("B1", 50);
        train.addBogie("B2", 60);
        train.addBogie("B3", 45);

        train.filterBogies(50);
    }
}