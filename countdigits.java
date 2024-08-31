public class countdigits {
    public static int countDigits(int n){
        int c=0;
        int num=n;
        
        while(n>0){
            int k;
            k=n%10;
            if (k!=0 && num%k==0){
                c=c+1;
            }
            n=n/10;
            // Write your code here.
    }
    return c;
}
}
/*You are given a number ’n’.



Find the number of digits of ‘n’ that evenly divide ‘n’.



Note:
A digit evenly divides ‘n’ if it leaves no remainder when dividing ‘n’.


Example:
Input: ‘n’ = 336

Output: 3

Explanation:
336 is divisible by both ‘3’ and ‘6’. Since ‘3’ occurs twice it is counted two times. */