class Solution {
    public int findMin(int[] nums) {
        int p=peak(nums,0,nums.length-1);
        return p==-1?nums[0]:nums[p+1];

        
        
    }
    public int peak(int [] nums,int s,int e){
        if(s>e){
            return -1;

        }

        int m=s+(e-s)/2;
        if(m-1>=0&&nums[m]<nums[m-1])return m-1;
        if(m+1<nums.length&&nums[m+1]<nums[m])return m;

        if(nums[m]<=nums[e]){
           return peak(nums,s,m-1);
        }
        else{
            return peak(nums,m+1,e);
        }
        


    }
}
