

/**
 * Solve (a + b) whole square = a square + b square + 2ab
 * Solve (4a + 5b)2
 *
 * Take the input from command prompt.
 */
//NEED CORRECTION
public class Problem06 {
    public static void main(String[] args) {
        int a = 5; int b = 10;
        int e= a+b;
         int c = Math.pow (e, 2); //+ (2*5*10);
        int d = (4*5 + 5*10) * 2;
        long l = 12828484l;
        System.out.println("The answer for the first problem is " + c);
        System.out.println("The answer for the second problem is " + d);
    }
}
