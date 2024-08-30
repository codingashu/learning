public class linearsearch {
    public static int linearSearch(int arr[], int x) {
		for(int i=0;i<arr.length;i++){
      if(arr[i]==x){
        return i;
        //Your code goes here
        }
    }
    
    return -1;
    }
}
