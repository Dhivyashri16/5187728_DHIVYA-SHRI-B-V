import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int q=in.nextInt();
        for(int i=0;i<q;i++){
            long n=in.nextLong();
            long flipped=4294967295L - n;
            System.out.println(flipped);
        }
    }
}