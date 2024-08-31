public class totalsalary {
    public static int totalSalary(int basic, char grade) {
		double t= basic + (0.2*basic)+(0.5*basic)-(0.11*basic);
		if(grade == 'A'){
			t= t+1700;
		}
		else if(grade == 'B'){
			t= t+1500;
		}
		else {
			t= t+1300;
		}
		return (int)Math.round(t);
		//Write your code here
	}
}
