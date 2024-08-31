public class fibonacci {
    public static int fibonacciNumber(int n){
        int m =1000000007;
        int a =0;
        int b=1;
        int f=0;

        if(n<2){
            return 1;
        }
        for(int i=2;i<=n;i++){
            f=a+b;
            a=b;
            b=f;
            if(b>m){
                b=b-m;
            }
        }
        return b;  
}
}
// find the nth fibonacci number for user given n