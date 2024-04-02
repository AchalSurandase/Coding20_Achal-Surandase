public class MaxOnesRow {
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 0, 0, 0},
            {1, 1, 1, 0},
            {1, 1, 1, 1}, 
            {1, 0, 0, 0}
        };

        int maxRowIndex = findRowWithMaxOnes(matrix);
        System.out.println("Row with the maximum number of 1's is: " + maxRowIndex);
    }

    public static int findRowWithMaxOnes(int[][] matrix) {
        int maxRow = -1;
        int maxCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxRow = i;
            }
        }

        return maxRow;
    }
}
