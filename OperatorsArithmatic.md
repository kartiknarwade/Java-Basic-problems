## Question

### Code
```java
//{ Driver Code Starts

import java.util.*;
import java.lang.*;
import java.io.*;
class OperatorsArithmatic
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String [] S1 = br.readLine().trim().split(" ");
            int A = Integer.parseInt(S1[0]);
            int B = Integer.parseInt(S1[1]);
            int C = Integer.parseInt(S1[2]);
            Solution ob = new Solution();
            double[] ans = ob.FindRoots(A, B, C);
            if(ans.length == 1){
                System.out.println((int)ans[0]);
                continue;
            }
            for(int i = 0; i < ans.length; i++)
                System.out.print(String.format("%6f", ans[i]) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends



class Solution
{
    public double[]  FindRoots(int A, int B, int C)
    {
        // code here
                double a=((B*B) - 4*A*C);
        double x=Math.sqrt(a);
        double y=((-1*B)+x)/(2*A);
        double z=((-1*B)-x)/(2*A);
        if(a<0){
            return new double[]{-1};
        }
        double[] roots = new double[2];
        if(y>z){
            roots[0]=z;
            roots[1]=y;
        }
        else{
            roots[1]=z;
            roots[0]=y;
        }
        return roots;
    }
}
```