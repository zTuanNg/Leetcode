package homework;

public class _104 {

    public static void main(String[] args) {

    }

    public static int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int lDepth = maxDepth(root.left);

        int rDepth = maxDepth(root.right);

        return 1 + Math.max(lDepth, rDepth);

    }
}
