package Problem_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();

        // list.add(50);
        // list.add(20);
        // list.add(70);
        // list.add(30);
        // System.out.println(list);
        // Collections.sort(list);
        // System.out.println(list);

        // List<Integer> list1 = new LinkedList<>();
        // list1.addAll(list);
        // System.out.println(list1);

        // Stack<Integer> stack = new Stack<>();
        // stack.addAll(list);
        // stack.addAll(list1);

        // Queue<Integer> queue = new LinkedList<>();
        // list1.add(10);
        // queue.add(20);
        // // list1.forEach(System.out::println());

        Stack<String> stack = new Stack<>();
        stack.push("Mahi");
        stack.push("Buttler");
        stack.push("Rituraj");
        stack.push("Virat");
        stack.push("Ishan");
        stack.push("Rohit");
        stack.push("KL Rahul");
        stack.push("Hardik");
        stack.push("Warner");

        System.out.println(stack);
        Collections.sort(stack);
        System.out.println(stack);

    }
}
