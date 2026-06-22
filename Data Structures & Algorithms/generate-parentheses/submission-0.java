class Solution {
    public List<String> generateParenthesis(int n) {
         List<String>list=new ArrayList<>();
         helper(n,list,"",0,0);
         return list;
    }
    public void helper(int n,List<String> list,String curr,int open,int close){
        if(close==n){
            list.add(curr);
        }
        if(open<n){
            helper(n,list,curr+"(",open+1,close);

        }
        if(close<open){
            helper(n,list,curr+")",open,close+1);

        }

    }
}
