import java.util.*;

public class TrainConsistManagementApp {

    String trainName;
    HashMap<String, String> bogieType;

    public TrainConsistManagementApp(String trainName) {
        this.trainName = trainName;
        this.bogieType = new HashMap<>();
    }

    public void addBogie(String bogieId, String type) {
        bogieType.put(bogieId, type);
    }

    public void groupBogies() {

        HashMap<String, List<String>> grouped = new HashMap<>();

        for (Map.Entry<String, String> entry : bogieType.entrySet()) {

            String bogie = entry.getKey();
            String type = entry.getValue();

            grouped.putIfAbsent(type, new ArrayList<>());
            grouped.get(type).add(bogie);
        }

        System.out.println("Grouped Bogies:");

        for (String type : grouped.keySet()) {
            System.out.println(type + " → " + grouped.get(type));
        }
    }

    public static void main(String[] args) {

        TrainConsistManagementApp train = new TrainConsistManagementApp("Express");

        train.addBogie("B1", "AC");
        train.addBogie("B2", "Sleeper");
        train.addBogie("B3", "AC");

        train.groupBogies();
    }
}