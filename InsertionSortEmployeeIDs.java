import java.util.Arrays;

public class InsertionSortEmployeeIDs{
public static void insertionSort(int[] ids){
int n = ids.length;
for(int i = 0; i<n; i++){
int key = ids[i];
int j = i-1;

while(j >= 0 && ids[j] > key){
ids[j+1] = ids[j];
j = j-1;
}
ids[j+1] = key;
}
}
public static void main(String[] args) {
int[] employeeIDs = {105, 102, 110, 101, 108, 107};
System.out.println("Original Employee IDs: " + Arrays.toString(employeeIDs));
        
insertionSort(employeeIDs);        

System.out.println("Sorted Employee IDs: " + Arrays.toString(employeeIDs));
}
}
