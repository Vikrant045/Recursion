public class LengthOfString {


    public static int length(String a) {

        if(a.length()==0){
            return 0;
        }

        return length(a.substring(1))+1;
        
    }

    public static void main(String args[]) {
        String a="u";
        //System.out.println(a.length());
        System.out.println(length(a));


        
    }
    
}
