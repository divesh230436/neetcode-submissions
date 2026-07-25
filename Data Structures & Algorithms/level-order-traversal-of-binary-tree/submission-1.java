/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null)return ans;
        //bfs(ans,root);
        dfs(ans,root,0);
        return ans;
        
    }
    public void dfs(List<List<Integer>>ans,TreeNode root,int level){
            if(root ==null)return ;
            if(ans.size()<=level){
                ans.add(new ArrayList<>());
            }
            ans.get(level).add(root.val);
            
            dfs(ans,root.left,level+1);
            dfs(ans,root.right,level+1);




    }
    public void bfs(List<List<Integer>> ans,TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            int size=queue.size();

            List<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr=queue.poll();
                list.add(curr.val);
                if(curr.left!=null)queue.offer(curr.left);
                if(curr.right!=null)queue.offer(curr.right);

            }
            ans.add(list);
        }

    }
}
