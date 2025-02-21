import java.util.*;
public class Dolu {
    public static void main(String arg[]){
    
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = A+B;

    if(C==50||A==50||B==50){
        System.out.println(true);

    }
    else{
        System.out.println(false);
    }
    }
}
