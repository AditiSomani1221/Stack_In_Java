import java.util.*;

public class G_ReverseAStack {
    /*
     * question on gfg
     * https://practice.geeksforgeeks.org/problems/reverse-a-stack/1
     * time complexity =O(n)
     * to reverse a stack we will first take the top most element of the stack
     * and put that topmost element at the bottom
     * reapeating this process for all the integer of stack
     */
    // pushing the element at the bottom -for more understang refer to file E
    public static void pushAtTop(Stack<Integer> s, int data) {
        // base case
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop(); // will take top most value
        // again function called
        pushAtTop(s, data);// implict stack of recursion for the top values by poping
        // again pushing the values as it is
        s.push(top);
    }

    // function to reverse
    static void reverse(Stack<Integer> s) {
        // base case
        // if the stack becomes empty return
        if (s.isEmpty()) {
            return;
        }
        // extracting the top most value that is to be putted at bottom
        int top = s.pop();
        reverse(s);// implict stack of recursion for the top values is created by poping
        // putting all the top values at the bottom by this function
        pushAtTop(s, top);

    }

    // main
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s);
        reverse(s);
        System.out.println(s);
    }
}
