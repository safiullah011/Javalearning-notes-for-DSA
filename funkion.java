// public class functions {
//     return type name() {
//     body 
//     return statement ;
//  }  
//     void = empity
    
//  
    
// }

// public class funkion {
//     public static int calculatesum(int n1 , int n2 ) {
//         int sum = n1 + n2 ;
//         return sum;
//     }
//     public static int factorailprod(int n){
//         int f = 1;
//         for(int i = 1 ; i<=n ;i++) {
//             f = f*i;
//         }
//         return f;
//     }
//     public static void main(String[] args) {
//         // int a = 5;
//         // int b = 10;
//         // int sum = calculatesum(a,b);
//         // System.out.println("Sum is : "+ sum);
//         System.out.println(factorailprod(685));
//     }
// }

import java.math.BigInteger;

public class funkion {

    public static BigInteger factorial(int n) {
        BigInteger f = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }

        return f;
    }

    public static void main(String[] args) {
        int n = 685;
        System.out.println("Factorial of " + n + " is:");
        System.out.println(factorial(n));
    }
}

/* Why not recursion?
For huge number we cannot use int and float we have to use Biginteger  
Iterative approach is better here to avoid stack overflow for large n.*/