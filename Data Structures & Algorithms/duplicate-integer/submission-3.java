class Solution {
    public boolean hasDuplicate(int[] nums) {
        int prev=-1;
      //  Arrays.sort(nums);
      HashMap<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<nums.length;i++){
           if(mp.containsKey(nums[i])) return true;
           mp.put(nums[i],1);
           // prev=nums[i];

        }
        return false;
    }
}