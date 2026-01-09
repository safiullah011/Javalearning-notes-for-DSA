// public class functions {
//     return type name() {
//     body 
//     return statement ;
//  }  
//     void = empity
    
//  
    
// }

public class funkion {
    public static int calculatesum(int n1 , int n2 ) {
        int sum = n1 + n2 ;
        return sum;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = calculatesum(a,b);
        System.out.println("Sum is : "+ sum);
    }
}