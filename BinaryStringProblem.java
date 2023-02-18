public class BinaryStringProblem {

    public static void strings(int n,int lp, String st) {
        
        if( n==0){
            System.out.println(st);
            return;
        }

        strings(n-1, 0, st+"0");
        if(lp==0){
            strings(n-1, 1, st+"1");
  
        }
    }

    public static void main (String args[]){

        String st =" ";
        int n =3;
        int lp =0;
        strings(n, lp, st);
    }
    
}
