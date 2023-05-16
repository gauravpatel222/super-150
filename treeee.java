
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void add(int i) {
    }

    public void add(Object object) {
    }
}

public class treeee {
    public static void main(String[] args) {
        TreeNode node = new TreeNode();

    }

    public int diameterOfBinaryTree(TreeNode root) {
        int res = 0;
        if (root == null)
            return res;

        // int cur = Math.max(maxDepth(root.left), maxDepth(root.right)) +
        // Math.min(maxDepth(root.left), maxDepth(root.right));
        int cur = maxDepth(root.left) + maxDepth(root.right);
        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);

        return Math.max(cur, Math.max(left, right));
    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}