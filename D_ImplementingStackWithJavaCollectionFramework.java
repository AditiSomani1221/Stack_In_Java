import java.util.*;

public class D_ImplementingStackWithJavaCollectionFramework {
    public static void main(String[] args) {
        /*
         * there will be a single line change int his main function
         * instead of creating an object of stack class we used collection framework
         * and by this creating long long class is eleminated
         * easiest implementation
         */
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
