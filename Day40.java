/* 
//Practice Program 1 - Reverse a Linked List:-
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day40{
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next=second;
        second.next=third;
        third.next=fourth;

        Node prev=null;
        Node current=first;
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
    



//Practice Program 2 - Detect whether a loop exists 
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day40{
    public static void main(String[] args) {
        Node first=new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
         first.next=second;
         second.next=third;
         third.next=fourth;
         fourth.next=second;

        Node slow=first;
        Node fast=first;
        boolean found=false;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Loop Detected");
        }else{
            System.out.println("Loop not Detected!");
        }
    }
}
    


//Practice Program 3-Find the 2nd node from the end:-
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day40{
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
        
        System.out.println("Linked List:-");
        Node temp=first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

        Node one = first;
        Node two = first;

        for(int i=0;i<2;i++){
              if(one == null){
              System.out.println("List is too short");
              return;
            }
            one=one.next;
        }
        
        while(one!=null){
            one=one.next;
            two=two.next;
        }
        System.out.println("2nd node from the end:"+two.data);
    }
}
    


//Practice Program 4-Remove duplicate values from a sorted Linked List:-
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day40{
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(20);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(50);
        Node seventh = new Node(70);
        

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=seventh;
        
        System.out.println("Linked List:");
        Node temp = first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        
        System.out.println();
        System.out.println("Duplicates values removed:");
        
        temp=first;
        while(temp != null && temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }else{
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
           
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}

    

//Practice Program 5-Check whether a Linked List is a palindrome (using a stack):-
import java.util.Stack;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day40{
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(20);
        Node fourth = new Node(10);

        first.next=second;
        second.next=third;
        third.next=fourth;

        Stack<Integer> stack = new Stack<>();
        boolean palindrome=true;

        Node temp=first;
        while(temp!=null){
            stack.push(temp.data);
            temp=temp.next;
        }

        temp=first;
        while(temp!=null){
            if(temp.data!=stack.pop()){
                palindrome=false;
                break;
            }
            temp=temp.next;
        }

        if(palindrome){
            System.out.println("List is palindrome");
        }else{
            System.out.println("List is not palindrome!");
        }
    }
}
    

//Task 1 – Reverse a Linked List.
//Problem-Reverse the following Linked List:-
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day40{
    public static void main(String[] args) {
        Node first=new Node(10);
        Node second=new Node(20);
        Node third=new Node(30);
        Node fourth=new Node(40);
        Node fifth=new Node(50);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        Node prev=null;
        Node current=first;
        Node next;
        while(current!=null){
            next = current.next;
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
    


//Task 2 – Find the 3rd Node from the End
//Problem-Given:-10 → 20 → 30 → 40 → 50 → 60
//Find the 3rd node from the end:-
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day40{
    public static void main(String[] args) {
        Node first=new Node(10);
        Node second=new Node(20);
        Node third=new Node(30);
        Node fourth=new Node(40);
        Node fifth=new Node(50);
        Node sixth=new Node(60);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;

        Node one=first;
        Node two=first;

        for(int i=0;i<3;i++){
            if(one==null){
                System.out.println("List has less Element!");
            }else{
                one=one.next;
            }
        }

        while(one!=null){
            one=one.next;
            two=two.next;
        }
        System.out.println(two.data);
    }
}
    


//Task 3 – Remove Duplicate Values
//Problem-Given the sorted Linked List:-10 → 20 → 20 → 30 → 40 → 40 → 50
//Remove duplicate nodes by modifying the links:-
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day40{
    public static void main(String[] args) {
        Node first=new Node(10);
        Node second=new Node(20);
        Node third=new Node(20);
        Node fourth=new Node(30);
        Node fifth=new Node(40);
        Node sixth=new Node(40);
        Node seventh=new Node(50);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=seventh;
        
        System.out.println("Linked List:-");
        Node temp=first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        System.out.println("Removed Duplicate Nodes:-");
        temp=first;
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
    


//Task 4 – Check Whether a Linked List is a Palindrome
//Problem-1 → 2 → 3 → 2 → 1  :-
import java.util.Stack;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day40{
    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(2);
        Node fifth = new Node(1);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        Stack<Integer> stack = new Stack<>();
        boolean palindrome=true;

        Node temp=first;
        while(temp!=null){
            stack.push(temp.data);
            temp=temp.next;
        }

        temp=first;
        while(temp!=null){
            if(temp.data==stack.pop()){
                temp=temp.next;
            }else{
                palindrome=false;
                temp=temp.next;
            }
        }
        if(palindrome){
            System.out.println("List is palindrome");
        }else{
            System.out.println("List is not a palindrome!");
        }
    }
}
    


//Task 5 – Find the Length of the Linked List
//Problem-10 → 20 → 30 → 40 → 50 :-
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day40{
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
        
        int length=0;
        
        System.out.println("Linked List:-");
        Node temp=first;
        while(temp!=null){
            length++;
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        System.out.println("Length of the list is "+length);
    }
}
    


//Task 6 – Find the Middle Node
//Problem-10 → 20 → 30 → 40 → 50 :-
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day40{
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(60);
        Node seventh = new Node(70);


        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=seventh;

        Node low=first;
        Node high=first;

        while(high!=null && high.next!=null){
            low=low.next;
            high=high.next.next;
        }
        System.out.println("Middle Node is "+low.data);
    }
}


//Task 7 – Count Even and Odd Nodes.
//Problem-11 → 20 → 35 → 40 → 55 → 60 :-
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day40{
    public static void main(String[] args) {
        Node first = new Node(11);
        Node second = new Node(20);
        Node third = new Node(35);
        Node fourth = new Node(40);
        Node fifth = new Node(55);
        Node sixth = new Node(60);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;

        int odd=0;
        int even=0;

        Node temp=first;
        while(temp!=null){
            if(temp.data%2==0){
                even++;
            }else{
                odd++;
            }
            temp=temp.next;
        }
        System.out.println("Count of Odd Nodes is "+odd);
        System.out.println("Count of Even Nodes is "+even);
    }
}
    


//Task 8 – Search an Element.
//Problem-Search for:- 40.
//In:- 10 → 20 → 30 → 40 → 50 .
import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day40{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        
        System.out.println("Linked List:-");
        Node temp=first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        
        System.out.println("\nEnter an Element to Search:");
        int search = sc.nextInt();
        boolean found=false;

        temp=first;
        while(temp!=null){
            if(temp.data==search){
                found=true;
                System.out.println("Element Found");
                break;
            }else{
                temp=temp.next;
            }
        }
        if(!found){
            System.out.println("Element Not Found!");
        }
        sc.close();
    }
}



//Task 9 – Find Maximum and Minimum Node.
//Problem:-45 → 12 → 89 → 34 → 67.
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day40{
    public static void main(String[] args) {
        Node first = new Node(45);
        Node second = new Node(12);
        Node third = new Node(89);
        Node fourth = new Node(34);
        Node fifth = new Node(67);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        Node min = first;
        Node max = first;
        Node temp=second;
        while(temp!=null){
            if(min.data>temp.data){
                min=temp;
            }else{
                temp=temp.next;
            }
        }
        temp=second;
        while(temp!=null){
            if(max.data<temp.data){
                max=temp;
            }else{
                temp=temp.next;
            }
        }
        System.out.println("Minimum Value Node is "+min.data);
        System.out.println("Maximum Value Node is "+max.data);
    }
}
    


//Task 10 – Sum and Average of Nodes.
//Problem-10 → 20 → 30 → 40 → 50 .
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day40{
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
        
        int count=0;
        int sum=0;
        Node temp=first;
        while(temp!=null){
            count++;
            sum=sum+temp.data;
            temp=temp.next;
        }
        System.out.println("Total Sum of Nodes is "+sum);
        System.out.println("Average of the Node is "+(sum/count));
    }
}
    */




//🏆Challenge Program – Student Result Management:-

//Create a Linked List where each node contains:

//int rollNo;
//String name;
//int marks;

//Store the following students:

// Roll No	Name	Marks
// 101	    Ravi	78
// 102	    Kumar	65
// 103	    Priya	91
// 104	    Anu	    55
// 105	    Meena	84

//Perform the following operations:-

//Display all students.
//Count total students.
//Search by roll number.
//Find the highest mark.
//Find the lowest mark.
//Calculate the average mark.
//Display only students with marks greater than or equal to 75.
import java.util.*;
class Node{
    int rollNo;
    String name;
    int marks;
    Node next;

    Node(int rollNo,String name,int marks){
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
        this.next=null;
    }
}
public class Day40{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node first = new Node(101, "Ravi", 78);
        Node second = new Node(102, "Kumar", 65);
        Node third = new Node(103,"Priya", 91);
        Node fourth = new Node(104, "Anu",55);
        Node fifth = new Node(105, "Meena", 84);
        
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        int count=0;
        Node highest=first;
        Node lowest=first;
        int sum=0;
        int mark=75;
        
        //Display all students:-
        System.out.println("All Students Detail:-");
        Node temp=first;
        while(temp!=null){
            count++;
            sum=sum+temp.marks;
            System.out.println(temp.rollNo+" "+temp.name+" "+temp.marks);
            temp=temp.next;
        }

        //Count total students:-
        System.out.println("\nTotal Students = "+count);

        //Search by roll number:-
        System.out.println("\nEnter RollNo to Search the Student Detail:");
        int search=sc.nextInt();
        boolean found=false;
        temp=first;
        while(temp!=null){
            if(search==temp.rollNo){
                found=true;
                System.out.println("Student Detail:-"+" Name:"+temp.name+","+"Mark:"+temp.marks);
                break;
            }else{
                temp=temp.next;
            }
        }
        if(!found){
            System.out.println("No Student Found!");
        }

        //Find the highest mark:-
        temp=second;
        while(temp!=null){
            if(highest.marks<temp.marks){
                highest=temp;
            }else{
                temp=temp.next;
            }
        }
        System.out.println("\nHighest Mark = "+highest.marks+" mark scored by the student "+highest.name);

        //Find the lowest mark:-
        temp=second;
        while(temp!=null){
            if(lowest.marks>temp.marks){
                lowest=temp;
            }else{
                temp=temp.next;
            }
        }
        System.out.println("\nLowest Mark = "+lowest.marks+" mark scored by the student "+lowest.name);

        //Calculate the average mark:-
        System.out.println("\nAverage Mark = "+(sum/count));

        //Display only students with marks greater than or equal to 75:-
        System.out.println("\nMarks Scored by the Students Above 75 are Listed below:-");
        temp=first;
        while(temp!=null){
            if(temp.marks>=mark){
                System.out.println("Name: "+temp.name+","+"Mark: "+temp.marks);
                temp=temp.next;
            }else{
                temp=temp.next;
            }
        }

        sc.close();
    }
}

    