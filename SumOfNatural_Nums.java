public class SumOfNatural_Nums {
//int sum =0;
    public static int  sum(int n) {

if(n==1){
    return 1;
}

return n+sum(n-1);
        
        
    }
    

    public static void main(String args[]){

        int n = 3;
int sum =0;
        //sum(n);
        System.out.println(sum(n));
    }
}
