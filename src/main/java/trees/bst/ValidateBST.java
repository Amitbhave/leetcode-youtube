package trees.bst;

import trees.TreeNode;

import java.util.Stack;

public class ValidateBST {

    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode previous = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            if (previous != null && previous.val >= root.val) {
                return false;
            }
            previous = root;
            root = root.right;
        }

        return true;
    }

}
