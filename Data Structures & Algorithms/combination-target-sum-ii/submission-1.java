
class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
         Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        call(ans,list,nums,0,target);
        return ans;
    }
    public void call(List<List<Integer>>ans,List<Integer>list,int[]nums,int index,int target){
        if(target<0){
            return;
        }
        if(target==0){
            ans.add(List.copyOf(list));
            return ;
        }
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            call(ans,list,nums,i+1,target-nums[i]);
            list.remove(list.size()-1);
        }
    }
}