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
    
    public static List<Integer> findPreorder (TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        st.push(root);
        while (!st.isEmpty()) {
            TreeNode node = st.pop();
            result.add(node.data);
            if (root.right != null) {
                st.push(root.right);
            }
            if (root.left != null) {
                st.push(root.left);
            }
        }
        return result;
    }  
}
