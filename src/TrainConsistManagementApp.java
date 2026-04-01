public class TrainConsistManagementApp {

    public void addBogie(String id, int capacity) {

        if (capacity <= 0) {
            throw new IllegalArgumentException("Invalid capacity!");
        }

        System.out.println("Bogie added: " + id + " Capacity: " + capacity);
    }

    public static void main(String[] args) {

        TrainConsistManagementApp app = new TrainConsistManagementApp();

        try {
            app.addBogie("B1", 50);
            app.addBogie("B2", -10); // invalid
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}