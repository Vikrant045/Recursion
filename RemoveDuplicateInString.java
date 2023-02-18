public class RemoveDuplicateInString {


public static void duplicate(String st,StringBuilder sb, int i,boolean map[])
    
    {

        if(i==st.length()){
            System.out.println(sb);
            return;
        }
       char ch = st.charAt(i);
if(map[ch-'a']==true){
    duplicate(st, sb, i+1, map);
}
else{
    map[ch-'a']=true;
    duplicate(st, sb.append(ch), i+1, map);
}
    }
    public static void main(String args[]) {
        String st = "vvviiikkrrannt"; 
       // StringBuilder sb = new StringBuilder("");
        int i=0;
        boolean map[] = new boolean[26];
        duplicate(st, new StringBuilder(""), 0,map);

    }
    
}
