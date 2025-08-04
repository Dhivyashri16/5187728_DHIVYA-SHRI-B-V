class MinmaxSum {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=in.nextInt();
        }
        longs ts=0;
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<5;i++){
            int num=arr[i];
            ts=num+ts;
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }
        }
        long minsum=ts-max;
        long maxsum=ts-min;
        System.out.println(minsum+" "+maxsum);
    }


    
}
