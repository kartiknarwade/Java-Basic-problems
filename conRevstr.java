//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class conRevstr {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1 = read.readLine();
            String S2 = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.conRevstr(S1, S2));
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function template for Java

class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        String concatenated = S1 + S2;
        String reversed = new StringBuilder(concatenated).reverse().toString();
        return reversed ;
    }
}