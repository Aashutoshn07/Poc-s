import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Initial Stack: " + stack);
        int popedElement = stack.pop();
        System.out.println("Popped Element: " + popedElement);
        System.out.println("Stack after poped: " + stack);

        int topElement = stack.peek();
        System.out.println("Top Element: " + topElement);
        System.out.println("Stack after peek: " + stack);

        boolean isEmpty = stack.isEmpty();
        System.out.println("Is Stack Empty: " + isEmpty);

        int elementToSearch = 20;
        int position = stack.search(elementToSearch);
        System.out.println("Position of " + elementToSearch + " in Stack: " + position);

        stack.clear();
        System.out.println("Stack after Cleaning: " + stack);
    }
}
