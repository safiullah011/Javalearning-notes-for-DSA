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


//Inheritence 

// public class Oops {
//     public static void main(String[] args) {
//         // Fish Shark = new Fish();
//         // Shark.eat();
//         // Shark.breath();
//         // dog dobby = new dog();
//         // dobby.eat();
//         // dobby.legs = 4;
//         // System.out.println(dobby.legs);
//     }
// }

// class Animal{
//     String color ;
//     void eat() {
//         System.out.println("eats");
//     }
//     void breath() {
//         System.out.println("breathes");
//     }
// }
// //derived\subclass
// //hirarchial inheritnece
// class Fish extends Animal {
//     // int fins;

//     void swim() {
//         System.out.println("swims in water");
//     }
// }

// class mammmal extends Animal {
//     // int legs;
//     void walk() {
//         System.out.println("walks");
//     }
// }

// //Multi level inheritence 
// // class dog extends mammmal {
// //     String breed;
// // }

// class Bird extends Animal {
//     void fly() {
//         System.out.println("fly");
//     }   
// }

//Function overloading
// public class Oops {
//     public static void main(String[] args) {
//         Calculator calc = new Calculator();
//         System.out.println(calc.sum(1,2));
//         System.out.println(calc.sum(1.8f , 2.2f));
//         System.out.println(calc.sum(2,3,5));
        
//     }
// }
// class Calculator {
//     int sum(int a , int b) {
//         return a + b;
//     }
//     float sum(float a , float b) {
//         return a + b ;
//     }
//     int sum( int a ,int b , int c) {
//         return a + b + c;
//     }
// }



public class Oops {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.mooves();
    }
}

interface Herbivores {

}
interface Carnivore {

}
class Bear implements Herbivores , Carnivore {
                                                                     // hear we can make infinite no. super interfaces property
}

interface Chessplayer {
    void mooves(); //public,abstract , in chess player we cannot write its implementation bcoz we have to implement abstract

}
class Queen implements Chessplayer {
    public void mooves() {
        System.out.println("up,down , left , right , diagonal (in all)");
    }
}
class Rook implements Chessplayer {
    public void mooves() {
        System.out.println("up, down , left , right");
    }
}

class King implements Chessplayer {
    public void mooves() {
        System.out.println("up, down , left , right , diagonal");
    }
}