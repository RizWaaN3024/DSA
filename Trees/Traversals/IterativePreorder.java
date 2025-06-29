import java.util.*;


public class IterativePreorder {

    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static List<List<Integer>> findPreorder (TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        List<List<Integer>> result = new ArrayList<>();
    }  
}
