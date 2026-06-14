class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,target,0,ans,new ArrayList<>());
        return ans;   
    }
    public void helper(int [] arr,int target,int index,List<List<Integer>> ans,List<Integer>list){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return ;
        }
        if(target<0){
            return;
        }

        for(int i=index;i<arr.length;i++){
            if(i>index&&arr[i]==arr[i-1]){
                continue;
            }
            
            list.add(arr[i]);
            helper(arr,target-arr[i],i+1,ans,list);
            list.remove(list.size()-1);

        }

    }
}
