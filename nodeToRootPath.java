import java.util.ArrayList;

public class nodeToRootPath {

    public static ArrayList<Integer> path;
    public static boolean find(Node node, int data){
        if(node == null) return false;

        if(node.data == data){
            path.add(node.data);
            return true;
        }

        boolean left = find(node.left, data);
        if(left){
            path.add(node.data);
            return true;
        }
        boolean right = find(node.right, data);
        if(right){
            path.add(node.data);
            return true;
        }
        
        return false;
    }
    public static void main(String[] args) {
        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
            null };
        Node root = BinaryTree.createBinaryTree(arr);
        path = new ArrayList<>();
        System.out.println(find(root, 62));

        System.out.println(path);
    }
}
