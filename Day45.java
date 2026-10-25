/* 
//PROGRAM 1 — Basic Stack Operations
//Problem:-Create a Stack and:
//Add:- 10, 20, 30, 40
//Display the Stack
//Display the top element
//Remove the top element
//Display the Stack again
//Expected output:- [10, 20, 30, 40] | 40 | [10, 20, 30]
import java.util.Stack;
public class Day45{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        //Display the Stack:-
        System.out.println("Stack: "+stack);

        //Display the top element:-
        System.out.println("Top Element: "+stack.peek());

        //Remove the top element:-
        stack.pop();

        //Display the Stack again:-
        System.out.println("After Pop: "+stack);
    }
}
    


//PROGRAM 2 — Check Stack Empty
//Problem:- Create a Stack and check whether it is empty.
import java.util.Stack;
public class Day45{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        if(stack.isEmpty()){
            System.out.println("Stack is Empty!");
        }else{
            System.out.println("Stack is not Empty");
        }
    }
}
    


//PROGRAM 3 — Reverse a String Using Stack
//Input:- JAVA
//Expected output:- AVAJ
import java.util.Stack;
public class Day45{
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "JAVA";

        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }

    }
}
    



//PROGRAM 4 — Basic Queue Operations
//Problem:-
//Add:- 10 20 30 40
//Then:
//Display Queue
//Display front element
//Remove front element
//Display Queue
import java.util.*;
public class Day45{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        //Display Queue:-
        System.out.println("Queue: "+queue);

        //Display front element:-
        System.out.println("Front Element: "+queue.peek()); 

        //Remove front element:-
        queue.poll();

        //Display Queue:-
        System.out.println("After Poll: "+queue);
    }
}
    


//PROGRAM 5 — Queue Until Empty
//Problem:-
//Create:- 10 20 30 40 50
//Remove and print every element until the Queue becomes empty.
import java.util.*;
public class Day45{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
    


//PROGRAM 6 — Find Largest Element Using Stack
//Problem:- Store: 10 50 20 80 30
//Find the largest element.
//Expected output:- Largest = 80
import java.util.Stack;
public class Day45{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(50);
        stack.push(20);
        stack.push(80);
        stack.push(30);

        int largest=stack.peek();
        while(!stack.isEmpty()){
            if(largest<stack.peek()){
                largest=stack.peek();
            }else{
                stack.pop();
            }
        }
        System.out.println("Largest Element: "+largest);
    }
}
    


//PROGRAM 7 — Count Queue Elements
//Problem:- Create a Queue
//Find the number of elements.
import java.util.*;
public class Day45{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        int count=0;
        while(!queue.isEmpty()){
            count++;
            queue.poll();
        }
        System.out.println("Number of Elements in Queue: "+count);
    }
}



//PROGRAM 8 — Stack + Queue Combined
//Problem:- Create
//Then:-
//Pop one element from Stack
//Poll one element from Queue
//Print both
//Print remaining Stack and Queue
import java.util.*;
public class Day45{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);

        //Poll one element from Queue
        //Pop one element from Stack
        //Print both:-
        System.out.println("Poll Element from the Queue is "+queue.poll());
        System.out.println("Pop Element from the Stack is "+stack.pop());

        //Print remaining Stack and Queue:-
        System.out.println("Remaining Queue: "+queue);
        System.out.println("Remaining Stack: "+stack);



    }
}
    */


//1 to 50 number 
//4th table and 5 th table number shoulkd be output
public class Day45{
    public static void main(String[] args) {
        for(int i=1;i<=50;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i);
            }
        }

    }
}