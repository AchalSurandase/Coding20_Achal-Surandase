public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6, 8}; 
        int missingNumber = findMissingNumber(array);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] array) {
        int n = array.length + 1;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int number : array) {
            arraySum += number;
        }

        return totalSum - arraySum;
    }
}
