
## Question

### Code
```java

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class KthFact{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String arr[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(arr[0]);
            int k = Integer.parseInt(arr[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.kthPrime(n, k));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int kthPrime(int n, int k){
        // code here
        List<Integer> l=new ArrayList<>();
        int i=2;
        int c=0;
        
        while(i<=n){
            if(n%i==0){
                c++;
                if(c==k){
                    return i;
                }
                n=n/i;
                
            }else{
                i++;
            }
           
        }
        return -1;
    }
}
```