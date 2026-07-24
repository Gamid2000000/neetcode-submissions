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
    public int maxPathSum(TreeNode root) {
        int[] res = new int[]{root.val};
        def(root, res);

        return res[0];

    }
    private int def(TreeNode root, int[] res){
        if(root == null) return 0;

        int left = Math.max(def(root.left, res), 0);
        int right = Math.max(def(root.right, res), 0);

        res[0] = Math.max(res[0], root.val+left+right);

        return root.val + Math.max(left, right); 
    }
}
