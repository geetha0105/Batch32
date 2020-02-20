package Class_Objects;

public class Dog {

    private String Breed_Name;
    private int Age;
    private String Color;

    //Overloading the constructor for the Dog class
    public Dog(String Breed_Name, int Age, String Color) {
        this(Breed_Name, Age); //reuse the constructors or calling the constructor
        this.Color = Color;
    }

    public Dog(String Breed_Name, int Age) {
        this.Breed_Name = Breed_Name;
        this.Age = Age;
    }

    public Dog() {
    }  //This is a default constructor created explicitly

    public Dog(String Breed_Name) {
        this.Breed_Name = Breed_Name;
    }

    //Assigning Getters for the instance variables
    public String getBreed_Name() {
        return Breed_Name;
    }

    public void setBreed_Name(String breed_Name) {
        Breed_Name = breed_Name;
    }

    public int getAge() {
        return Age;
    }

    //Assigning setters for the instance variables
    public void setAge(int age) {
        Age = age;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void Running_Speed(){
        if(Breed_Name != "" && Breed_Name == "Labrador"){
            System.out.println("Running speed is good");
        }else {
            System.out.println("Running speed is okay");
        }
    }

    public void Swimming() {
        if (Breed_Name == "Labrador"){
            System.out.println("Dog swims well");
        }else{
            System.out.println("Dog is a very fast swimmer");
        }
    }
}
