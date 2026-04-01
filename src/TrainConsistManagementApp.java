import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 100000; i++) {
            list.add(i);
        }

        // Loop
        long start1 = System.nanoTime();
        int sum1 = 0;
        for (int num : list) {
            sum1 += num;
        }
        long end1 = System.nanoTime();

        // Stream
        long start2 = System.nanoTime();
        int sum2 = list.stream().reduce(0, Integer::sum);
        long end2 = System.nanoTime();

        System.out.println("Loop time: " + (end1 - start1));
        System.out.println("Stream time: " + (end2 - start2));
    }
}