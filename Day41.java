/* 
//Task 1 – Create and Display a Linked List
//Problem-Create the following linked list manually:-5 → 10 → 15 → 20 → 25 → null .
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day41{
    public static void main(String[] args) {
        Node first = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);
        Node fourth = new Node(20);
        Node fifth = new Node(25);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        Node temp=first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
    


//Task 2 – Count Total Nodes
//Problem-Count the total number of nodes:-
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day41{
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next=second;
        second.next=third;
        third.next=fourth;

        int count=0;

        Node temp=first;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("Total Count of the Node is "+count);
    }
}


//Task 3 – Search an Element
//Problem-Search for:- 15 .
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day41{
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next=second;
        second.next=third;
        third.next=fourth;

        int search = 15;
        boolean found =false;

        Node temp=first;
        while(temp!=null){
            if(temp.data == search){
                found =true;
                System.out.println("Element Found");
                break;
            }
            temp=temp.next;
        }
        if(!found){
            System.out.println("Element Not Found!");
        }
    }
}
    


//Task 4 – Insert at Beginning
//Problem-Insert:- 1
//Before:- 5 → 10 → 15 → 20 → 25 
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day41{
    public static void main(String[] args) {
        Node first = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);
        Node fourth = new Node(20);
        Node fifth = new Node(25);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        //Creating a new Node:-
        Node insert = new Node(1);
        insert.next=first;
        first=insert;

        Node temp=first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}


//Task 5 – Insert at End
//Problem:- Insert- 30
//Expected:- 5 → 10 → 15 → 20 → 25 → 30 
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day41{
    public static void main(String[] args) {
        Node first = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);
        Node fourth = new Node(20);
        Node fifth = new Node(25);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        //Creating a new Node:-
        Node insertEnd = new Node(30);

        Node temp=first;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=insertEnd;
        
        temp=first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}


//Task 6 – Delete First Node
//Problem:- Delete: 5
//Expected:- 10 → 15 → 20 → 25
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day41{
    public static void main(String[] args) {
        Node first = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);
        Node fourth = new Node(20);
        Node fifth = new Node(25);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        //Delete first Node:-
        first=first.next;

        Node temp=first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
    

//Task 7 – Delete Last Node
//Problem:- Delete: 25
//Expected:- 5 → 10 → 15 → 20
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day41{
    public static void main(String[] args) {
        Node first = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);
        Node fourth = new Node(20);
        Node fifth = new Node(25);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        //Delete Last node:-
        Node temp=first;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        
        temp=first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
    


//Task 8 – Reverse the Linked List
//Problem:- Reverse: 5 → 10 → 15 → 20 → 25
//Expected:- 25 → 20 → 15 → 10 → 5
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day41{
    public static void main(String[] args) {
        Node first = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);
        Node fourth = new Node(20);
        Node fifth = new Node(25);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        //Reverese the Node:-
        Node prev = null;
        Node current = first;
        Node next;

        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        Node temp=prev;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
    


//Task 9 – Find Middle Node
//Problem:- Find the middle node of:- 5 → 10 → 15 → 20 → 25
//Expected: 15
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day41{
    public static void main(String[] args) {
        Node first = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);
        Node fourth = new Node(20);
        Node fifth = new Node(25);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        //Middle Node:-
        Node slow = first;
        Node fast = first;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
}


//Task 10 – Find Maximum & Minimum
//Problem:- Linked List: 25 → 11 → 48 → 7 → 32
//Print:- Maximum = 48;Minimum = 7
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day41{
    public static void main(String[] args) {
        Node first = new Node(25);
        Node second = new Node(11);
        Node third = new Node(48);
        Node fourth = new Node(7);
        Node fifth = new Node(32);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        //Finding Maximum & Minimum:-
        Node min = first;
        Node max = first;

        Node temp=second;
        while(temp!=null){
            if(temp.data<min.data){
                min=temp;
            }
            temp=temp.next;
        }

        temp=second;
        while(temp!=null){
            if(temp.data>max.data){
                max=temp;
            }
            temp=temp.next;
        }
        System.out.println("Minimum Value:"+min.data);
        System.out.println("Maximum Value:"+max.data);
    }
}


//Task 11 – Sum and Average
//Problem:- Linked List: 10 → 20 → 30 → 40 → 50
//Expected:- Sum = 150;Average = 30
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day41{
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        int sum = 0;
        int count = 0;

        Node temp=first;
        while(temp!=null){
            count++;
            sum+=temp.data;
            temp=temp.next;
        }
        System.out.println("Sum : "+sum);
        System.out.println("Average : "+(sum/count));
    }
}



//Task 12 – Detect Loop
//Create:- 10 → 20 → 30 → 40
//Then:- 40.next = 20
//Use:- Floyd Cycle Detection Algorithm
//Output:- Loop Detected
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day41{
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        //Detect Loop:-
        fifth.next=second;
        
        Node slow=first;
        Node fast=first.next;
        boolean found = false;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                found=true;
                System.out.println("Loop Detected");
                break;
            }
        }
        if(!found){
            System.out.println("Loop Not Detected!");
        }
    }
}
    


//Task 13 – Remove Duplicates
//Input:- 10 → 20 → 20 → 30 → 40 → 40 → 50
//Expected:- 10 → 20 → 30 → 40 → 50
//Modify the links.
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day41{
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(20);
        Node fourth = new Node(30);
        Node fifth = new Node(40);
        Node sixth = new Node(40);
        Node seventh = new Node(50);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=seventh;

        Node temp=first;
        while(temp!=null && temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        temp=first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
    */


//Task 14 – Check Palindrome
//Input:- 1 → 2 → 3 → 2 → 1
//Expected:- Palindrome
//Use:- Stack<Integer>
import java.util.Scanner;
import java.util.Stack;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day41{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(2);
        Node fifth = new Node(1);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        //Palindrome or Not:-
        Stack<Integer> stack = new Stack<>();
        boolean found = true;

        Node temp = first;
        while(temp!=null){
            stack.push(temp.data);
            temp=temp.next;
        }

        temp=first;
        while(temp!=null){
            if(temp.data==stack.pop()){
                temp=temp.next;
            }else{
                found = false;
                break;
            }
        }
        if(found){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    sc.close();
    }
}