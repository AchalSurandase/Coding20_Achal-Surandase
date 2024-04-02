import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] array = {1, 20, 3, 20, 4, 50, 50, 6,70,80,100,100}; 
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int number : array) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
                System.out.println(number);
            }
        }
    }
}
