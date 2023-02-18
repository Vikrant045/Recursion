public class PrintNumsFromN_to_1{

    public static void numsInDecreasingOrder(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
    else{
        System.out.println(n);
        numsInDecreasingOrder(n-1);
    }
    }
    

    public static void numsInIncreasingOrder(int n){
        if(n==1){
            System.out.print(" "+n);
            return;
        }
    else{
        numsInIncreasingOrder(n-1);
        System.out.print(" "+n);

    }
    }


    public static void main(String args[]) {
int n =9;
//int m =1;
        numsInDecreasingOrder(n);
        System.out.println();
        numsInIncreasingOrder(n);
        
    }

}