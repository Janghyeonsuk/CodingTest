package inflearnCodingTest.recursivetreegraph;

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class DFS_5 {
    Node root;

    public void DFS(Node root) {
        if(root == null)
            return;
        else{
            System.out.print(root.data + " "); //전위
            DFS(root.lt);
//            System.out.print(root.data + " "); //중위
            DFS(root.rt);
//            System.out.print(root.data + " "); //후위
        }
    }

    public static void main(String[] args) {
        DFS_5 tree = new DFS_5();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}
