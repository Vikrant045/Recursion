public class X_to_the_powerN {
    public static int power(int x,int n) {
        if(n==1){
            return x;
        }

        return x*power(x, n-1);
        
    }
    public static void main(String args[]) {

        int x = 2;
        int n = 3;

        System.out.println(power(x, n));
        
    }
    
}
