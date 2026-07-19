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
        List<List<Integer>> result = new ArrayList<>();
         if(root == null) return result;

        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);

        while(!qu.isEmpty()){
        int level = qu.size();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<level; i++){
            TreeNode node = qu.poll();
            list.add(node.val);
            
            if(node.left != null) qu.add(node.left);
            if(node.right != null) qu.add(node.right);
            }
            result.add(list);
        }
        return result;
    }
}
