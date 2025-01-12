## Question

### Code
```java
//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

public class AlternatePNnum {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            ArrayList<Integer> arr = new ArrayList<>();

            for (String s : inputArray) {
                arr.add(Integer.parseInt(s));
            }

            new Solution().rearrange(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
             int n = arr.size();
        
        // Create lists to store positive and negative numbers
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Separate positive and negative numbers
        for (int num : arr) {
            if (num >= 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        // Indexes for iterating through positive and negative lists
        int posIndex = 0, negIndex = 0;
        int i = 0;

        // Place positives and negatives alternately in arr
        while (posIndex < pos.size() && negIndex < neg.size()) {
            if (i % 2 == 0) {
                arr.set(i, pos.get(posIndex++));
            } else {
                arr.set(i, neg.get(negIndex++));
            }
            i++;
        }

        // Add remaining positive numbers, if any
        while (posIndex < pos.size()) {
            arr.set(i++, pos.get(posIndex++));
        }

        // Add remaining negative numbers, if any
        while (negIndex < neg.size()) {
            arr.set(i++, neg.get(negIndex++));
        }
    }
}
```