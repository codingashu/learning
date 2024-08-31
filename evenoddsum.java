import java.util.*;
public class evenoddsum {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int eve = 0;
		int od=0;
		while(n!=0){
			int k = n%10;
			if(k%2==0){
				eve+=k;
			}
			else{
				od+=k;
			}
			n=n/10;
		}
		System.out.println(eve+" "+od);
		sc.close();
		// Write your code here

	}
}

