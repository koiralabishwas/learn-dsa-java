package dsa.partTwo.BinaryTrees;

public class recusiion {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    // 3! 3 * 2 * 1
    // n! = n + (n -1)!
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial((n -1));
    }
}
