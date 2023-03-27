import java.util.Stack;

public class E_PushAtTheBottomOfStack {
    /*
     * genrally we use to push at the top
     * this question describe the pushing at the bottom
     * this can be done by doing with recursion
     * lets say - it is easier to push when we have Low no of elements
     * so lets say we have 4 to push at the bottom of the stack and our stack is 1 2 3
     * so by adding 4 we need to make it 4 1 2 3
     * so it will be easy when there is only 1 in stack
     * we will remove the 1 and store it in a variable and then again add 4 so nwe
     * stack is 4 1
     * so this process can be done with the help of recursion lets see how for large
     * no value in stack
     */
    // created a rcursive function to push at bottom
    public static void pushAtBottom(Stack<Integer> s, int data) {
        // Base case - when stack becomes empty
        if (s.isEmpty()) {
            // add the element which need to be added at bottom
            s.push(data);
            return;
        }
        // storing the topmost values of stack in top
        int top = s.pop(); 
        // calling the function again
        pushAtBottom(s, data);// implict stack of recursion is crated by storeing values
        // after stroreing all the values in implict stack of recursion
        // at bottom we will put the value of data (by above base case) and then we will push all the values
        // which are stored in recursive stack
        // pushing values
        s.push(top);
    }

    // main method
    public static void main(String args[]) {
        // creating a stack
        Stack<Integer> s = new Stack<>();
        // storeing values in stack
        s.push(1);
        s.push(2);
        s.push(3);
        // calling recursive function
        pushAtBottom(s, 4);
        // printing the stack
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
