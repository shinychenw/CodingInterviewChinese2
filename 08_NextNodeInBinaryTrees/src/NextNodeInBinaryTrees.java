import java.util.Arrays;

/**
 * @ClassName NextNodeInBinaryTrees
 * @Description TODO
 * @Author yuchenwang
 * @Date 2019-04-23 14:51
 * @Version 1.0
 **/
public class NextNodeInBinaryTrees {
    public class BinaryTreeNode {
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;
        BinaryTreeNode parent;
        public BinaryTreeNode(int val) {
            this.val = val;
        }
    }

    public NextNodeInBinaryTrees() {
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

    public BinaryTreeNode construct(int[] pre, int[] in, BinaryTreeNode parent) {
        if(pre == null || in == null){ return null;}
        if(pre.length == 0 || in.length == 0){ return null;}
        if(pre.length != in.length){ return null;}
        BinaryTreeNode root = new BinaryTreeNode(pre[0]);
        root.parent = parent;
        for(int i = 0; i < pre.length; i++){
            if(pre[0] == in[i]){
                root.left = construct(Arrays.copyOfRange(pre,1,i+1), Arrays.copyOfRange(in, 0, i), root);
                root.right = construct(Arrays.copyOfRange(pre, i+1, pre.length),Arrays.copyOfRange(in, i+1, in.length), root);
            }
        }
        return root;
    }

    public BinaryTreeNode nextNode(BinaryTreeNode node) {
        if(node == null){ return null;}
        BinaryTreeNode next = null;
        if(node.right != null){
            node = node.right;
            while(node.left != null){
                node = node.left;
            }
            next = node;
        }else if(node.parent != null){
            while(node.parent.left != node){
                node = node.parent;
            }
            next =  node.parent;
        }
        return next;
    }

    public static void main(String[] args) {
        NextNodeInBinaryTrees nextNodeInBinaryTrees = new NextNodeInBinaryTrees();
        int[] pre = {1, 2, 4, 5, 8, 9, 3, 6, 7};
        int[] in = {4, 2, 8, 5, 9, 1, 6, 3, 7};
        BinaryTreeNode root = nextNodeInBinaryTrees.construct(pre, in, null);
        nextNodeInBinaryTrees.thePostOrderTraversal(root);
        System.out.println(" " + nextNodeInBinaryTrees.nextNode(root.left.right.right).val);
    }
}
