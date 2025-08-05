import java.util.*;
class main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String[] s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=in.nextLine();
        }
        int q=in.nextInt();
        in.nextLine();
        String[] qu=new String[q];
        for(int i=0;i<q;i++){
            qu[i]=in.nextLine();
        }
     for(int i=0;i<q;i++){
        int count=0;
        for(int j=0;j<n;j++){
            if(qu[i].equals(s[j]));{
            count++;
        }
    }
       System.out.println(count);
     }
     
    }
}