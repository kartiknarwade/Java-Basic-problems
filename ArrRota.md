## Question

### Code
```java
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class ArrRota {
    // Driver code
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }
            Solution ob = new Solution();
            int res = ob.findKRotation(arr);
            System.out.println(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends

class Solution {
    public int findKRotation(List<Integer> arr) {
        int count=1;
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i+1)){
                break;
            }
            else{
                count++;
            }
        }
        if(arr.size()==count) return 0;
        return count;
    }  
}
```