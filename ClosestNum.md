## Question

### Code
```java
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class ClosestNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.findClosest(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    public static int findClosest(int[] arr, int k) {
        int min = Integer.MAX_VALUE;
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int temp = Math.abs(arr[i] - k);
            if(temp<=min){
                min=temp;
                result=arr[i];
            }
        }
        
        return result;
        }


}
```
