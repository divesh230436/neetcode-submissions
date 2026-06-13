class Solution {
    public boolean hasDuplicate(int[] nums) {
        int prev=-1;
      //  Arrays.sort(nums);
      HashSet<Integer> mp=new HashSet<>();

        for(int i=0;i<nums.length;i++){
           if(mp.contains(nums[i])) return true;
           mp.add(nums[i]);
           // prev=nums[i];

        }
        return false;
    }
}