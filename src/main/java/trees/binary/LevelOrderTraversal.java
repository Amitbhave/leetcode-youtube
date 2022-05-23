package trees.binary;

import trees.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    public static void main(String[] args) {
        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);
        TreeNode twenty = new TreeNode(20, fifteen, seven);
        TreeNode nine = new TreeNode(9);
        TreeNode root = new TreeNode(3, nine, twenty);

        List<List<Integer>> result = levelOrder(root);
        System.out.println(result);
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return Collections.emptyList();
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> levelValues = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                TreeNode polledElement = queue.poll();
                levelValues.add(polledElement.val);
                if (polledElement.left != null)
                    queue.add(polledElement.left);
                if (polledElement.right != null)
                    queue.add(polledElement.right);
            }
            result.add(levelValues);
        }

        return result;
    }

}
