import java.util.Arrays;

public class HeapSortJobApplicants {
public static void heapSort(int[] salaries) {
int n = salaries.length;
for (int i = n / 2 - 1; i >= 0; i--) {
heapify(salaries, n, i);
}
for (int i = n - 1; i > 0; i--) {
int temp = salaries[0];
salaries[0] = salaries[i];
salaries[i] = temp;
heapify(salaries, i, 0);
}
}

public static void heapify(int[] salaries, int n, int i) {
int largest = i;
int left = 2 * i + 1;
int right = 2 * i + 2;
if (left < n && salaries[left] > salaries[largest]) {
largest = left;
}
if (right < n && salaries[right] > salaries[largest]) {
largest = right;
}
if (largest != i) {
int temp = salaries[i];
salaries[i] = salaries[largest];
salaries[largest] = temp;
heapify(salaries, n, largest);
}
}

public static void main(String[] args) {
int[] salaryDemands = {55000, 42000, 75000, 60000, 50000, 65000};
System.out.println("Original Salary Demands: " + Arrays.toString(salaryDemands));
heapSort(salaryDemands);
System.out.println("Sorted Salary Demands: " + Arrays.toString(salaryDemands));
}
}

