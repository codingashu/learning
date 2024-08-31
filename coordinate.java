import java.util.*;
public class coordinate {
    public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x>0 && y> 0){
			System.out.println("1st Quadrant");
		}
		else if(x<0&&y>0){
			System.out.println("2nd Quadrant");
		}
		else if(x<0 && y<0){
			System.out.println("3rd Quadrant");
		}
		else if(x>0&&y<0){
			System.out.println("4th Quadrant");
		}
		else if(x!=0&&y==0){
			System.out.println("x axis");
		}
		else if(y!=0&&x==0){
			System.out.println("y axis");
		}
		else if(x==0&&y==0){
			System.out.println("Origin");
		}



		/*if(x==0 && y!=0){ System.out.println("y axis");}
		if(y==0 && x!=0) { System.out.println("x axis");}
		if(x==0 && y==0) {System.out.println("Origin");}
		if(x<0){
			if(y<0){
				System.out.println("3rd Quadrant");
				}
			else if(y>0){ 
					System.out.println("2nd Quadrant");
				}
			}
		else if (x>0){
			if(y>0){
				System.out.println("1st Quadrant");
			}
			else if(y<0){
				System.out.println("4th Quadrant");
			}
		}*/	// Write code here
		
	sc.close();}
}
