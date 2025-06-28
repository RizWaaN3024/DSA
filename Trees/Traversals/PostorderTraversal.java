import java.util.*;

public class PostorderTraversal {
    
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void findPostOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        findPostOrder(root.left);
        findPostOrder(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println("PostOrder Traversal");
        findPostOrder(root);
    }
}
