package Self_Learn_Programs;
import java.util.Scanner;

//To find the first occurrence of the character d

public class First_Occurrence_Character {
    public static void main(String[] args) {
        //Getting the String as an input from the user
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String Word =  sc.nextLine();
        int Word_Length = Word.length();

        //To find the first occurrence of the character d
        char[] Letter = new char[Word_Length];
        for (int i = 0; i < Word_Length; i++){
            Letter[i] = Word.charAt(i);
            Letter[i] = Character.toLowerCase(Letter[i]);
            if (Letter[i] == 'd') {
                System.out.println(i + 1);
                break;
            }
        }

    }
}
