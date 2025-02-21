import java.util.*;
public class averageNumber {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter num1:");
     int num1 = sc.nextInt();
     System.out.println("enter num2: ");
     int num2 = sc.nextInt();
     System.out.println("enter num3: ");

     int num3 = sc.nextInt();
     

     int average= calculateAverage(num1, num2, num3);
     System.out.printf("the average of %d %d %d is %d",num1,num2,num3,average);
    sc.close();

    }
    public static int calculateAverage(int num1, int num2, int num3){
     return (num1+num2+num3)/ 3;
    }
}
