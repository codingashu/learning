public class Palrec {
    
        public static boolean isPalindrome(String str) {
            int n = str.length();
            return b(0,n-1,str);
            }
        public static boolean b(int a,int b1, String str){
            if(a>=b1){
                return true;
            }
            if(str.charAt(a)==str.charAt(b1)){
            return b(a+1,b1-1,str);
        }
        return false;
        
        }
    }

