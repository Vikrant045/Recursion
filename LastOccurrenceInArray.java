public class LastOccurrenceInArray {
    
    public static int  find(int arr[],int i,int key) {
        if(i==arr.length){
            return -1;
        }
        int isfound = find(arr, i+1, key);
        if(isfound==-1&& arr[i]==key){
            return i;
        }
        return isfound;
        
        
        
    }
    public static void main(String args[]) {

        int arr [] ={1,4,2,4,4};
        int i =0,key =1;
        System.out.println(find(arr,i,key));

    
}
}
