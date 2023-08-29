public class CODEWARS {
    public static void main(String[] args) {
        int[] array = {17, 0, -4, 3, 15};
        TreeNode root = CODEWARS.arrayToTree(array);
        System.out.println(root.value);
        printTree(root.left);
        printTree(root.right);
    }
    static TreeNode arrayToTree(int[] array) {
        if (array.length == 0) {
            return null;
        }
        TreeNode[] res = new TreeNode[array.length];
        for (int i = 0; i < array.length; i++) {
            res[i] = new TreeNode(array[i]);
        }
        for (int i = 0; i < res.length; i++) {
            if ((i * 2 + 1) < res.length) {
                res[i].left = res[i * 2 + 1];
            }
            if ((i * 2 + 2) < res.length) {
                res[i].right = res[i * 2 + 2];
            }
        }
        return res[0];
    }
    static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.value);
        printTree(root.left);
        printTree(root.right);
    }
}