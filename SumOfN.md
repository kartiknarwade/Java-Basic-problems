## Question

### Code
```java
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class SumOfN
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.find(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int find(int n)
    {
        // code here
        if(n<=1){
            return n;
        }
        int sum=0;
        for(int i=1;i<n;i++){
            sum+=i;
            if(sum==n){
                return i;
            }
            
        }
        return -1;
    }
}
```