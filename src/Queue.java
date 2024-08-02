public class Queue {
    private int[] Queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;
   

    public Queue(int capacity){
        Queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
        this.capacity = capacity;
    }

    //enqueue the element into the queue
    public void enqueue(int data){
        if(size == capacity){
            System.out.println("Queue is full");
        }else{
            rear = (rear + 1) % capacity;
            Queue[rear] = data;
            size++;
        }
    }

    //dequeue the element from the queue
    public int dequeue(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }else{
            int data = Queue[front];
            front = (front + 1) % capacity;
            size--;
            return data;
        }
    }

    //peek the front element of the queue
    public int peek(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }else{
            return Queue[front];
        }
    }

    //check if the queue is empty
    public boolean isEmpty(){
        return size == 0;
    }

    // This is the main method

    public static void main(String[] args){
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);

        System.out.println(q.peek());
        System.out.println(q.dequeue());
       System.out.println(q.isEmpty());

    }
}

