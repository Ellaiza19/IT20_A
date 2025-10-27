
package Midterm;

import java.util.PriorityQueue;
import java.util.ArrayList;

public class hm_system {
    public static void main(String[] args) {
        ArrayList<Patient> arr = new ArrayList<>();
        PriorityQueue<Patient> queue = new PriorityQueue<>();

        arr.add(new Patient("Anna", 3));
        arr.add(new Patient("Bob", 1));
        arr.add(new Patient("Carla", 2));
        arr.add(new Patient("Dave", 1));

        queue.addAll(arr);

        System.out.println("=== Arrival Order ===");
        System.out.println("Arrival Order: " + arr + "\n");

        System.out.println("=== Treatment Order ===");
        while (!queue.isEmpty()) {
            System.out.println("Treating: " + queue.poll());
        }
    }

    public static class Patient implements Comparable<Patient> {
        String name;
        int severity;

        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }

        public int compareTo(Patient other) {
            return Integer.compare(this.severity, other.severity);
        }

        public String toString() {
            return name + " (Severity: " + severity + ")";
        }
    }
}