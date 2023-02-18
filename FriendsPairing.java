public class FriendsPairing {

    public static int pairs(int n){

        if(n==1||n==2){
            return n;
        }

        int single = pairs(n-1);

        int pair  = pairs(n-2);

        int pairWays = (n-1)*pair;

        return single + pairWays;
    

    }

    public static void main(String args[]){

        System.out.println(pairs(4));
    }
    
}
