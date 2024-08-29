import java.util.Scanner;
public class sumeven {
	public static void sum1(int m){
		int s = 0;
		for(int i=0;i<=m;i++){
			if(i%2==0){
				s=s+i;
			}
		}
		System.out.println(s);
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// Write code here
		sum1(n);
        sc.close();
	}
}

