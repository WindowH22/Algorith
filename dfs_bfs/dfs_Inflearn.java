package dfs_bfs;

class Node{
    int data;
    Node lt, rt;
    public Node(int val){
        data = val;
        lt = rt = null;
    }
}

public class dfs_Inflearn {
    Node root;
    public void DFS(Node root){
        if(root == null){
            return;
        }else{

            DFS(root.lt);
            System.out.println(root.data);
            DFS(root.rt);
        }
    }

    public static void main(String[] args) {
        dfs_Inflearn tree = new dfs_Inflearn();
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
