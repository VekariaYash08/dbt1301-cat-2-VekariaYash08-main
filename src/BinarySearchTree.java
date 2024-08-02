public class BinarySearchTree {
    
    class Node{
        int data;
        Node left;
        Node right;
        
        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    
    Node root;
    
    public BinarySearchTree(){
        root = null;
    }
    
    public void insert(int data){
        root = insertRec(root, data);
    }
    
    public Node insertRec(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        
        if(data < root.data){
            root.left = insertRec(root.left, data);
        }else if(data > root.data){
            root.right = insertRec(root.right, data);
        }
        
        return root;
    }
    
    public void inorder(){
        inorderRec(root);
    }
    
    public void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }
    
    // Main method
    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
        
        System.out.println("In order traversal: ");
        bst.inorder();
    }
}
