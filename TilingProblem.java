public class TilingProblem {

    public static int tiles(int n) {

      
        if(n==0 || n==1){
            return 1;
        }

        int vertical = tiles( n-1);
        int horizontal = tiles( n-2);

        int totalWays = vertical + horizontal;
        return totalWays;

        
    }

    public static void main(String args[]) {

        
        int n = 4;
       

        System.out.println(tiles( n));
        
    }
    
}
