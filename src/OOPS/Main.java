package OOPS;

import OOPS.Human;

public class Main {
    public static void main(String[] args) {
//        System.out.println("----------------------------");
//        OOPS.Human tam;
//        tam = new OOPS.Human();
//        tam.age =26;
//        tam.eyeColor = "black";
//        tam.heightInInches = 72;
//        tam.name = "Mit Patel";
//        tam.speak();
//        System.out.println("----------------------------");
//        OOPS.Human joe = new OOPS.Human();
//        joe.age =17;
//        joe.eyeColor = "black";
//        joe.heightInInches = 72;
//        joe.name = "Het Patel";
//        joe.speak();
//        System.out.println("----------------------------");
        Human human1 = new Human("Mit Patel", 26,72,"Black");
        Human human2 = new Human("Het Patel",17,65,"Black");
        Human human3 = new Human("Armi Patel",29,70,"Black");

        System.out.println("----------------------------");
        human1.speak();
        System.out.println("----------------------------");
        human2.speak();
        System.out.println("----------------------------");
        human3.speak();




    }
}