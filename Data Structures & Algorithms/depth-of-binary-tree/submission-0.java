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
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        return helper(root,0);

    }
    public int helper(TreeNode node,int l){
        if(node==null){
            return l;
        }
        int max=Math.max(helper(node.left,l+1),helper(node.right,l+1));
        return max;

    }
}
