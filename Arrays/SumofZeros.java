
import java.util.ArrayList;

public class SumofZeros {

	public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {

		int sum = 0;
		int l = mat.size();
		int b=mat.get(0).size();
		for(int i=0;i<l;i++){
			for(int j=0;j<b;j++){
			if(mat.get(i).get(j) == 0){
				if(j>0&&(mat.get(i).get(j-1)==1)) sum++;
				if(i>0&& mat.get(i-1).get(j)==1) sum++;
				if(j<b-1 && mat.get(i).get(j+1)==1) sum++;
				if(i<l-1&&mat.get(i+1).get(j)==1) sum++;
			 }
			 }
		 }
		  // Write your code here.
		return sum;
	}
}
