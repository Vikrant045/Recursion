public class OptimizedX_power_N {

    public static int power(int x,int n) {

        if(n==0)
        {
            return 1;
        }
        int hp = power(x, n/2);
        int p =hp*hp;
        if(n%2!=0){
            return x*p;
        }
        
        return p;
        
    }

    public static void main(String args[]) {

        int x = 2;
        int n = 4;
        System.out.println(power(x, n));
        
    }
    
}
