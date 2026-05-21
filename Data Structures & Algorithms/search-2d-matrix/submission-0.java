class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int elementCount = m * n ;

        int left=0;
        int right = elementCount-1;

        while(left<= right){
            int mid = left + (right-left)/2;
            int rowindex = mid/n;
            int colindex = mid % n;
            System.out.println(left + " - " + right+ "-"+mid);
            if(matrix[rowindex][colindex] == target){
                return true;
            }else if(matrix[rowindex][colindex] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }

        }
        
        return false;
    }
}
