## Question

### Code
```java
//{ Driver Code Starts
// Initial template for Java
import java.util.*;
import java.io.*;
class Anagram {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1 = read.readLine();
            String S2 = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.areAnagram(S1, S2));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function template for Java
// User function template for Java
class Solution {
    static int areAnagram(String S1, String S2) {
        // code here
         if (S1.length() != S2.length()) {
            return 0;
        } else {
            // Convert both strings to character arrays
            char[] charArray1 = S1.toCharArray();
            char[] charArray2 = S2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Compare the sorted arrays
            if (Arrays.equals(charArray1, charArray2)) {
                return 1; // Strings are anagrams
            } else {
                return 0; // Strings are not anagrams
            }
        }
    }
}
```