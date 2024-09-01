public class palindrome {
    public static boolean checkPalindrome(String str) {
		
		StringBuffer st = new StringBuffer();
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(Character.isLetterOrDigit(ch)){
				st.append(Character.toLowerCase(ch));
			}
		}
		int start = 0;
		int end = st.length()-1;
		while(start<end){
			if(st.charAt(start)!=st.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;		// WRITE YOUR CODE HERE	
	}
}
