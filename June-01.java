// /Definition for a binary tree node.
// public class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode() {}
//     TreeNode(int val) { this.val = val; }
//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
// }
 
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        TreeNode rightNode = null;
        TreeNode leftNode = null;
        if (root.left != null) {
            leftNode = invertTree(root.left);
            System.out.println(leftNode.val);
        }
        if (root.right != null) {
            rightNode = invertTree(root.right);
            System.out.println(rightNode.val);
        }
        root.left = rightNode != null ? rightNode : null;
        root.right = leftNode != null ? leftNode : null;
        return root;
    }
}
