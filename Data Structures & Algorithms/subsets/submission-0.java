class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();

        List<Integer> list =new ArrayList<>();
        helper(ans,list,nums,0);
        return ans;


    }
    public void helper(List<List<Integer>> ans,List<Integer> list,int [ ] arr,int  index){
        if(index==arr.length){
            ans.add(List.copyOf(list));
            return;

        }
        list.add(arr[index]);
        helper(ans,list,arr,index+1);
        list.remove(list.size()-1);
        helper(ans,list,arr,index+1);
    }
}
