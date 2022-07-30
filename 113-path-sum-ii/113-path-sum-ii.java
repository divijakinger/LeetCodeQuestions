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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
                    List<List<Integer>> result = new ArrayList<>();
            List<Integer> path = new ArrayList<>();
            findAllPaths(root,targetSum,path,result);
            return result;
    }
    
    void findAllPaths(TreeNode root, int targetSum, List<Integer> path,List<List<Integer>> allPaths) {
            if (root==null){
                return;
            }

            if (root.left == null && root.right == null && targetSum - root.val == 0) {
                path.add(root.val);
                ArrayList<Integer> newAns = new ArrayList<>(path);
                allPaths.add(newAns);
                path.remove(path.size()-1);
                return;
            }

            path.add(root.val);
            findAllPaths(root.left,targetSum-root.val,path,allPaths);
            findAllPaths(root.right,targetSum- root.val,path,allPaths);
            path.remove(path.size()-1);

        }
}