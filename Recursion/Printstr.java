import java.util.List;
import java.util.ArrayList;
public class Printstr {
    public static List<String> str = new ArrayList<String>();
    public static List<String> printNtimes(int n){
       
       str.add("Coding Ninjas");     
       if(n>1)
        {printNtimes(n-1);}
        
    return str;    
    }
}