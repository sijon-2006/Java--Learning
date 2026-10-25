/* 
//Practice 1 — Create a Stack
//Create:- 10,20,30
//using push() and print the stack.
import java.util.Stack;
public class Day42{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

    }
}
    


//Practice 2 — Peek
//Create:- 10 20 30 40
//Print the top element using peek().
//Expected:- 40
import java.util.Stack;
public class Day42{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Top Element:"+stack.peek());
    }
}
    


//Practice 3 — Pop
//Create:- 10 20 30 40
//Remove the top element using pop().
//Expected stack:- [10, 20, 30]
import java.util.Stack;
public class Day42{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        //Removing the top element using pop().
        stack.pop();

        System.out.println(stack);
    }
}
    


//Practice 4 — Check Empty
//Create an empty stack and check:- stack.isEmpty()
//Expected:- true
import java.util.Stack;
public class Day42{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
       
        System.out.println(stack.isEmpty());
    }
}
    


//Practice 5 — Stack Size
//Create:- 10 20 30 40 50
//Find the size.
//Expected:- 5
import java.util.Stack;
public class Day42{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack Size:"+stack.size());
    }
}
    


//Task 1 — Create and Display a Stack
//Problem:- Create a Stack containing: 10 20 30 40
import java.util.Stack;
public class Day42{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack Elements:"+stack);
    }
}
    


//Task 2 — Display Top Element
//Problem:- Create: 10 20 30 40
import java.util.Stack;
public class Day42{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Top Element:"+stack.pop());
    }
}
    


//Task 3 — Pop Multiple Elements
//Problem:- Create: 10 20 30 40 50 Remove the top two elements.
//Expected:- [10, 20, 30]
import java.util.Stack;
public class Day42{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.pop();
        stack.pop();
        System.out.println("Stack Elements:"+stack);
    }
}
    


//Task 4 — Check Empty Before Pop
//This is an important habit.
//Never blindly call pop() if you're not sure whether the Stack contains an element.
import java.util.Stack;
public class Day42{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        if(stack.isEmpty()){
            System.out.println("Stack is Empty!");
        }else{
            System.out.println("Stack Elements can be removed");
            System.out.println("Stack Elements:"+stack);
            stack.pop();
            System.out.println("Stack Elements after pop() the Top Element:"+stack);
        }
    }
}
    


//Task 5 — Display Stack Using Pop
//This is a very important exercise because it helps you understand LIFO.
//Problem:- Create: 10 20 30 40 50
//Print the elements one by one using pop().
import java.util.Stack;
public class Day42{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Printed the elements one by one using pop():");

        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
    


//Task 6 — Search an Element
//Java's Stack provides:- search()
//Problem:- Search for 30.
//10 20 30 40 50
import java.util.Stack;
public class Day42{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        int search = 60;
        if(stack.search(search)!=-1){
            System.out.println("Element Found");
        }else{
            System.out.println("Not Found!");
        }
        
    }
}
    


//Task 7 — Find the Size
//Problem:- Create: 5 10 15 20 25 30
//Find the number of elements.
import java.util.Stack;
public class Day42{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(30);

        System.out.println("Stack Size:"+stack.size());
    }
}
    


//Task 8 — Reverse a String Using Stack
//Problem:-
//Reverse:JAVA
//Expected:- AVAJ
import java.util.Stack;
public class Day42{
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        
        String str = "JAVA";
        System.out.print("String:");
        for(int i=0;i<str.length();i++){
            System.out.print(stack.push(str.charAt(i)));
        }
        System.out.print("\nReversed String:");
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
    



//Task 9 — Count Even Numbers
//Create:- 10, 15, 20, 25, 30, 35 Store them in a Stack.
//Using pop():- check each element,count even numbers,print the count
//Expected:- Even Count: 3
import java.util.Stack;
public class Day42{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(30);
        stack.push(35);

        int count =0;

        while(!stack.isEmpty()){
            if(stack.pop()%2==0){
                count++;
            }
        }
        System.out.println("Even Count:"+count);
    }
}
    



//Task 10 — Find Largest Element 
//Create:- 10, 45, 20, 80, 35 Store them in a Stack.
//Use pop() to find the largest element.
//Expected:- Largest: 80
import java.util.Stack;
public class Day42{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(45);
        stack.push(20);
        stack.push(80);
        stack.push(35);

        int largest=stack.pop();

        while(!stack.isEmpty()){
            int value = stack.pop();
            if(largest<value){
                largest=value;
            }
        }
        System.out.println(largest);
    }
}
    */


//Afternoon Challenge:-
//Create Stack:- 10 20 30 40 50

//Then:-
//Print the Stack
//Print the top element
//Remove the top element
//Print the remaining Stack
//Print the size

//Expected:-
//Stack: [10, 20, 30, 40, 50]
//Top: 50
//After Pop: [10, 20, 30, 40]
//Size: 4
import java.util.Stack;;
public class Day42{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        //Print the Stack:-
        System.out.println("Stack:"+stack);

        //Print the top element:-
        System.out.println("Top Element:"+stack.pop());

        //Remove the top element:-
        System.out.println("After Pop:"+stack);

        //Print the size:-
        System.out.println("Size:"+stack.size());
    }
}