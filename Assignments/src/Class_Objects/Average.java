package Class_Objects;

import java.util.Scanner;

public class Average {
   private int Maths_Mark;
   private int Science_Mark;
   private int Language_Mark;

//Creating Constructor for the Class
    public Average (int Maths_Mark, int Science_Mark, int Language_Mark){
        this.SetMathsMark(Maths_Mark);
        this.SetLanguageMark(Language_Mark);
        this.SetScienceMark(Science_Mark);
    }

//Overloading Constructors
   public Average(int Maths_Mark, int Science_Mark){
        this.SetMathsMark(Maths_Mark);
        this.SetScienceMark(Science_Mark);
   }

//Set Methods for all the three variables

    public void SetMathsMark (int Maths_Mark){
        if (Maths_Mark > 100){
            this.Maths_Mark = 100;
        }else {
            this.Maths_Mark = Maths_Mark;
        }
    }

    public void SetLanguageMark (int Language_Mark){
        if (Language_Mark > 100){
            this.Language_Mark = 100;
        }else {
            this.Language_Mark = Language_Mark;
        }
    }
    public void SetScienceMark (int Science_Mark){
        if (Science_Mark > 100){
            this.Science_Mark = 100;
        }else {
            this.Science_Mark = Science_Mark;
        }
    }

//Method created to calculate the Average

    int Calculate_Average() {
        int Average = ((Maths_Mark + Science_Mark + Language_Mark) / 3);
        System.out.println("The Average mark is " + Average);
        return Average;
    }

}
