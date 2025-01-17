## Question

### Code
```java
//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        
System.out.println("~");
}
	}
}

// } Driver Code Ends


class Solution {
    
    public String reverse(String S) {
        // Create a stack
        Stack<Character> st = new Stack<>();
        
        // Push all characters of the string into the stack
        for (int i = 0; i < S.length(); i++) {
            st.push(S.charAt(i));
        }
        
        // Use StringBuilder for efficient string manipulation
        StringBuilder rev = new StringBuilder();
        
        // Pop all characters from the stack and append to StringBuilder
        while (!st.isEmpty()) {
            rev.append(st.pop());
        }
        
        // Convert StringBuilder to string and return
        return rev.toString();
    }
}
```