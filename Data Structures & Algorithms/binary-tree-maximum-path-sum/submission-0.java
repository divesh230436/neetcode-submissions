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
    int pathSum=Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
            call(root);
            return pathSum;
    }
    public int call(TreeNode root){
        if(root==null)return 0;

        int left=call(root.left);
        if(left<0)left=0;
        int right =call(root.right);
        if(right<0)right=0;
        pathSum=Math.max(left+right+root.val,pathSum);
        return Math.max(left,right)+root.val;

    }
}
