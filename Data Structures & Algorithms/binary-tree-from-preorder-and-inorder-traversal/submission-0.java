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
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return call(preorder,inorder);
        
    }
    public TreeNode call(int[]preorder,int[]inorder){
        if(inorder.length==0)return null;
        TreeNode root=new TreeNode ();
        int v=preorder[0];
        root.val=v;
        int index=0;
        for(int i=0;i<inorder.length;i++){
            if (v==inorder[i])  {
                index=i;
                break;
            }
        }

        root.left=call(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));

        root.right=call(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));
        return root;
    }
}
