import java.util.*;

public class TrainConsistManagementApp {

    HashMap<String, Integer> bogieCapacity = new HashMap<>();

    public void addBogie(String id, int capacity) {
        bogieCapacity.put(id, capacity);
    }

    public void checkSafety() {

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {

            if (entry.getValue() > 100) {
                System.out.println("Unsafe bogie: " + entry.getKey());
            } else {
                System.out.println("Safe bogie: " + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {

        TrainConsistManagementApp app = new TrainConsistManagementApp();

        app.addBogie("B1", 80);
        app.addBogie("B2", 120);

        app.checkSafety();
    }
}