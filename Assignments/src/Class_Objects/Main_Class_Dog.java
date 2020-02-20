package Class_Objects;

public class Main_Class_Dog {
    public static void main(String[] args) {
        Dog Labdog = new Dog();
        Labdog.setBreed_Name("Labrador");
        Labdog.setAge(5);
        Labdog.setColor("White");
        System.out.println("The Dog Breed is" + " " + (Labdog.getBreed_Name()));
        Labdog.Running_Speed();
        Labdog.Swimming();
        
        
        Dog Doberman = new Dog();
        Doberman.setBreed_Name("Doberman");
        Doberman.setAge(2);
        Doberman.setColor("Black");
        int Age = Doberman.getAge();
        System.out.println("The Dog Breed is" + " " + (Doberman.getBreed_Name()));
        Doberman.Running_Speed();
        System.out.println("The Age of Doberman is" + " " +  Age);
        
    }
    

}
