class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans =new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        boolean[] taken=new boolean[nums.length];
        helper(nums,ans,list,taken);
        return ans;

        
    }
    public void helper(int [] nums,List<List<Integer>>ans,List<Integer> list,boolean[] taken){
       if(list.size()==nums.length){
        ans.add(new ArrayList<>(list));
        return;
       }
       for(int i=0;i<nums.length;i++){
        if(!taken[i]){
            list.add(nums[i]);
            taken[i]=true;
            helper(nums,ans,list,taken);
            list.remove(list.size()-1);
            taken[i]=false;
        }

       }
       
       return ;


    }
}
