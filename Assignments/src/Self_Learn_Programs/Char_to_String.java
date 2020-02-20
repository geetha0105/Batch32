package Self_Learn_Programs;

public class Char_to_String {
    public static void main(String[] args) {
        char c = 'A';

//Converting the Char 'A' to string
//Method1
String A = ""+'A';
        System.out.println(A);

//Method2
String B = 'A' + "";
        System.out.println(B);

//Method3
String C = String.valueOf('A');
String D = String.valueOf(c);



    }
}
