
public class maxelement {

    static int largestElement(int[] arr, int n) {
        int a=0;
        for(int i:arr){
            a=Math.max(a,i);
        }
        return a;
    }

}
