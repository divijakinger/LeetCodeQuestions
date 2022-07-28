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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root==null){
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
            queue.add(root);
            List<List<Integer>> ans = new ArrayList<>();
            boolean leftToRight = true;
            while (!queue.isEmpty()){
                List<Integer> tempList = new ArrayList<>();
                int size = queue.size();
                for (int i =0;i<size;i++){
                    TreeNode tempNode = queue.poll();
                    if (leftToRight){
                        tempList.add(tempNode.val);
                    } else {
                        tempList.add(0,tempNode.val);
                    }
                    

                    if(tempNode.left!=null){
                        queue.add(tempNode.left);
                    }

                    if(tempNode.right!=null){
                        queue.add(tempNode.right);
                    }
                }
                
                ans.add(tempList);
                leftToRight = !leftToRight;

            }
        return ans;
    }
}