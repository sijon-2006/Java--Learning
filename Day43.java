/* 
//PROBLEM 1 — Reverse a String
//Reverse:- JAVA
//Expected:- AVAJ
import java.util.Stack;
public class Day43 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String ch = "JAVA";
        for(int i=0;i<ch.length();i++){
            stack.push(ch.charAt(i));
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
            
        }
    }
}
    



//PROBLEM 2 — Reverse a Number
//Suppose:- 12345
//Expected:- 54321
//One way is to convert the number into a String and use a Stack.
import java.util.Stack;
public class Day43{
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String num = "12345";
        for(int i=0;i<num.length();i++){
            stack.push(num.charAt(i));
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
    



//PROBLEM 3 — Check Balanced Parentheses
//This is a very important Stack problem for interviews.
import java.util.Stack;
public class Day43{
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "()()";

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='('){
                stack.push(ch);
            }else if(ch==')'){
                if(stack.isEmpty()){
                    System.out.println("Not Balanced!");
                    return;
                }else{
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced!");
        }
    }
}
    



//PROBLEM 4 — Remove Adjacent Duplicates
//Consider:- abbaca
//We want to remove adjacent duplicates.
//Expected:- ca
//Stack idea:-->Read characters one by one:-
//If current character is the same as the Stack top:- pop()
//Otherwise:- push()
import java.util.Stack;
public class Day43{
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "abbaca";

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!stack.isEmpty() && stack.peek()==ch){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        System.out.println(stack);
    }
}
    



//PROBLEM 5 — Check Palindrome Using Stack
//Example:- MADAM
//Reverse:- MADAM
//Same → palindrome.
import java.util.Stack;
public class Day43{
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "MADAM";

        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        boolean palindrome = true;
        for(int i=0;i<str.length();i++){
            if(stack.pop()!=str.charAt(i)){
                palindrome=false;
                break;  
            } 
        }
        if(palindrome){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not a Palindrome!");
        }
    }
}
    


//Task 1 — Reverse String
//Input:- HELLO
//Expected:- OLLEH
import java.util.Stack;
public class Day43{
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        String str = "HELLO";

        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
    


//Task 2 — Reverse String
//Input:- SIJON
//Expected:- NOJIS
import java.util.Stack;
public class Day43{
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        String str = "SIJON";

        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
    



//Task 3 — Palindrome
//Check:- LEVEL
//Expected:- Palindrome
import java.util.Stack;
public class Day43{
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "LEVEL";

        boolean palindrome = true;
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=stack.pop()){
                palindrome = false;
                break;
            }
        }
        if(palindrome){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome!");
        }
    }
}
    


//Task 4 — Palindrome
//Check:- JAVA
//Expected:- Not Palindrome
import java.util.Stack;
public class Day43{
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "JAVA";

        boolean palindrome = true;
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=stack.pop()){
                palindrome = false;
                break;
            }
        }
        if(palindrome){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome!");
        }
    }
}





//Task 5 ⭐ — Balanced Parentheses
//Check:- (()())
//Expected:- Balanced
import java.util.Stack;
public class Day43{
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        String str = "(()())";

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='('){
                stack.push(ch);
            }else if(ch==')'){
                if(stack.isEmpty()){
                    System.out.println("Not Balanced!");
                    return;
                }
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced!");
        }
    }
}
    */



//🏆 MORNING CHALLENGE
//Input:- {[()]}
//Determine whether the brackets are balanced.
//Expected:- Balanced
import java.util.Stack;
public class Day43{
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        String str = "{[()]}";

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='{' || ch =='[' || ch=='('){
                stack.push(ch);
            }else if(ch=='}' || ch==']' || ch==')'){
                if(stack.isEmpty()){
                    System.out.println("Not Balanced!");
                    return;
                }
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced!");
        }
    }
}