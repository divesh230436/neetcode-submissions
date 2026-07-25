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
    public boolean isBalanced(TreeNode root) {
        if(root ==null)return true;
        if(call(root)==-1)return false;
        return true;

        
    }
    public int call(TreeNode root){
        if(root==null)return 0;
        int left=call(root.left);
        if(left==-1)return -1;
        int right=call(root.right);
        if(right==-1)return -1;

        if(Math.abs(right-left)>1)return -1;

        return Math.max(left,right)+1;
    }
    
}
