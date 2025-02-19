import java.util.*;

class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

class HospitalTriageSystem {
    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<>(Comparator.comparingInt(p -> -p.severity));
        
        queue.add(new Patient("John Cena", 3));
        queue.add(new Patient("Albert", 5));
        queue.add(new Patient("Bob Marley", 2));

        System.out.println("Patient Treatment Order:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
