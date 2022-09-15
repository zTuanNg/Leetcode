package homework;

public class _112 {
    public static void main(String[] args) {

    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        targetSum -= root.val;

        if (root.left == null && root.right == null && targetSum == 0) {
            return true;
        }

        if (root.left == null && root.right != null) {
            return hasPathSum(root.right, targetSum);
        }

        if (root.right == null && root.left != null) {
            return hasPathSum(root.left, targetSum);
        }

        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}
