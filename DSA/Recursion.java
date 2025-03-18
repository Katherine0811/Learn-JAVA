public class Recursion {

    // Recursion:
    // Wikipedia: When a thing is defined in terms of itself
    // A recursive method calls itse;f. Can be a substitute for iteration.
    // Divide a problem into sub-problems of the same type as the original.
    // Commonly used in advanced sorting algorithms and navigating trees.

    // Advantages:
    // 1. Easier to read / write
    // 2. Easier to debug

    // Disadvantages:
    // 1. Sometimes slower
    // 2. Uses more memory

    public static void main(String[] args) {
        // walk(5);
        // recursion(100000);
        // System.out.println(factorial(7));
        System.out.println(power(2, 1));
    }

    private static void walk(int steps) {
        for (int i = 0; i < steps; i++) {
            System.out.println("You take a step!");
        }
    }
    
    private static void recursion(int steps) {
        if (steps < 1) return;
        System.out.println("You take a step!");
        recursion(steps - 1);
    }
    
    private static int factorial(int num) {
        if (num < 1) return 1; // base case
        return num * factorial(num - 1); // recursive
    }    

    private static int power(int base, int exponent) {
        if (exponent < 1) return 1;
        return base * power(base, exponent - 1);
    }
}
