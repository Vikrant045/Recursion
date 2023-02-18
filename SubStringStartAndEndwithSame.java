public class SubStringStartAndEndwithSame {

    public static int  count(String st,int i, int j,int n) {

        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }

        int res = count(st, i+1, j, n-1)+count(st, i, j-1, n-1)-count(st, i+1, j-1, n-2);
        if(st.charAt(i)==st.charAt(j)){
            res++;
        }
       
        return res;
    }

    public static void main(String args[]){

        String st = "aba";
        int i =0;
        int j = st.length()-1;
        int n = st.length();
        System.out.println(count(st, i, j, n));
    }
    
}
