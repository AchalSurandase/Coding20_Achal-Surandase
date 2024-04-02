public class ReverseArray {
    public static void main(String[] args) {
        int[] originalArray = {10,20,30,40,50};
        int[] reversedArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }

        // Print the reversed array
        System.out.print("Reversed array: ");
        for (int j : reversedArray) {
            System.out.print(j + " ");
        }
    }
}
