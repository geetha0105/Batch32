package Self_Learn_Programs;

import java.util.Scanner;

public class Compare_Strings {
    public static void main(String[] args) {

//Getting input for the no of words entered
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of the words to be given as input");
        int Count = Integer.parseInt(sc.nextLine());

//Getting the input of words
        String[] Words = new String[Count];
        System.out.println("Enter the words one by one");

        for(int i = 0; i < Count; i++){
            System.out.println(i);
            Words[i] = sc.nextLine();
        }

//Compare the Strings
       String Temp;
        for(int i = 0; i < Count; i++){
            for (int j = 0+i; j < Count; j++){
                if(Words[i].compareTo(Words[j])>0){
                    Temp = Words[i];
                    Words[i] = Words[j];
                    Words[j] = Temp;
                }
            }
        }
//Printing the Strings

       for(int i = 0; i < Count; i++) {
           System.out.println(Words[i]);
       }
    }}