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
        List<List<Integer>> ML=new LinkedList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        if(root ==null) return ML;
        q.offer(root);
        while(!q.isEmpty()){
            int level=q.size();
            LinkedList<Integer> l=new LinkedList<Integer>();
             for(int i=0;i<level;i++){
                if(q.peek().left!=null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.offer(q.peek().right);
                }
                l.add(q.poll().val);
             }
             ML.add(l);
             
        }
        return ML;
        
    }
}