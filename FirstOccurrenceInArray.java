public class FirstOccurrenceInArray {

    public static int  find(int arr[],int i,int tar) {
        if(i==arr.length){
            return -1;
        }
        
        if(arr[i]==tar){
            return i;
        }
        return  find(arr, i+1, tar);
        
    }
    public static void main(String args[]) {

        int arr [] ={1,4,2,4,4};
        int i =0,tar =40;
        System.out.println(find(arr,i,tar));


        
    }
    
}
