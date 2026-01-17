// public class Oops { 
//     public static void main(String[] args) {
//         //public is access specifiers/modifiers
//         Pen p1 = new Pen();
//         p1.setColor("blue");
//         p1.setTip(5);
//         System.out.println(p1.color);
//         System.out.println(p1.tip);
//         Bankaccount myAcc = new Bankaccount();
//         myAcc.username = "Safiullah" ;
//         myAcc.setPassword("Safiullah@436");;
//     }
    
// }

// class Bankaccount {
//     public String username;
//     private String password;
//     public void setPassword(String pwd) {
//         password = pwd;
//     }
// }

// class Pen{
//     String color;
//     int tip;
// //Getters
//     String getColor() {
//         return this.color;
//     }
//     int getTip() {
//         return this.tip;
//     }
// //Setters
//     void setColor(String newColor ) {
//         color = newColor;
//     }

//     void setTip(int tip) {
//         this.tip = tip;
//     }
// }

// class Student {
//     String name;
//     int age;
//     float percentage;

// }

public class Oops {
    public static void main(String[] args) {
        Fish Shark = new Fish();
        Shark.eat();
        Shark.breath();
        
    }
}

class Animal{
    String color ;
    void eat() {
        System.out.println("eats");
    }
    void breath() {
        System.out.println("breathes");
    }
}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}