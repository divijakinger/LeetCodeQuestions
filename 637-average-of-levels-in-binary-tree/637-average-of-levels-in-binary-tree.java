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
    public List<Double> averageOfLevels(TreeNode root) {
        if (root==null){
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
            queue.add(root);
            List<Double> ans = new ArrayList<>();

            while (!queue.isEmpty()){
                double avg = 0;
                List<Integer> tempList = new ArrayList<>();
                int size = queue.size();
                for (int i =0;i<size;i++){
                    TreeNode tempNode = queue.poll();
                    tempList.add(tempNode.val);
                    avg+=(tempNode.val);

                    if(tempNode.left!=null){
                        queue.add(tempNode.left);
                    }

                    if(tempNode.right!=null){
                        queue.add(tempNode.right);
                    }
                }
                
                ans.add(avg/tempList.size());

            }
        return ans;
    }
}