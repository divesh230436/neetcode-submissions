class Solution {
    public boolean hasDuplicate(int[] nums) {
        int prev=-1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(prev==nums[i]) return true;
            prev=nums[i];

        }
        return false;
    }
}