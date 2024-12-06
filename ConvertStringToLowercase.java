//{ Driver Code Starts
// Initial template for Java

import java.util.*;
import java.io.*;

class ConvertStringToLowercase {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.toLower(s));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function template for Java

class Solution {
    static String toLower(String s) {
         StringBuilder r = new StringBuilder();
    int len=s.length();

    for(int i=0;i< len;i++){
        
      char ch = Character.toLowerCase(s.charAt(i));
      r.append(ch);
    }
    
  return r.toString(); 
    }
}