import java.util.* ;
import java.io.*; 
public class Seclar {
	public static int findSecondLargest(int n, int[] arr) {
		Arrays.sort(arr);
		if(arr[0]==arr[n-1]){
			return -1;
		}
		int i=0;
		for(i=1;i<n;i++){
			if(arr[n-1]!=arr[n-i]) break;
		}
		return arr[n-i];// Write your code here.
	}
}