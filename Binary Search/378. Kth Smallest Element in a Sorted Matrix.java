public class KthSmallestSortedMatrix_378 {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0], high = matrix[n - 1][n - 1];

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0, col = n - 1;

            for (int row = 0; row < n; row++) {
                while (col >= 0 && matrix[row][col] > mid) col--;
                count += col + 1;
            }

            if (count < k) low = mid + 1;
            else           high = mid;
        }
        return low;
    }
}
