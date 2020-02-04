/* Summation of series Write a program that displays the result of
				1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9.

 */
public class Problem03 {
    public static void main(String[] args) {
        int i;
        int Sum = 0;
        for (i=0;i<10;i++){
            Sum = Sum + i;
        }
        System.out.println("The summation is " + Sum);

    }
}
