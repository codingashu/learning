public class checksorted {
    public static int isSorted(int n, int []a) {
        int c=1;
      for (int i=0;i<n-1;i++){
          if(a[i+1]<a[i]){
              c=0;
          }
      } 
      return c; // Write your code here.
    }
}
