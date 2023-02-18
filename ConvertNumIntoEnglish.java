public class ConvertNumIntoEnglish {


   static String arr[] = {" zero"," one"," two"," three"," four"," five"," six"," seven"," eight"," nine"};

    public static void english(int a) {
        if(a==0){
            return;
        }
        int index = a%10;

        english(a/10);
      System.out.print(arr[index]);
       
        
    }

    public static void main(String args[]){

        int a = 1923;
        System.out.println(a);
        int i=0;
        english(a);



    }
    
}
