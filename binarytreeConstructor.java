import java.util.Stack;

class Node {
    Node left, right;
    int data;

    Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

class pair {
    Node node;
    int state;

    pair(Node node, int state) {
        this.node = node;
        this.state = state;
    }
}

class BinaryTree {

    // method to provide Binary Tree
    public static Node createBinaryTree(Integer[] arr) {
        Stack<pair> st = new Stack<>();
        Node root = new Node(arr[0], null, null);
        pair rootpair = new pair(root, 1);

        st.push(rootpair);
        int i = 1;

        while (st.size() > 0) {
            pair top = st.peek();
            if (top.state == 1) {
                if (arr[i] != null) {
                    Node leftNode = new Node(arr[i], null, null);
                    top.node.left = leftNode;

                    pair np = new pair(leftNode, 1);
                    st.push(np);

                } else {
                    top.node.left = null;
                }
                top.state++;
                i++;
            } else if (top.state == 2) {
                if (arr[i] != null) {
                    Node rightNode = new Node(arr[i], null, null);
                    top.node.right = rightNode;

                    pair np = new pair(rightNode, 1);
                    st.push(np);

                } else {
                    top.node.right = null;
                }
                top.state++;
                i++;
            } else
                st.pop();
        }
        return root;
    }

    // display method in binary tree
    public static void display(Node node) {

        if (node == null)
            return;

        // displaying the node itself
        String str = "";
        str += (node.left != null) ? node.left.data : ".";
        str += " <- " + node.data + " -> ";
        str += (node.right != null) ? node.right.data : ".";
        System.out.println(str);

        // having faith left and right node of parent will print its family alongwith
        // itself
        display(node.left);
        display(node.right);
    }

    //size of binary tree
    public static int size(Node node) {
        // write your code here
        if (node == null)
            return 0;

        int sfl = size(node.left);
        int sfr = size(node.right);

        return sfl + sfr + 1;
    }

    //sum of nodes of binary tree
    public static int sum(Node node) {
        // write your code here
        if (node == null)
            return 0;

        int left = sum(node.left);
        int right = sum(node.right);
        int total = left + right + node.data;
        return total;
    }


    //maximum in binary tree
    public static int max(Node node) {
        // write your code here
        if (node == null)
            return Integer.MIN_VALUE;

        int left = max(node.left);
        int right = max(node.right);
        int ans = Math.max(node.data, Math.max(left, right));
        return ans;
    }

    //total height in terms of edges.. when edges return -1 when nodes return 0
    public static int height(Node node) {
        // write your code here
        if (node == null)
            return -1;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        int ans = Math.max(leftHeight, rightHeight) + 1;
        return ans;
    }

    public static void main(String[] args) {
        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
                null };
        Node root = createBinaryTree(arr);
        System.out.println(root.left.data);
        display(root);

    }
}