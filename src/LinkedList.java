class node{
    int data;
    node next;

    node(int data){
        this.data = data;
        
        this.next = null;

        
    }
}

public class LinkedList {
    node head;

    public void traverse(node head){
        node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
        
    }

 public void insert (int data, node head, int pos) {
     node toadd = new node(data);
     if(pos == 0){
        toadd.next = head;
        head = toadd; 
        return;
     }else{
        node prev = head;
        for(int i = 0; i < pos - 1; i++){
            prev = prev.next;
        }
        toadd.next = prev.next;
        prev.next = toadd;
     }
 }

  public void delete(node j, int pos){
    if(pos == 0){
        j = j.next;
        return;
    }else{
        node prev = j;
        for(int i = 0; i < pos - 1; i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }
  }

    public int search(node head, int data){
        node current = head;
        int pos = 0;
        while(current != null){
            if(current.data == data){
                return pos;
            }
            pos++;
            current = current.next;
        }
        return -1;
    }
}


public static void main(String[] args){
    LinkedList node = new LinkedList();
    node n1 = new node(10);
    node n2 = new node(20);
    node n3 = new node(30);
    

    node head = n1;
    head.next = n2;
    n2.next = n3;
    n3.next = null;

    node.traverse(head);

    node.insert(40, head, 3);

    node.search(head, 1);

    node.delete(head, 2);
}