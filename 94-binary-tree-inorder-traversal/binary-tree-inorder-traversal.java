// import java.util.*;

// class Solution {
    
//     public List<Integer> inorderTraversal(TreeNode root) {
        // List<Integer> result = new ArrayList<>();
        // Stack<TreeNode> stack = new Stack<>();
        
        // TreeNode curr = root;
        
        // while (curr != null || !stack.isEmpty()) {
            
        //     // go left as much as possible
        //     while (curr != null) {
        //         stack.push(curr);
        //         curr = curr.left;
        //     }
            
        //     // process node
        //     curr = stack.pop();
        //     result.add(curr.val);
            
        //     // go right
        //     curr = curr.right;
        // }
        
        // return result;


        
//     }
// }



























class Solution {
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        Helper(root,result);
        return result;
    }
    public void Helper(TreeNode root,List<Integer> result){
        if(root==null) return;
        Helper(root.left,result);
        result.add(root.val);
        Helper(root.right,result);

    }
}