class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        helper(ans,list,nums,target,0);
        return ans;


    }
    public void  helper( List<List<Integer>> ans,List<Integer> list,int[] arr,int target,int index){

        if(target==0){
            ans.add(List.copyOf(list));
            return ;
        }
        if(target<0)return ;

        for(int i=index;i<arr.length;i++){
            int a=arr[i];

           
            
            
                 list.add(a);
                 helper(ans,list,arr,target-a,i);
                 list.remove(list.size()-1);
 

            
        }
    }
}
