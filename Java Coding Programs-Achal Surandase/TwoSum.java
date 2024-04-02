public class TwoSum {
    public static void main(String[] args) {
        int[] array = {2, 17, 11, 15, 20, 55}; 
        int target = 17; 

        int[] indices = findTwoSum(array, target);
        if (indices.length == 2) {
            System.out.println("Indices of the two numbers whose sum is equal to " + target + " are: " + indices[0] + " and " + indices[1]);
        } else {
            System.out.println("No two numbers add up to " + target);
        }
    }

    public static int[] findTwoSum(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
