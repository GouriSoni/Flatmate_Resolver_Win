// import java.util.*;
// public class test{
//     public static void main(String args[]){
//      Scanner sc = new Scanner(System.in);
//      int a = sc.nextInt();
//      int b = sc.nextInt();
//      int operator = sc.nextInt();

//     //  int sum = a+b;
//     //  int minus = a-b;
//     //  int multiply = a*b;
//     //  int divide = a%b;
//     //  System.out.println(sum);

//     switch(operator) {
//         case 1 : System.out.println(a+b);
//         break;
//         case 2 : System.out.println(a-b);
//         break;
//         case 3 : System.out.println(a*b);
//         break;
//         case 4 : if(b == 0) {
//                     System.out.println("Invalid Division");
//                 } else {
//                     System.out.println(a/b);
//                 }
//      break;
//         case 5 : if(b == 0) {
//                     System.out.println("Invalid Division");
//                 } else {
//                     System.out.println(a%b);
//                 }
//      break; 
//         default : System.out.println("Invalid Operator");

//      }
//     }
// }

// class test{
//     public static void main(String args[]){
//     //     int a =10;
//     //     int b =20;
//     //    int Sum = a+b;
//     for(int i=0; i<11;i++){
//      System.out.println(i);
//     }
//     }
// }

// import java.util.*;
// public class test{
//     public static void main(String Rgs[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int Sum = a + b;
//         System.out.println(Sum);
//     }
// }

// class test {
//     public static void main(String args[]) {
//         int i = 0;
//         while (i < 11) {
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// class test {
//     public static void main(String args[]) {
//         int i = 0;
//         do {
//             System.out.println(i);
//             i++;
//         } while (i < 11);
//     }
// }

// class test{
//     public static void main(String[] args) {
//         int sum = 0;
//         for(int i=1; i<5; i++){
//             sum=sum+i;
//             System.out.println(sum);
//         }
//     }
// }

// import java.util.*;
// public class test{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int Sum = 0;
//         for(int i=0; i<=n; i++){
//             Sum = Sum + i;
            
//         }
//         System.out.println(Sum);
//     }
// }

// public class test{
//     public static void main(String[] args) {
//         // //  int n= 4;
//         // for(int i=1; i<11; i++){
//         // System.out.println(i*n);

//         // }
//         int n = 4;
//         int m = 5;
//         for(int i=1; i<=n; i++){
//             for(int j=1;j<=m; j++){
//             System.out.print("*");
//             }
//             System.out.println("*");
//         }
       
//     }
// }

// public class test{
//     public static void main(String[] args) {
//         // //  int n= 4;
//         // for(int i=1; i<11; i++){
//         // System.out.println(i*n);

//         // }
//         int n = 4;
//         int m = 5;
//         for(int i=1; i<=n; i++){
//             for(int j=1;j<=m; j++){
//                 if(i==1 || j==1 || i==n || j==m){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
       
//     }
// }

// class test{
//     public static void main(String [] args){
//      int a = 4;
    
//       for( int i=1; i<=a; i++){
//         for(int j=1; j<=i; j++){
//             System.out.print("*");
//         }
//         System.out.println("");
//       }
//     }
// }

// invert star peramit
// class test{
//     public static void main(String [] args){
//      int a = 4;
    
//       for( int i=a; i>=1; i--){
//         for(int j=1; j<=i; j++){
//             System.out.print("*");
//         }
//         System.out.println("");
//       }
//     }
// }

// public class test{
//     public static void main(String args[]){
//      int n = 4;
//      for(int i=1; i<=n; i++){
//         for(int j=1; j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int j=1; j<=i; j++){
//             System.out.print("*");
//         }
//         System.out.println();
//      }
//     }

// }

// public class test {

//     public static void main(String ards[]){
//         int N=5;
//         for (int i=1; i<=N; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.*;
// public class test{
//     public static void main(String [] args){
//     //   Scanner sc = new Scanner(System.in);
//       int a= 7;
//       int b= 5;
//       int sum=a+b;
//       System.out.println(sum);
//     }
// }

// import java.util.*;
// public class test{
// public static int calculateNumber(int a, int b){
//     int sum = a+b;
//     return sum;
// }


//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a= sc.nextInt();
//         int b= sc.nextInt();
//         int sum = a+b;
//         calculateNumber(a, b);
//         System.out.println(sum);
//     }
// }

// import java.util.*;
// public class test{
//     public static void main(String args[]){
//      Scanner sc= new Scanner(System.in);
//      int n = sc.nextInt();
     
//      for(int i=0; i<n; i++){
//         for(int j=0; j<n; j++){
//             System.out.println("hello");
//         }
//      }
//     }
// }
// import java.util.Scanner;

// public class PrimeCheck {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = scanner.nextInt();
        
//         boolean isPrime = num > 1;
//         for (int i = 2; i <= Math.sqrt(num); i++) {
//             if (num % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }
        
//         System.out.println(num + (isPrime ? " is a prime number." : " is not a prime number."));
//         scanner.close();
//     }
// }

// import java.util.*;

// public class PrimeCheck {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = scanner.nextInt();
        
//         if (num <= 1) {
//             System.out.println(num + " is not a prime number.");
//         } else if (num == 2) {
//             System.out.println(num + " is a prime number.");
//         } else if (num % 2 == 0) {
//             System.out.println(num + " is not a prime number.");
//         } else {
//             boolean isPrime = true;
//             for (int i = 3; i <= Math.sqrt(num); i += 2) {
//                 if (num % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//             System.out.println(num + (isPrime ? " is a prime number." : " is not a prime number."));
//         }
        
//         scanner.close();
//     }
// }

// Java Program to demonstrate Brute Force Method to check if a number is prime
// import java.util.*;
// class GFG {
//     static boolean isPrime(int n)
//     {
//         // Corner case
//         if (n <= 1)
//             return false;

//         // Check from 2 to n-1
//         for (int i = 2; i < n; i++)
//             if (n % i == 0)
//                 return false;

//         return true;
//     }

//     // Driver Program
//     public static void main(String args[])
//     {
//         if (isPrime(11))
//             System.out.println(" true");
//         else
//             System.out.println(" false");
//         if (isPrime(15))
//             System.out.println(" true");
//         else
//             System.out.println(" false");
//     }
// }

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
  
//       Scanner scanner = new Scanner(System.in);

//       System.out.print("Enter a number: ");
//       int num = scanner.nextInt();


//       boolean flag = false;
  
//       // 0 and 1 are not prime numbers
//       if (num == 0 || num == 1) {
//           flag = true;
//       }
  
//       for (int i = 2; i <= num / 2; ++i) {
  
//         // condition for nonprime number
//         if (num % i == 0) {
//           flag = true;
//           break;
//         }
//       }
  
//       if (!flag)
//         System.out.println(num + " is a prime number.");
//       else
//         System.out.println(num + " is not a prime number.");
//     }
//   }

// import java.util.*;
// public class Main{
//  public static void main(String [] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("enter a number ");
//     int num = sc.nextInt();
     
//     if(num%2==0){
//      System.out.print(num+ "is even");
//     }
//     else{
//         System.out.print(num + "is odd");
//     }

//  }
// }

import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    
  }
}