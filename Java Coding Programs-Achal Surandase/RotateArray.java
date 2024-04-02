public class RotateArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60}; 
        int k = 2; 
        k = k % array.length;
        rotateLeft(array, k);
        System.out.print("Rotated array: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
    public static void rotateLeft(int[] array, int k) {
        for (int i = 0; i < k; i++) {
            int firstElement = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = firstElement;
        }
    }
}
