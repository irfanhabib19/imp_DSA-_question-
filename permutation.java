package BackTracking;

public class permutation {
    public static void print_permu(String str,String ans){
        if(str.equals("")){
            System.out.print(ans+" ");
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String left=str.substring(0,i);
            String right=str.substring(i+1);
            String rem=left+right;
            print_permu(rem,ans+ch);
        }
    }
    public static void main(String[] args) {
        String str="abcd";
       print_permu(str,"");
    }
}
