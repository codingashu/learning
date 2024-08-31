import java.util.Scanner;

public class factorial {
    	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		if(n<0){
			System.out.println("Error");
		}
		else{
			long result = fact(n);
			System.out.println(result);
		}
        sc.close();
		
	}
	public static long fact(int num){
		if(num == 0 || num == 1){
			return 1;
			}
		else {
			return num*fact(num-1);
		}
	}
}
