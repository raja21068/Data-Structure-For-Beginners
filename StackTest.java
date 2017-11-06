package DataStructure;

/**
 * Created on Oct 7, 2011, 1:56:48 AM

 */
public class StackTest {
    public static void main(String arg[])throws Exception{
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        
        while(!stack.isStackEmpty())
            System.out.println(stack.pop());
    }
}
