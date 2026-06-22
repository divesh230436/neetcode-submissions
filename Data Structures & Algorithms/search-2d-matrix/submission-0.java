class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;int n=matrix[0].length;
        int i=0;
        int s=0;int e=m*n-1;
        while(s<=e){
            int mid=s+(e-s)/2;

            if(matrix[mid/n][mid%n]==target)return true;

            else if(matrix[mid/n][mid%n]>target){
                e=mid-1;
            }
            else{s=mid+1;}

        }
        return false;
    }
}
