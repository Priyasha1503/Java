
//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
//THERE ARE TWO WAYS OR METHODS 
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
/*class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Inetger,Integer> map = new HashMap<>();
        //storing the index postotions of inorder,since we need to consrtcut the tree in preorder,so we have to compare inorder positions with preorder index
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        constructTree(preorder,map,0,0,inorder.length()-1);
        //parameters -- preorder arr,map,root,left,right positions

    }
    public Treenode constructTree(int[] preOrder,Map<Integer,Integer> result, int index,int left,int right)
    {
        new TreeNode(preorder[index]);
        int mid=result.get(preorder[index]);
        if(left<mid)
        {
            root.left=constructTree(preorder,resut,index+1,left,mid-1);
        }
        if(root>mid)
        {
            root.right=constructTree(preorder,result,index+mid-left+1,mid+1,right);
        }
        return root;
    }
}*/
//2ND METHOD - BRUTEFORCE
import java.util.Arrays;
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Deque<Integer> preorderDeque = new ArrayDeque<>();
        for(int val:preorder){
        preorderDeque.offer(val);
        }
        return build(preorderDeque,inorder);
    }
    public TreeNode build(Deque<Integer> preorderQueue,int[] inorder)
    {
        if(inorder.length>0)
        {
            int index=indexOf(inorder,preorderQueue.poll());//starts from first   
            TreeNode root = new TreeNode(inorder[index]);
            root.left=build(preorderQueue,Arrays.copyOfRange(inorder,0,index));
            root.right=build(preorderQueue,Arrays.copyOfRange(inorder,index+1,inorder.length));
            return root;
              }
              return null;//if unable to find the index positions->when root is null after the leaf...
    }

    public int indexOf(int[] inorder,int value)
    {
        for(int i=0;i<inorder.length;i++)
        {
            if(inorder[i]==value) return i;

        }
        return -1;//when the value didnt match..
    }
}

//FOR THE 2ND METHOD TIMECOMP IS O(n2)
