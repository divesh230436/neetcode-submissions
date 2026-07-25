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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        call(root);
        return diameter;


    }
    int diameter=0;
public int call(TreeNode root){
        if(root==null)return 0;

        int left=call(root.left);
        int right=call(root.right);
         diameter=Math.max(diameter,left+right);

        return Math.max(left,right)+1;

    }
}
