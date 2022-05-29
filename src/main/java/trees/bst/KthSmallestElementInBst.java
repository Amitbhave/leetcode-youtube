package trees.bst;

import trees.TreeNode;

import java.util.Stack;

public class KthSmallestElementInBst {

    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            k--;
            if (k == 0) {
                return root.val;
            }

            root = root.right;
        }
        return -1;
    }

}
