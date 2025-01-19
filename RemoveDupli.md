## Question

### Code
```java
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();

            Solution ob = new Solution();
            String result = ob.removeDups(s);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String removeDups(String s) {
        // code here
           LinkedHashSet<Character> set = new LinkedHashSet<Character>();
        for(char ch : s.toCharArray()){
            set.add(ch);
        }
        StringBuilder str = new StringBuilder();
        Iterator<Character> itr = set.iterator();
        while(itr.hasNext()){
            str.append(itr.next());
        }
        return str.toString();
    }
}
```