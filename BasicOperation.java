import java.io.*;
import java.util.*;


//size of generic tree
public class BasicOperation {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  public static int size(Node node){
    // write your code here
    int ans = 0;
    for(Node iNode : node.children){
        ans += size(iNode);
    }
    return ans + 1;
  }

  //return the maximum element in generic tree
  public static int max(Node node) {
    // write your code here
    int maxi = Integer.MIN_VALUE;
    for(Node iNode : node.children){
        maxi = Math.max(max(iNode), maxi);
    }
    maxi = Math.max(node.data, maxi);
    return maxi;
  }

  public static int height(Node node){

    //maxi initialize to -1 has significance since it handles the base case when there is only one node in tree
    int maxi = -1;
    for(Node iNode : node.children){
      maxi = Math.max(height(iNode), maxi);
    }
    int ans = maxi + 1;
    return ans;
  }

  public static void traversals(Node node){
    // write your code here
    
    //pre-order traversal
    System.out.println("Node Pre " + node.data);
    
    //in-order traversal
    for(Node iNode : node.children){
        System.out.println("Edge Pre " + node.data + "--" + iNode.data);
        traversals(iNode);
        System.out.println("Edge Post " + node.data + "--" + iNode.data);
    }
    
    //post-order traversal
    System.out.println("Node Post " + node.data);
  }

  public static void levelOrderLinewise(Node node){
    Queue<Node> mainQ = new ArrayDeque<>();
    Queue<Node> childQ = new ArrayDeque<>();

    mainQ.add(node);
    while(mainQ.size() > 0){

      node = mainQ.remove();
      System.out.print(node.data + " ");

      for(Node iNode : node.children){
        childQ.add(iNode);
      }

      if(mainQ.size() == 0){
        mainQ = childQ;
        childQ = new ArrayDeque<>();
        System.out.println();
      }

    }
  }

  public static void levelOrderLinewiseZZ(Node node){
    // write your code here
    Stack<Node> mainS = new Stack<>();
    Stack<Node> childS = new Stack<>();
    int level = 1;
    
    mainS.push(node);
    
    while(mainS.size() > 0){
        
        // remove
        node = mainS.pop();
        //print
        System.out.print(node.data + " ");
        //add according to level if level is even add in reverse order else in front order
        if(level%2 == 1){
            for(Node iNode : node.children){
                childS.push(iNode);
            }
        }
        else{
            for(int i = node.children.size()-1; i >= 0; i--){
                childS.push(node.children.get(i));
            }
        }
        
        if(mainS.size()== 0){
            mainS = childS;
            childS = new Stack<>();
            System.out.println();
            level++;
        }
    }
  }

  public static void mirror(Node node){

    for(Node iNode : node.children){
          mirror(iNode);
    }
    Collections.reverse(node.children);
  }

  public static boolean find(Node node, int data) {

    //base case
    if(node.data == data)
        return true;
        
    for(Node iNode : node.children){
        boolean ans = find(iNode, data);
        if(ans == true)
          return true;
    }
    
    return false;    
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    int sz = size(root);
    System.out.println(sz);
    int m = max(root);
    System.out.println(m);
    display(root);
    levelOrderLinewise(root);
    levelOrderLinewiseZZ(root);
    mirror(root);
    
  }

}