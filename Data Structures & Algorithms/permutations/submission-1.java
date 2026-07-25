class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();

        boolean[]taken=new boolean [nums.length];
        call(ans,list,nums,taken,0);
        return ans;
    }
    public void call(List<List<Integer>>ans,List<Integer>list,int[]nums,boolean[] taken,int ind){
        if(ind==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!taken[i]){
                list.add(nums[i]);
                taken[i]=true;
                call(ans,list,nums,taken,ind+1);
                list.remove(list.size()-1);
                taken[i]=false;
            }
            
        }
    }
}
