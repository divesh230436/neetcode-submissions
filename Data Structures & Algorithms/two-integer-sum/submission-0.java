class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]ans={-1,-1};
    HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int need=target-nums[i];
            if( map.containsKey(need)){
                ans[0]=map.get(need);
                ans[1]=i;
                break;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}
