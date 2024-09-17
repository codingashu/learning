import java.util.* ;
import java.io.*; 
public class Equilib {

	public static int arrayEquilibriumIndex(int[] arr){  
		
		int n=arr.length;
		int[] sl = new int[n];
		int[] sr = new int[n];
		sl[0]=arr[0];
		for(int i =1;i<n;i++){
			sl[i]=sl[i-1]+arr[i];
		}
		sr[n-1]=arr[n-1];
		for(int i = n-2;i>=0;i--){
			sr[i]=sr[i+1]+arr[i];
		}
		for(int i=0; i<n;i++){
			if(sl[i]==sr[i]){
				return i;
			}
		}
		return -1;//Your code goes here
	}
}