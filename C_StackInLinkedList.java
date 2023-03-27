public class C_StackInLinkedList {

    //creating a node to create a linkedList
    //by creating a node class
    static class Node {

        //A node contains 2 things 
        int data;
        Node next;
       
        //creating a constructor of a node class 
          //this is needed when we need to create a new node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Creating a staack class 
    static class Stack {

        //Creating a head node
        static Node head = null;
       
        //checking is the liist is empty or not
        public static boolean isEmpty() {
            return head == null;
        }

        //performing all the four opreations
        
        //push
        public static void push(int data) {
            //creating a new node with a value
            Node newNode = new Node(data);
            
            if (isEmpty()) {
                head = newNode;
                return;
            }
            //connecting new node with  head as  new node contains the address of next
            newNode.next = head;
            //making newNode the head
            head = newNode; 
        }
       //pop
        public static int pop() {

            if (isEmpty()) {
                return -1;
            }
            //storeiing the value of head in the top variable
            int top = head.data;
            //making head the next element
            head = head.next;
            return top;
        }

       //peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            //retuening the top most element(head)
            return head.data;
        }
    }
        public static void main(String[] args) {
            Stack s = new Stack();
            s.push(1);
            s.push(2);
            s.push(3);
            while (!s.isEmpty()) {
                System.out.println(s.peek());
                s.pop();
            }
        }
    }

