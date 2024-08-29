import java.util.Scanner;
public class highestnum {	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		/*if(a>b){
			if(c>a){
				System.out.println(c);
			}
			else System.out.println(a);
		}
		else {
			if(c>b){
				System.out.println(c);
			}
			else System.out.println(b);
		}*/
		int d;
		if(a<b){
			d=b;
		}
		else d=a;
		if (c>d){
			d=c;
		}
		System.out.println(d);
		sc.close();
// Write code here
}
}

