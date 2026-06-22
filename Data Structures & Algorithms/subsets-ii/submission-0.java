class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        helper(ans,list,nums,0);
        return ans;
    }
    public void helper(List<List<Integer>>ans,List<Integer>list,int[] arr,int index){
        if(index==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=index;i<arr.length;i++){
            if(i>index &&arr[i]==arr[i-1]){
                continue;
            }
            list.add(arr[i]);
            helper(ans,list,arr,i+1);
            list.remove(list.size()-1);

        }
        ans.add(List.copyOf(list));
    }
}
