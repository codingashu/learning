import java.util.List;
import java.util.ArrayList;
public class factrec { 
    public static long a =1;    
    public static long fact(long a){
        if(a<=1) return 1;
        return a*fact(a-1);
    }  
    public static List<Long> l = new ArrayList<Long>(); 
    public static List<Long> factorialNumbers(long n) {
        while(fact(a)<=n){
            l.add(fact(a));
            a++;
            // Write Your Code Here
    }
    return l;
}
}