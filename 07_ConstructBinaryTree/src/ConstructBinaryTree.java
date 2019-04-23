import java.util.Arrays;

/**
 * @ClassName ConstructBinaryTree
 * @Description TODO
 * @Author yuchenwang
 * @Date 2019-04-23 11:10
 * @Version 1.0
 **/
public class ConstructBinaryTree {
    static boolean flag = false;
    public class BinaryTreeNode {
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;

        public BinaryTreeNode(int val) {
            this.val = val;
        }
    }
    public void theFirstTraversal(BinaryTreeNode root) {  //先序遍历
        System.out.print(root.val);
        if (root.left != null) {  //使用递归进行遍历左孩子
            theFirstTraversal(root.left);
        }
        if (root.right != null) {  //递归遍历右孩子
            theFirstTraversal(root.right);
        }
    }
    public void theInOrderTraversal(BinaryTreeNode root) {  //中序遍历
        if (root.left != null) {
            theInOrderTraversal(root.left);
        }
        System.out.print(root.val);
        if (root.right != null) {
            theInOrderTraversal(root.right);
        }
    }
    public void thePostOrderTraversal(BinaryTreeNode root) {  //后序遍历
        if (root.left != null) {
            thePostOrderTraversal(root.left);
        }
        if(root.right != null) {
            thePostOrderTraversal(root.right);
        }
        System.out.print(root.val);
    }

    public ConstructBinaryTree() {
    }

    public BinaryTreeNode construct(int[] pre, int[] in) {
        if(pre == null || in == null){ return null;}
        if(pre.length == 0 || in.length == 0){ return null;}
        if(pre.length != in.length){ flag = false; return null;}
        BinaryTreeNode root = new BinaryTreeNode(pre[0]);
        flag = false;
        for(int i = 0; i < pre.length; i++){
            if(pre[0] == in[i]){
                flag = true;
                root.left = construct(Arrays.copyOfRange(pre,1,i+1), Arrays.copyOfRange(in, 0, i));
                root.right = construct(Arrays.copyOfRange(pre, i+1, pre.length),Arrays.copyOfRange(in, i+1, in.length));
            }
        }
        return root;
    }

    public static void main(String[] args) {
        ConstructBinaryTree constructBinaryTree = new ConstructBinaryTree();
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        BinaryTreeNode root = constructBinaryTree.construct(pre, in);
        if(root != null && flag == true) {
            constructBinaryTree.theFirstTraversal(root);
            System.out.println();
            constructBinaryTree.theInOrderTraversal(root);
            System.out.println();
            constructBinaryTree.thePostOrderTraversal(root);
        }else {
            System.out.println("Invalid Input!");
        }
    }
}
