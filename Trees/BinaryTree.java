package Trees;

import java.util.Scanner;

public class BinaryTree {
    TreeNode root;

    public BinaryTree(int rootValue) {
        root = new TreeNode(rootValue);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.right.right = new TreeNode(5);
        System.out.println("Binary Tree Created");
    }
}
