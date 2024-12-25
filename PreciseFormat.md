## Question

### Code
```java
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class PreciseFormat{
    public static void main(String[] args) {

        // taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // taking test cases
        int testcases = sc.nextInt();

        while (testcases-- > 0) {

            // taking 2 variables a,b
            float a = sc.nextFloat();
            float b = sc.nextFloat();

            // creating an object of class Solution
            Solution g = new Solution();

            // calling divisionWithPrecision() method
            ArrayList<Float> res = g.divisionWithPrecision(a, b);

            // Printing the result
            System.out.println(res.get(0) + " " + res.get(1));
            System.out.println("~");
        }

        sc.close(); // close scanner to avoid resource leak
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to return an ArrayList with exact result and formatted result
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
    ArrayList<Float> results = new ArrayList<>();
       float exactresult =a/b;
         results.add(exactresult);
         String formattedresultstr = String.format("%.3f",exactresult);
         float formattedresult = Float.parseFloat(formattedresultstr);
         results.add(formattedresult);
       return results;      
      }
}
```