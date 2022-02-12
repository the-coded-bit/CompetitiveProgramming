public class TransformToLeftClonedTree {
    public static Node createLeftCloneTree(Node node){
        // write your code here
        if(node == null) return null;
    
        Node left_cloned = createLeftCloneTree(node.left);
        Node right_cloned = createLeftCloneTree(node.right);
    
        Node new_node = new Node(node.data, left_cloned, null);
        node.left = new_node;
        node.right = right_cloned;
        return node;
      }
      public static void main(String[] args) {
        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
            null };
        Node root = BinaryTree.createBinaryTree(arr);
        root = createLeftCloneTree(root);
      }
}
