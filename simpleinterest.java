import java.util.Scanner;
class Main {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		float r = sc.nextFloat();
		int t = sc.nextInt();
		int s = (int)(p*r*t)/100;
		System.out.println(s);
        sc.close();// Write code here
		
	}
}