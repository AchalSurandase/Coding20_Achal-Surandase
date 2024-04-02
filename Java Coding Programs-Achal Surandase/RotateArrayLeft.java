public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9}; 
        int firstElement = array[0];

        // Shift elements to the left
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = firstElement;

    
        System.out.print("Rotated array: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
