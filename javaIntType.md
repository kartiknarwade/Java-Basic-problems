## Question

### Code
```java
//{ Driver Code Starts
import java.io.*;
import java.util.*;

class javaIntType {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            Solution ob = new Solution();
            System.out.println(ob.javaIntType(sc));
            System.out.println(ob.javaStringType(sc));
            System.out.println(ob.javaFloatType(sc));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {

    int javaIntType(Scanner sc) {
        // code here
        int a = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        return a;
    }
    
    String javaStringType(Scanner sc) {
        // code here
        String b = sc.nextLine(); // Now this will work correctly
        return b;
    }
    
    float javaFloatType(Scanner sc) {
        // code here
        float c = sc.nextFloat();
        sc.nextLine(); // Consume the leftover newline
        return c;
    }
};

```