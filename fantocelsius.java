import java.util.* ;
class fantocelsius {
	void convert(int s, int e, int w){
		for(int i=s;i<e+1;){
			int c;
			c= ((i-32)*5)/9;
			if(c>0){
				System.out.println(i+"\t"+(int)Math.floor(c));
			}
			else {System.out.println(i+"\t"+(int)Math.ceil(c));}
			i=i+w;

		}
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//Start Fahrenheit Value (S)
		int b= sc.nextInt();//End Fahrenheit value (E)
		int d = sc.nextInt();//Step Size (W)
		fantocelsius so = new fantocelsius();
		so.convert(a, b, d);
        sc.close();
		// Write code here
		
	}
}