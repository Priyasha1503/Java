
//https://leetcode.com/problems/binary-tree-inorder-traversal/?envType=problem-list-v2&envId=tree

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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        ArrayList<Integer> res=new ArrayList<>();
        inorder(root,res);
        return res;
    }
    public List<Integer> inorder(TreeNode root, ArrayList<Integer> res)
    {
        if(root==null)
        return null;
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
        return res;
    }
}
