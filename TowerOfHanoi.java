public class TowerOfHanoi {

    public static void hanoi(int n ,String source,String helper,String destination) {

        if(n==1){
System.out.println(source +" "+destination);
//System.out.println("transfer disk "+n+"from "+ source +" to "+helper);
            return;
        }
        hanoi(n-1, source, destination, helper);
        System.out.println(source +" "+destination);
      //System.out.println("transfer disk "+n+"from "+source+" to "+helper);

        hanoi(n-1,helper , source, destination);
        
    }
    public static void main(String args[]) {
        int n =3;
        String source ="A";
        String helper = "B";
        String destination ="C";

hanoi(n, source, helper, destination);        
    }
    
}
