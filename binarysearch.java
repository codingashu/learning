public class binarysearch {
    public static int search(int []nums, int target) {
        int n= nums.length-1;
        int l=0,h=n-1;
        while(l<=h){
            int m=(l+h)>>1;
            if(nums[m]==target){
                return m;
            }
            else if(nums[m] > target){
                h=m-1;
            }
            else if(nums[m] < target){
                l=m+1;
            }
        }
        
        return -1;
                // Write your code here.
    }
}
