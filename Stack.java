
public class Stack {
    
    int[] stack = new int[5]; // Initialise stack (array)
    int top = 0; // Track top of stack
    
    public void push(int data) { // Push to the top of stack
        if(top == stack.length){ // If stack is full
            System.out.println("STACK IS FULL");
        } else {
            stack[top] = data; // Add value to stack
            top++;
        }
    }
    
    public int pop() { // Remove top value from stack
        if (isEmpty()) { // If stack is empty
            System.out.println("STACK IS EMPTY");
            return 0;
        } else {
            top--;
            int data = stack[top];
            stack[top] = 0;
            return data;
        }
    }
    
    public int peek() {
        System.out.println("Top element is ");
        return stack[top - 1];
    }
    
    public void show() {
        for(int i = 0; i < stack.length; i++) {
            System.out.print(stack[i] + " ");
        }
    }
    
    public int size() {
        System.out.println("Stack size is: ");
        return top;
    }
    
    public boolean isEmpty() {
        return top <= 0;
    }
    
} 
