## Question

### Code
```java
//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class RemoveDup {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str[] = br.readLine().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            Solution obj = new Solution();
            int len = obj.removeDuplicates(arr);
            for (int i = 0; i < len; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
        // Step 1: Sort the array (if not already sorted)
        Arrays.sort(arr); // Time complexity: O(n log n)
        
        // Step 2: Use two-pointer technique to remove duplicates
        int n = arr.length;
        if (n == 0) return 0; // Handle edge case: empty array

        int j = 0; // Pointer for the position of the unique element
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j]) { // Found a new unique element
                j++;
                arr[j] = arr[i]; // Place it in the next position
            }
        }

        return j + 1; // Length of the array with unique elements
    }
}
```