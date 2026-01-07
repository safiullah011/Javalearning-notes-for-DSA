//Trapping rainwater theoryy
//Auxuliary array
//( waterlevel - barlevel ) * width = trapped water
// public static int trappedrain(int height[]){
//     int n = height.length;

//     int leftmax[] = new int[n];
//     int rightmax[] = new int[n];

//     leftmax[0] = height[0];
//     for(int i=1; i<n; i++){
//         leftmax[i] = Math.max(height[i], leftmax[i-1]);
//     }

//     rightmax[n-1] = height[n-1];
//     for(int i=n-2; i>=0; i--){
//         rightmax[i] = Math.max(height[i], rightmax[i+1]);
//     }

//     int trappedwater = 0;

//     for(int i=0; i<n; i++){
//         int waterlevel = Math.min(leftmax[i], rightmax[i]);
//         trappedwater += waterlevel - height[i];
//     }

//     return trappedwater;
// }
// public class Arrayjava {

//     public static int buyandsell(int prices[] ) {
//         int buyprice = Integer.MAX_VALUE;
//         int maxprofit = 0;

//         for(int i = 0; i < prices.length; i++){
//             if(buyprice < prices[i]){
//                 int profit = prices[i] - buyprice;
//                 maxprofit = Math.max(maxprofit, profit);
//             } else {
//                 buyprice = prices[i];
//             }
//         }

//         return maxprofit;
//     }

//     public static void main(String args[]) {
//         int[] prices = {7,1,5,3,6,4};
//         System.out.println(buyandsell(prices));
//     }
// }

// import java.util.*;
// public class Arrayjava {
//     public static void maxsubarraysum(int number []) {
//         int currsum = 0;
//         int maxsum = Integer.MIN_VALUE;

//         for(int i = 0;i<number.length ; i++) {
//             int start = i;
//             for(int j = i ; j<number.length ; j++ ) {
//                 int end = j;
//                 currsum = 0;
//                 for(int k = start ; k<=end ; k++) {
//                     currsum += number[k];

//                 }
//                 System.out.println(currsum);
//                 if(maxsum < currsum) {
//                     maxsum = currsum;
//                 }
//             }
//         }
//         System.out.println("max sum: " + maxsum);
//     }

// import java.util.Scanner;

// public class Arrayjava{
//     public static boolean search(int matrix[][],int key ) {
//         for(int i = 0; i<matrix.length ; i++){
//             for(int j = 0; j<matrix[0].length ; j++) {
//                 if(matrix[i][j] == key) {
//                     System.out.println("found at cell (" + i + ","+ j + ")");
//                     return true;
//                 }
//             }
//         }
//         System.out.println("key not found");
//         return false;
//     }
//     public static void main(String args[] ) {
//         int matrix [][] = new int [3][3];
//         int n = matrix.length , m = matrix[0].length;

//         Scanner sc = new Scanner(System.in);
//         for(int i = 0; i<n ; i++ ){
//             for(int j = 0 ; j<m ; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         for(int i = 0; i<n ; i++) {
//             for(int j = 0; j<m ; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//         search(matrix , 5);
//     }
// } 
// public class Arrayjava{
//     public static void printspiral(int matrix[][]) {
//         int startrow = 0;
//         int startcol = 0;
//         int endrow = matrix.length-1;
//         int endcol = matrix[0].length-1;
//         while(startrow<=endrow && startcol<=endcol ) {
//             //top
//             for(int j=startcol;j<=endcol;j++ ) {
//                 System.out.print(matrix[startrow][j]+ " ");
//             }
//             //right
//             for(int i=startrow+1; i<=endrow ; i++){
//                 System.out.print(matrix[i][endcol]+" ");
//             }
//             //bottom
//             for(int j=endcol-1;j>= startcol ;j--){
//                 if(startrow == endrow){
//                     break;
//                 }
//                 System.out.print(matrix[endrow][j]+" ");
//             }
//             //left
//             for(int i=endrow-1;i>=startrow ; i--) {
//                 if(startcol == endcol) {
//                     break;
//                 }
//                 System.out.print(matrix[i][startcol]+" ");
//             }
//             startcol++;
//             startrow++;
//             endcol--;
//             endrow--;
//         }
//         System.out.println();
//     }
//     public static int diagonalsum(int matrix[][]){
//         int sum = 0;
//         for(int i = 0;i<matrix.length;i++) {
//             for(int j = 0;j<matrix[0].length ; j++){
//                 if( i==j ){
//                     sum += matrix[i][j];
//                 } 
//                 else if ( i+j == matrix.length-1){
//                     sum += matrix[i][j];

//                 }
//             }
//         }
//         return sum;

//     }
//     public class Arrayjava {
// public class Array{
//     public static boolean staircase(int matrix[][] , int key){
//         int row = 0; 
//         int col = matrix[0].length - 1;

//         while(row < matrix.length && col >= 0) {
//             if (matrix[row][col] == key) {
//                 System.out.println("found key at (" + row + "," + col + ")");
//                 return true;
//             } 
//             else if (key < matrix[row][col]) {
//                 col--;
//             }
//             else {
//                 row++;
//             }
//         }

//         System.out.println("key not found");
//         return false;
//     }

//     public static void main(String[] args) {
//         int matrix[][] = {
//             {1,2,3,4},
//             {5,6,7,8},
//             {9,10,11,12},
//             {13,14,15,16}
//         };

//         int key = 14;
//         staircase(matrix, key);
//     }
// }


//leap year condition 
// import java.util.*;
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the year :");
//         int year = sc.nextInt();
//         if (year%4==0 || year%100==0){
//             System.out.println("This year is leap year");
//         } 
//         else if (year % 400 == 0) {
//             System.out.println("This year is leap year");
//         }
//         else { 
//             System.out.println("this year is not leap year");

//         }
//         sc.close();
        
//     }
// }

