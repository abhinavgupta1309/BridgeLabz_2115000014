import java.util.Arrays;

public class BubbleSortStudentMarks{
public static void bubbleSort(int[] marks){
int n = marks.length;
boolean swapped;

for(int i = 0; i < n-1; i++){
swapped = false;

for(int j = 0; j < n-1-i; j++){
if(marks[j] > marks[j+1]){
int temp = marks[j];
marks[j] = marks[j+1];
marks[j+1] = temp;
swapped = true;
}
}
if(!swapped){
break;
}
}
}
public static void main(String args[]){
int [] studentMarks = {55,75,46,98,45,71,67,87,79,69};
System.out.println("Original Marks" + Arrays.toString(studentMarks));

bubbleSort(studentMarks);
System.out.println("Sorted Marks: " + Arrays.toString(studentMarks));
}
}
