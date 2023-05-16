import java.util.TreeSet;

public class tree_pruning {
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.add(1);
        root.add(null);
        root.add(0);
        root.add(0);
        root.add(1);
        System.out.println(pruneTree(root));
    }

    public static TreeNode pruneTree(TreeNode root) {

        rec(root);
        return root;

    }

    public static void rec(TreeNode root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            if (root.val == 0) {
                root = null;
            }
            return;
        }

        rec(root.left);
        rec(root.right);

    }
}
