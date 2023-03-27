import java.util.Stack;

public class H_StockSpainProblem {
    /*
     * the question says that the span of stock price is equal to the no of days
     * when stock price
     * is the higest that means from how many days the price of the stock was lower
     * then the current day pricr
     * 
     * lets say the first day span is always 1(0th day spain)
     * then if the price is higher then the day then the 0 th day of first day spain
     * eill be 2
     * if lower then the span will be 1
     * so we can easily conclude that to count the day span we have a formula that
     * is
     * i(current day)-previousHighest
     * 
     * Approach-
     * we will create the stacj that will store the index of the days
     * lets say our stockprices=[100,80,60,70,85,100]
     * so we will first store 0 in our stack
     * then come to next we will store index 1 also
     * then 2 also
     * now cmming to the 70 part we will first check if the previous elements stored
     * in
     * stack are grater or lower then if lower (as 60 is lower than 70)
     * so we will remove 60 and then add so on
     * so this is how we will create stack with the help of stack we can tell the
     * span
     * so lets say there will 2 case
     * if the x th day price is highest among all
     * so the stack will become empty
     * so our span will be= x+1
     * if the x th day price is not the higest
     * so stack will contain previous index also lets say y
     * so our span will be =x-y
     * x= current day y= previous high
     * 
     */

    // Function to calculate the span of stock price for all n days.
    public static int[] calculateSpan(int price[], int n) {
        // creating a stack to store higher inddex
        Stack<Integer> s = new Stack<>();
        // pushing first index in stack
        s.push(0);
        // creating an array which store span of a particular day
        int[] arr = new int[n];
        arr[0] = 1;// first day(0 th day) span will always be 1

        for (int i = 1; i < n; i++) {
            // takeing current day price from the loop
            int currPrice = price[i];
            // checking for the previous stack elemnts whether they are higher or lower then
            // current day
            while (!s.isEmpty() && price[s.peek()] <= currPrice) {
                // if lower then removed from stack
                s.pop();
            }
            // 2 casesa came to calcluate span
            if (s.isEmpty()) {
                arr[i] = i + 1;// currentday value is the highest
            } else {
                arr[i] = i - s.peek(); // ww have s ome more higher value of stock
            }
            // pushing current day index in stack
            s.push(i);

        }
        // after calculating for all the stock span stored in aa array we return it
        return arr;

    }

    // main
    public static void main(String[] args) {
        int arr1[] = { 100, 80, 60, 70, 60, 75, 85 };
        // storeing the returned array from function
        int[] arr2 = calculateSpan(arr1, 7);
        // printing array
        for (int i : arr2) {
            System.out.println(i);
        }
    }

}
