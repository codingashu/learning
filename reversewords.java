public class reversewords {
    public static String reverseString(String str) 
	{
		String[] arr=str.trim().split("\\s+");
		int s=0;
		int e=arr.length-1;
		String temp="";
		while(s<e){
			temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			s++;
			e--;
		}
		String ans = String.join(" ",arr);
		return ans;
	}
}
