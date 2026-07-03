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
//     public List<Integer> preorderTraversal(TreeNode root) {
//         // List<Integer> result=new ArrayList<>();
//         // if(root==null) return result;
//         // Stack<TreeNode> st=new Stack<>();
//         // st.push(root);
//         // // TreeNode curr=st.pop();
//         // while(!st.isEmpty()){
//         //     TreeNode curr=st.pop();
//         //     result.add(curr.val);
//         //     if(curr.right!=null) st.push(curr.right);
//         //     if(curr.left!=null) st.push(curr.left);
//         // }
//         // return result;
        
//         List<Integer> result=new ArrayList<>();
//         if(root==null) return result;
//             result.add(root.val);
//             preorderTraversal(root.left);
//             preorderTraversal(root.right);
//             return result;
//     }
// }














// public List<Integer> preorderTraversal(TreeNode root) {
//     List<Integer> result = new ArrayList<>();
//     helper(root, result);
//     return result;
// }

// private void helper(TreeNode root, List<Integer> result) {
//     if (root == null) return;

//     result.add(root.val);
//     helper(root.left, result);
//     helper(root.right, result);
// } 
















class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>  result=new ArrayList<>();
        if(root==null) return result;
        Stack<TreeNode> s=new Stack<>();
        
        s.push(root);
        while(!s.isEmpty()){
            TreeNode ans=s.pop();
            result.add(ans.val);
            if(ans.right!=null) s.push(ans.right);
            if(ans.left!=null) s.push(ans.left);

        }
        return result;
    }
}