import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        s=s.toLowerCase();
        int count=0;
        for(cahr ch ='a' ; ch <='z' ;ch++){
            if(s.indexOf(ch)!=-1){
                count++;
            }
        }
        if(count==26){
            System.out.println("pangram");
        }else{
            System.out.println("not pangram");
        }
    }
}