import java.util.ArrayDeque;
import java.util.Queue;

public class Traversals {

    private static void preOrderTraversals(Node node) {
        if (node == null)
            return;
        System.out.println(node.data);
        preOrderTraversals(node.left);
        preOrderTraversals(node.right);
    }

    private static void postOrderTraversals(Node node) {
        if (node == null)
            return;
        postOrderTraversals(node.left);
        postOrderTraversals(node.right);
        System.out.println(node.data);
    }

    private static void inOrderTraversals(Node node) {
        if (node == null)
            return;
        inOrderTraversals(node.left);
        System.out.println(node.data);
        inOrderTraversals(node.right);

    }

    private static void levelOrderTraversal(Node node) {
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);

        while (mq.size() > 0) {
            int count = mq.size();
            for (int i = 0; i < count; i++) {
                node = mq.remove();
                System.out.print(node.data + " ");
                if (node.left != null)
                    mq.add(node.left);
                if (node.right != null)
                    mq.add(node.right);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
                null };
        Node root = BinaryTree.createBinaryTree(arr);
        preOrderTraversals(root);
        System.out.println("------------");
        inOrderTraversals(root);
        System.out.println("------------");
        postOrderTraversals(root);
        System.out.println("----------");
        levelOrderTraversal(root);
    }
}
