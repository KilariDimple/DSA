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
// class Solution {
//     public List<Integer> rightSideView(TreeNode root) {
        
        
//     }
// }
// class Solution {
//     public ArrayList<Integer> rightSideView(TreeNode root) {
//         // code here
//         ArrayList<Integer> result=new ArrayList<>();
//         // Queue<TreeNode> q=new LinkedList<>();
        
//         Queue<TreeNode> q = new LinkedList<>();
//         if(root==null) return result;
//         q.offer(root);
//         while(!q.isEmpty()){
//             int  len=q.size();
//             for(int i=0;i<len;i++){
//                 TreeNode cur=q.poll();
//                 if(i==0) result.add(cur.val);
//                 if(cur.right!=null) q.offer(cur.right);
//                 if(cur.left!=null) q.offer(cur.left);
//                 // if(cur.right!=null) q.offer(cur.right);
//             }
//         }
//         return result;
//     }
    
// }


class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        // Stack<TreeNode> st=new Stack<>();
        rightside(root, res,0);
        return res;
    }
    public void rightside(TreeNode curr,List<Integer>res,int depth){
        if(curr==null) return;
        if(depth==res.size()){
            res.add(curr.val);
        }
        rightside(curr.right,res,depth+1);
        rightside(curr.left,res,depth+1);
    }

}