public class Reverce {
    public static void main(String[] args) {
        
        int n = 7884;
        int rev = 0;

        while(n>0){
         int s=n%10;
         rev=(rev*10)+s;
         n=n/10;
        }System.out.println(rev);
    }
}
