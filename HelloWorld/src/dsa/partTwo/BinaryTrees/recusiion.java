package dsa.partTwo.BinaryTrees;

public class recusiion {
    
    // 3! 3 * 2 * 1
    // n! = n + (n -1)!
    // public static int factorialRecursive(int n) {
        
    // }
    
    public static int factorialLoop(int n) {
        var factorial = 1;
        for(var i = n ; i > 1 ; i --) {
            factorial *= i;
        }
        return factorial;
    }

    public static int  factorialRecursive(int n ) {
        if (n == 1) return n;
        return n * factorialRecursive(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorialLoop(4));
        System.out.println(factorialRecursive(4));
    }
}
