import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 2, 3, 4, 5, 9, 10, 12}; // Example array with duplicates
        Set<Integer> uniqueElements = new HashSet<>();

        // Add elements to the set to remove duplicates
        for (int element : array) {
            uniqueElements.add(element);
        }

        // Convert the set back to array
        int[] uniqueArray = new int[uniqueElements.size()];
        int i = 0;
        for (int element : uniqueElements) {
            uniqueArray[i++] = element;
        }

        // Print the array without duplicates
        System.out.print("Array without duplicates: ");
        for (int element : uniqueArray) {
            System.out.print(element + " ");
        }
    }
}
