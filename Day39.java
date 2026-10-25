/* 
//Task 1 – Insert at Beginning:-INSERT 10.
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day39{
    public static void main(String[] args) {
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);

        first.next=second;
        second.next=third;

        //Insert 10 at beginning:-
        Node beginning = new Node(10);
        beginning.next=first;
        first=beginning;

        Node temp=first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
    


//Task 2 – Insert at End:-INSERT 40.
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day39{
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next=second;
        second.next=third;

        //Insert 40 at End:-
        Node end = new Node(40);
        
        Node temp = first; 
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=end; 
        
        temp=first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
    


//Task 3 – Insert After a Given Value:-
//Insert 30 after 20 in Linked List:10,20,40,50 .
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day39{
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(40);
        Node fourth = new Node(50);

        first.next=second;
        second.next=third;
        third.next=fourth;
        
        //New value created.
        Node value = new Node(30);

        //Traverse upto previous value.
        Node temp = first; 
        while(temp!=null){
            if(temp==second){
                break;
            }
            temp=temp.next;
        }

        //Insert 30 after 20.
        value.next=temp.next;
        temp.next=value;

        //print the linkedList.
        temp=first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
    


//Task 4 – Delete First Node:-
//Problem-Delete the first node from:10 → 20 → 30 → 40 .
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day39{
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next=second;
        second.next=third;
        third.next=fourth;
        
        //Delete First Node. 
        first=first.next;

        Node temp = first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
    


//Task 5 – Delete Last Node
//Problem-Delete the last node:10 → 20 → 30 → 40 .
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day39{
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
         first.next=second;
         second.next=third;
         third.next=fourth;
        
        //Traverse upto last previous node.
        Node temp = first;
        while(temp!=null){
            if(temp.data==30){
                break;
            }
            temp=temp.next;
        }

        //to Delete last node-change last previous node as null.
        temp.next=null;

        //Print linked list after deleting.
        temp=first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}



//Task 6 – Delete a Node by Value:-
//Problem-Delete 30 from:10 → 20 → 30 → 40 → 50 .
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day39{
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
        
        //Traverse till previous of Node by value to delete. 
        Node temp = first;
        while(temp!=null){
            if(temp.data==20){
                break;
            }
            temp=temp.next;
        }

        //Delete the value 30 and connect to the next value.
        temp.next=temp.next.next;

        //Print the List.
        temp=first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
    


//Task 7 – Count Nodes After Insertion
//Problem-Insert 50 at the end:-Print-Linked List,Total Nodes after Insertion.
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day39{
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next=second;
        second.next=third;
        third.next=fourth;

        int NodeCount=0;
        
        //Create new node to insert.
        Node end = new Node(50);

        //Traverse upto last node and then insert at last.
        Node temp = first;
        while(temp.next!=null){
            temp=temp.next;
        }

        //Insert at last node as 50.
        end.next=temp.next;
        temp.next=end;

        //Print the linked list.
        temp=first;
        while(temp!=null){
            NodeCount++;
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        System.out.println("Total Nodes:"+NodeCount);
    }
}
    



//Task 8 – Search After Deletion
//Problem
//Delete 20.
//Search for 20.
//Output:Element Not Found.
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day39{
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next=second;
        second.next=third;
        third.next=fourth;

        Node temp = first;
        while(temp!=null){
            if(temp.data==10){
                break;
            }
            temp=temp.next;
        }
        
        temp.next=second.next;
        
        boolean found = false;
        temp = first;
        while(temp!=null){
            if(temp.data==20){
                System.out.println("Element found");
                found=true;
                break;
            }else{
                 temp=temp.next;
            }
        }
        if(!found){
            System.out.println("Element not found!");
        }
    }
}
    


//Task 9 – Find Middle Node
//Problem-Find the middle node of:10 → 20 → 30 → 40 → 50.
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day39{
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

        Node slow = first;
        Node fast = first;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("Middle Node : "+slow.data);
    }
}



//Task 10 – Reverse Traversal Using Stack
//Problem-Print:40 30 20 10
//without changing the links-Use Java's Stack<Integer>.
import java.util.Stack;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day39{
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next=second;
        second.next=third;
        third.next=fourth;
        
        //Empty stack is created.
        Stack<Integer> stack = new Stack<>();

        //Traverse the node and push the element inside the stack.
        Node temp=first;
        while(temp!=null){
            stack.push(temp.data);
            temp=temp.next;
        }
        System.out.println("Reversed Node:");
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }

    }
}
    */


//🏆 Challenge Program-Student Linked List:-
//Each node stores : int rollNo ; String name;
//Create:
//101 Ravi
//102 Kumar
//103 Priya
//104 Anu
//Then:- Traverse the list , Count students , Search by roll number.
//Print the student details if found.
import java.util.*;
class Node{
    int roll;
    String name;
    Node next;

    Node(int roll,String name){
        this.roll=roll;
        this.name=name;
        this.next=null;
    }
}
public class Day39{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node first = new Node(101, "Sijon");
        Node second = new Node(102,"Rakesh" );
        Node third = new Node(103, "Nithees");
        Node fourth = new Node(104, "Vishnu");
        Node fifth = new Node(105, "Vicky");
        Node sixth = new Node(106, "Mohan");

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        
        System.out.println("Student List:");
        int count=0;

        Node temp=first;
        while(temp!=null){
            count++;
            System.out.println(temp.roll+" "+temp.name+" ");
            temp=temp.next;
        }
        System.out.println("Number of Students : "+count);
        System.out.println("Enter Roll Number To Show Student Details:");
        int roll = sc.nextInt();

        boolean found = false;
        
        temp=first;
        while(temp!=null){
            if(temp.roll==roll){
                System.out.println("Student Detail:- \n"+"Roll Number:"+temp.roll+" , "+"Student Name:"+temp.name);
                found=true;
                break;
            }
            temp=temp.next;
        }
        if(!found){
            System.out.println("No Details Found!");
        }
        sc.close();
    }
}