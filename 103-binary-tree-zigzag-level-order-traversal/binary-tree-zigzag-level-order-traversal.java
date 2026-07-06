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
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> q=new LinkedList<>();
        boolean Ltor=false;
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            LinkedList<Integer> ans=new LinkedList<>();
            for(int i=0;i<n;i++){
                TreeNode  cur=q.poll();
                if(Ltor){
                    ans.addFirst(cur.val);
                }
                else{
                    ans.addLast(cur.val);
                }
                if(cur.left!=null) q.offer(cur.left);
                if(cur.right!=null) q.offer(cur.right);

            }
            Ltor=!Ltor;
            result.add(ans);

        }
        return result;

        
    }
}