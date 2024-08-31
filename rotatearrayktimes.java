import java.util.ArrayList;

public class rotatearrayktimes {
    	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
       int n= arr.size();
       while(k>0){
           int temp=arr.get(0);
           for(int j=0;j<=n-2;j++){
               
               arr.set(j,arr.get(j+1));
           }
           arr.set(n-1,temp);
           k--;

       }
       return arr; // Write your code here.
    }
}
