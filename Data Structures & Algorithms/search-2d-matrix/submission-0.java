class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /*
            Time - O(log(m*n)) Space O(1)
            Treat entire array as a single sorted array
            When converting a 1D index to 2D coordinates in the one-pass 
            binary search approach, it is easy to mix up 
            row = mid / m and col = mid % m.
            Using ROWS(n) instead of COLS(m) in these formulas will produce
            incorrect indices and lead to wrong answers or out-of-bounds errors.
        */
        int n = matrix.length, m = matrix[0].length;
        int l = 0, r = n*m-1;
        while(l <= r){
            int mid = l + (r - l)/2;
            int row = mid/m, col = mid % m;
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                l = mid + 1;;
            }else{
                r = mid - 1;
            }
        }
        return false;
    }
}
