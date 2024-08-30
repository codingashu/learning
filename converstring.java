public class converstring{
	public static String convertString(String str) {
          char[] c = str.toCharArray();
          c[0]=Character.toUpperCase(c[0]);
          for(int i=0;i<c.length-1;i++){
              if(c[i]==' '){
                  c[i+1]=Character.toUpperCase(c[i+1]);
              }
              // Write your code here
        }
        return new String(c);

}
}

