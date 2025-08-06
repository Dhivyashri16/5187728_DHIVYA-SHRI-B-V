import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i,n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=new int[n][n];
            }
        }
        int ps=0;
        int ss=0;
        for(int i=0;i<n;i++){
            ps=ps+arr[i][i];
            ss=ss+arr[n-1-i];
        }
        int result=Math.abs(ps-ss);
        System.out.println(result);
    }
}