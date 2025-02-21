import java.util.*;
public class Fun {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.println("input the first number:");
        int x = Sc.nextInt();
        System.out.println("input the second number:");
        int y = Sc.nextInt();
        System.out.println("input the third number:");
        int z = Sc.nextInt();
        System.out.println("the average value is"+average(x,y,z)+"\n");

    }
    public static int average(int x, int y, int z){
        return(x+y+z)/3;
    }

}
