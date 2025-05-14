import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left,right;
    Node(int val){
        data = val;
        left=right=null;
    }
}

public class BinaryTree {
    public static Node insert(Node root, int data){
        if (root == null){
            root = new Node(data);
            return root;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            Node temp = q.poll();
            if (temp.left == null){
                temp.left = new Node(data);
                break;
            }
            else{
                q.offer(temp.left);
                if (temp.right == null){
                    temp.right = new Node(data);
                    break;
                }
                else {
                    q.offer(temp.right);
                }
            }
        }
        return root;
    }

    public static void inorderTraversal(Node root){
        if (root == null){
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data+" ");
        inorderTraversal(root.right);
    }
    public static void preorderTraversal(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void postorderTraversal(Node root){
        if (root == null){
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data+" ");

    }

    public static Node deletion(Node root, int key){
        if (root ==null){
            return null;
        }
        if (root.left == null && root.right==null){
            if (root.data == key){
                return null;
            }
            return root;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        Node temp = new Node(0);
        Node key_node = null;

        while (!q.isEmpty()){
            temp = q.poll();
            if (temp.data == key){
                key_node = temp;
            }
            if (temp.left != null){
                q.offer(temp.left);
            }
            if (temp.right != null){
                q.offer(temp.right);
            }
        }
        if (key_node!= null){
            int x = temp.data;
            key_node.data = x;
            deleteDeepest(root,temp);
        }
        return root;
    }

    public static void deleteDeepest(Node root, Node d_node){
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        Node temp;
        while (!q.isEmpty()){
            temp = q.poll();
            if (temp == d_node){
                temp = null;
                d_node = null;
                return;
            }

            if (temp.right != null){
                if (temp.right == d_node){
                    temp.right = null;
                    d_node = null;
                    return;
                }
                else {
                    q.offer(temp.right);
                }
            }

            if (temp.left != null){
                if (temp.left == d_node){
                    temp.left = null;
                    d_node = null;
                    return;
                }
                else {
                    q.offer(temp.left);
                }
            }
        }
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root,10);
        root = insert(root,20);
        root = insert(root,30);
        root = insert(root,40);

        System.out.print("Preorder Traversal: ");
        preorderTraversal(root);

        System.out.print("\nInorder Traversal: ");
        inorderTraversal(root);

        System.out.print("\nPostorder Traversal: ");
        postorderTraversal(root);

        root = deletion(root,20);
        System.out.print("\nPreorder Traversal (After deletion): ");
        preorderTraversal(root);
    }
}
