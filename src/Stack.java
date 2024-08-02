public class Stack {
    private int[] Stack;
    private int top;

    

    public int[] getStack() {
        return Stack;
    }

    public void setStack(int[] stack) {
        Stack = stack;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public Stack(int size){
        Stack = new int[size];
        top = -1;
    }

    //push the element into the stack
    public void push(int data){
        if(top == Stack.length - 1){
            System.out.println("Stack is full");
        }else{
            Stack[++top] = data;
        }
    }

    //pop the element from the stack
    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }else{
            return Stack[top--];
        }
    }

    //peek the top element of the stack
    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }else{
            return Stack[top];
        }
    }

    //check if the stack is empty
    public boolean isEmpty(){
        return top == -1;
    }

    //check if the stack is full
    public boolean isFull(){
        return top == Stack.length - 1;
    }

    //display the stack
    public void display(){
        for(int i = 0; i <= top; i++){
            System.out.print(Stack[i] + " ");
        }
        System.out.println();
    }

    //This is the main method
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(5);
        stack.push(10);
        stack.push(35);
        stack.push(56);
        stack.push(60);
        stack.display();

        System.out.println("Popped element: " + stack.pop());
        stack.display();
        System.out.println("Top element: " + stack.peek());
        System.out.println("Is stack empty: " + stack.isEmpty());
        System.out.println("Is stack full: " + stack.isFull());
    }
}