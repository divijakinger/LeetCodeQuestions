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
    public int minDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
            queue.add(root);
            
            while (!queue.isEmpty()){
                depth++;
                int size = queue.size();
                for (int i =0;i<size;i++){
                    TreeNode tempNode = queue.poll();

                    if (tempNode.left==null && tempNode.right==null){
                        return depth;
                    }
                    if(tempNode.left!=null){
                        queue.add(tempNode.left);
                    }

                    if(tempNode.right!=null){
                        queue.add(tempNode.right);
                }
                }



            }
        return depth;
    }
}