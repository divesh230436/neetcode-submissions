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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        StringBuilder sr=new StringBuilder();
        srhelper(root,sr);
        return sr.toString();
    }
    private  void srhelper(TreeNode root,StringBuilder sb){
        if(root==null){
            sb.append("null,");
            return ;
        }
        sb.append(root.val+",");

        srhelper(root.left,sb);
        srhelper(root.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        StringBuilder sb=new StringBuilder(data);

        return drhelper(sb);
    }
    private TreeNode drhelper(StringBuilder data){
        if(data.charAt(0)=='n'){
            data.delete(0,5);
            return null;
        }
        int idx=data.indexOf(",");
        String token=data.substring(0,idx);
        data.delete(0,idx+1);
        int val=Integer.parseInt(token);
        TreeNode root =new TreeNode(val);

        root.left=drhelper(data);
        root.right=drhelper(data);
        return root;



        
    }
}
