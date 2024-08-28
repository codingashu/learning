import java.util.Scanner;
public class alphabetchar{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ans = sc.next().charAt(0);
        if(ans >= 'A' && ans <= 'Z')
        {
            System.out.println(1);// Write your code here
        }
        else if(ans>='a'&&ans<='z'){
            System.out.println(0);
        }
        else {
            System.out.println(-1);
        }
        sc.close();
}
} 

