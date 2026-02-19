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
    private List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        if(root==null){
            return 0;
        }
        ksmall(root);

        return getthesmall(list, k);
    }

    public void ksmall(TreeNode root){
        if(root==null){
            return;
        }
        list.add(root.val);
        ksmall(root.left);
        ksmall(root.right);
    }

    public int getthesmall(List<Integer> list, int k){
        Collections.sort(list);
        return list.get(k-1);
    }
}