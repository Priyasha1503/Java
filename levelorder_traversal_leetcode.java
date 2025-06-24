
//https://leetcode.com/problems/binary-tree-level-order-traversal/?envType=problem-list-v2&envId=tree

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
        List<List<Integer>> res= new ArrayList<>();
        //if(root==null) return new ArrayList();
        if(root==null) return res;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty())
        {
            List<Integer> list = new ArrayList<>();//Innerlist
            int size=que.size();
            for(int i=0;i<size;i++)
            {
            TreeNode node = que.poll();//pll() removes it and returns it
            list.add(node.val);
            if(node.left!=null) que.add(node.left);
            if(node.right!=null) que.add(node.right);
            }
            res.add(list);

        }
        return res;
    }
}
