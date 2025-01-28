class Solution {
    private int count = 0;
    private int result = 0;

    public int kthSmallest(TreeNode root, int k) {
        inOrderTraversal(root, k);
        return result;
    }

    private void inOrderTraversal(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        // Traverse left subtree
        inOrderTraversal(root.left, k);

        // Visit current node
        count++;
        if (count == k) {
            result = root.val;  // We've found the kth smallest element
            return;
        }

        // Traverse right subtree
        inOrderTraversal(root.right, k);
    }
}
