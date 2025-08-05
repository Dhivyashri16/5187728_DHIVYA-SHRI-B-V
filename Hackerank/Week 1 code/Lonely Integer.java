import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int r=0;
        for(int i=0;i<n;i++){
            r=r^arr[i];
        }
        System.out.println(r);
    }
}