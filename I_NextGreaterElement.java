public class I_NextGreaterElement {
    
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
       Stack<Long> s=new Stack<>();
       long[] res=new long[n];
       s.push(arr[n-1]);
       res[n-1]=-1;
       for(int i=n-2;i>=0;i--)
       {
           while(!s.isEmpty()&& s.peek()<=arr[i])
           {
               s.pop();
           }
           if(s.isEmpty())
           {
               res[i]=-1;
           }
           else
           {
               res[i]=s.peek();
           }
           s.push(arr[i]);
       }
       return res;
    }

}
