class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        call(ans,new ArrayList<>() ,nums,0);
        return ans;
        

    }
    public void call(List<List<Integer>> ans,List<Integer> list,int[] nums,int index){
        if(index==nums.length){
            ans.add(new ArrayList<Integer>(list));
            return;
        }
        //not take
        call(ans,list,nums,index+1);

        //take
        list.add(nums[index]);
        call(ans,list,nums,index+1);
        list.remove(list.size()-1);

    }

}
