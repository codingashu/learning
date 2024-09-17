
public class SymmMat {
    public static boolean isMatrixSymmetric(int[][] matrix) {
       int l = matrix.length;
       int b = matrix[0].length;
       for(int i=0;i<l;i++){
           for(int j=0;j<b;j++){
               if(matrix[i][j]!=matrix[j][i]){
                return false;
                
           }
           }
       }
       return true; // Write your code here.
    }
}