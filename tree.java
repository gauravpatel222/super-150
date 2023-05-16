/*
 * rec(root);
 * return root;
 * 
 * }
 * public static void rec(TreeNode root){
 * if(root==null) return;
 * if(root.left==null&&root.right==null){
 * if(root.val==0){
 * root=null;
 * }
 * return;
 * }
 * 
 * rec(root.left);
 * rec(root.right);
 * 
 * }
 * }
 */