import java.util.* ;
class power {
	void powern(int x, int n){
		if (n==0){ System.out.println(1);}
		else {System.out.println((int)Math.pow(x,n));}
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		power s = new power();
		s.powern(a,b);
        sc.close();// Write code here
		
	}
}