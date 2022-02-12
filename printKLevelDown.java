public class printKLevelDown {
    public static void printKLevelsDown(Node node, int k){
        // write your code here
        if(node == null || k < 0) return;
        if(k == 0){
          System.out.println(node.data);
          return;
        }
        printKLevelsDown(node.left, k - 1);
        printKLevelsDown(node.right, k - 1);
      }
      public static void main(String[] args) {
        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
            null };
        Node root = BinaryTree.createBinaryTree(arr);
        printKLevelsDown(root, 2);
      }
}
