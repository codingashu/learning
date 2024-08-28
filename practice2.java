import java.util.Scanner ;
class Person {
	static String name1;
	static int age1;
	public void display(String name1,int age1){
		System.out.println("The name of the person is "+name1+" and the age is "+age1+".");
	}
	// Complete the class
}

class Solution {
	
	public static void main(String args[]) {
		
		Person p = new Person();
		Scanner sc = new Scanner(System.in);
		String name2 = sc.nextLine();
		int age2 = sc.nextInt();
		p.display(name2,age2);// Write your code here
        sc.close();
	}
}
		
