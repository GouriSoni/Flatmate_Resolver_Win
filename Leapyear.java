import java.util.*;
public class Leapyear {
    public static void main(String[] args) {
       Scanner Sc = new Scanner(System.in);
       int year = Sc.nextInt();

       boolean a = (year%4)==0;
       boolean b = (year%100)!=0;
       boolean c = ((year%100==0)&&(year%400==0));

       if(a&&b||c){
        System.out.println(year + "year is leap year");
       }else{
        System.out.println(year + "not a leap year");
       }
    }
}
