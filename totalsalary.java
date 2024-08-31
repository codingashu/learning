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
/*Ninja just got an offer letter from a reputable company. The company sent him an offer letter along with the salary bifurcation.

In that bifurcation,Total Salary was not mentioned but instead a ‘basicSalary’ and an upper case character representing grade was mentioned, depending on which the Total Salary is calculated.

Help Ninja in calculating his total salary, where total salary is defined as:

‘totalSalary’ = ‘basic’ + ‘hra’ + ‘da’ + ‘allowance’ - ‘pf’
The above terms are as follows:

‘hra’ = 20% of ‘basic’
‘da’ = 50% of ‘basic’
‘allowance’ = 1700 if grade = ‘A’
‘allowance’ = 1500 if grade = ‘B’
‘allowance’ = 1300 if grade = ‘C' or any other character
‘pf’ = 11% of ‘basic’.
Note :

Round off the ‘totalSalary’ and then print the integral part only.

'x.5' type values will always be round up, for example, 1.5, 2.5 will be round off to 2, 3 respectively. */