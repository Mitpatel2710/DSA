package OOPS;

public class Human {
    String name;
    int age;
    int heightInInches;
    String eyeColor;

//    public OOPS.Human(){
//        age =26;
//        eyeColor = "black";
//        heightInInches = 72;
//        name = "Mit Patel";
//    }

    public Human(String name, int age, int heightInInches, String eyeColor) {
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }

    public void speak(){
        System.out.println("Hello My name is "+name);
        System.out.println("I am "+ age + " old");
        System.out.println("I am "+ heightInInches + " inches tall");
        System.out.println("I am "+ eyeColor + " color");
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void walk(){
        System.out.println("Walking...");
    }
    public void work(){
        System.out.println("Working...");
    }

}
