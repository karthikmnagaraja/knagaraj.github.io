package interview.tree;
/**
Inorder of give node value is next smallest greater value than node value.


*/
public class InorderSuccessorinBST {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root==null) return null;
        if(root.val<=p.val){
            return inorderSuccessor(root.right,p);
        }else{
            TreeNode left=inorderSuccessor(root.left,p);
            return left==null?root:left;
        }
    }
}