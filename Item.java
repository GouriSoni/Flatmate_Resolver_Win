import java.util.*;
public class Item {
public static void main(String args[]){
Scanner sc = new Scanner (System.in);

float pencil = sc.nextFloat();
float pen = sc.nextFloat();
float eraser = sc.nextFloat();
float cost = pencil+pen+eraser;
System.out.println(cost);

float gst = cost + (0.18f*cost);

System.out.println(gst);
}    
}
