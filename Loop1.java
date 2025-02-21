public class Loop1 {
    public static void inverted_retated_half_pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
               System.out.println();
            }      
          }
    public static void inverted_half_pyramid_withnumber(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        } 
    }
    public static void floyd_tringle_pattern(int n){
        int counter=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        //inverted_retated_half_pyramid(7);
        //inverted_half_pyramid_withnumber(5);
        floyd_tringle_pattern(6);
    }
}
