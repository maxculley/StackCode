
public class Runner {

    public static void main(String[] args) {
        
        Stack stack = new Stack();
        stack.push(15);
        stack.pop();
        stack.pop();
        stack.push(8);
        stack.push(10);
        stack.push(69);
        stack.push(17);
        stack.push(77);
        System.out.println("Empty = " + stack.isEmpty());
        
        stack.show();
        
        
    }
    
}
