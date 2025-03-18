import java.util.Stack;

public class Stacks {

    // Stack:
    // LIFO data structure (Last-In-First-Out)
    // Stores objects into a sort of "vertical tower"
    // Example: a pile books or CDs
    // push() to add to the top
    // pop() to remove from the top

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println((stack.empty()));

        stack.push(7);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println((stack.empty()));
        System.out.println((stack));

        int myFavGame = stack.peek();
        stack.pop();
        System.out.println((stack));
        System.out.println(myFavGame);

        System.out.println(stack.peek().equals(3));
        System.out.println(stack.search(3));
    }
    
    // Uses of Stacks:
    // 1. Undo / Redo features in text editors
    // 2. Moving back / forward through browser history
    // 3. Backtracking algorithms (Maze / file directories)
    // 4. Calling functions (Call stack)
}