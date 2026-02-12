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
//     public int sumNumbers(TreeNode root) {
//         return  srl(root,0);
        
//     }

//     private int srl(TreeNode root,int current){
//         if(root==null){
//             return 0;
//         }
//         current =current*10+root.val;
//         if(root.left==null& root.right==null){
//             return current;
//         }
//         return srl(root.left,current)+ srl(root.right,current);
//     }       
// }

class  Solution{
    public int sumNumbers(TreeNode root)
    {
        return srl(root,0);
    }
//FOLLWS DFS .GOES TO ONE SIDE AND TRAVERSAL TO OTHER SIDE


private int srl(TreeNode root,int current){
    if(root==null){
        return 0;
    }
    current =current*10+root.val;
    if(root.left==null && root.right==null){
        return current;
    }
    int RS=srl(root.left,current); // we can change either LS OR RS FIRST .
    int LS=srl(root.right,current);
    int ans= RS+LS;
    return ans;
}
}