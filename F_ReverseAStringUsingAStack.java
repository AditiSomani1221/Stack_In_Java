import java.util.Stack;

public class F_ReverseAStringUsingAStack {
    /*
     * refer to this question at gfg also
     * https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1
     * time complexity=O(n)
     * reversing a string is very simple as stack follow lifo
     * so lasr element will come out first
     * so store the string to be reversed in a stack
     * and pop out each element and store in a new string
     * you will get the new string as a reversed string
     */
    // creating a function to reverse a string
    public static String reverse(String str) {
        // creating a stack of char to stroe each char of the string
        Stack<Character> s = new Stack<>();
        // storing values in stack
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        // creating a new stringbuilder
        StringBuilder newstr = new StringBuilder();
        // running a loop tp pop out the values of stack and storeing in StringBuilder
        while (!s.isEmpty()) {
            // poping and storing
            newstr.append(s.pop());
        }
        // returing the value by convering the StringBuilder into string
        return newstr.toString();
    }

    // main function
    public static void main(String[] args) {
        String str = "Aditi";
        String newStr = reverse(str);
        System.out.println(newStr);
    }
}
