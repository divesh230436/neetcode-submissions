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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null&&subRoot==null)return true;
        if(root==null||subRoot==null)return false;
        if(root.val==subRoot.val){
            if( helper(root,subRoot))return true;
        }
        
        if(isSubtree(root.right,subRoot))return true;
        if(isSubtree(root.left,subRoot))return true;
        return false;

    }
    public boolean helper(TreeNode r,TreeNode s){
        if(r==null&&s==null)return true;
        if(r==null||s==null||s.val!=r.val)return false;
        if(!helper(r.left,s.left))return false;
        if(!helper(r.right,s.right))return false;

        return true;
    }
}
