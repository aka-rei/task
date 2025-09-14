import java.util.Stack;

public class VerySimpleStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        stack.push("Первый");
        stack.push("Второй");
        stack.push("Третий");
        
        System.out.println("Все элементы в стеке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
