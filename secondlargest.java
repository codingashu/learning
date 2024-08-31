import java.util.Arrays;
public class secondlargest {
    public static int[] getSecondOrderElements(int n, int []a) {
        Arrays.sort(a);
        int b[] = new int[2];
        b[0]=a[n-2];
        b[1]=a[1];
        return b;// Write your code here.
    }
}

