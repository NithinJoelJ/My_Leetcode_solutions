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
    private int sum=0;
    public int sumNumbers(TreeNode root) {
        getval(root, 0);
        return sum;
    }

    public void getval(TreeNode root, int csum){
        if(root==null){
            return;
        }
        csum = csum*10+root.val;

        if(root.left==null && root.right==null){
            sum+=csum;
        }else{
            getval(root.left, csum);
            getval(root.right, csum);
        }

    }
}