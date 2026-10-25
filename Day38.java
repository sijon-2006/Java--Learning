/* 
//Task 1:-Create a single node and print its data:-
class Person{
    String name;
    Person next;

    Person(String name){
        this.name=name;
        this.next=null;
    }
}
public class Day38{
    public static void main(String[] args) {
        Person first = new Person("Sijon");
        System.out.println(first.name);
    }
}
    


//Task 2:-Create three linked nodes manually (10 → 20 → 30):-
class Person{
    String name;
    Person next;

    Person(String name){
        this.name=name;
        this.next=null;
    }
}
public class Day38{
    public static void main(String[] args) {
        Person first = new Person("Sijon");
        Person second = new Person("Joy");
        Person third = new Person("Mohan");
        System.out.println(first.name);
        System.out.println(second.name);
        System.out.println(third.name);
    }
}




//Task 3-Connect the nodes using the next reference:-
class Person{
    String name;
    Person next;

    Person(String name){
        this.name=name;
        this.next=null;
    }
}
public class Day38{
    public static void main(String[] args) {
        Person first = new Person("Sijon");
        Person second = new Person("Joy");
        Person third = new Person("Mohan");
        first.next=second;
        second.next=third;
        third.next=null;
        System.out.println(first.name);
        System.out.println(second.name);
        System.out.println(third.name);
    }
}
    


//Task 4-Traverse the linked list using a while loop:-
class Person{
    String name;
    Person next;

    Person(String name){
        this.name=name;
        this.next=null;
    }
}
public class Day38{
    public static void main(String[] args) {
        Person first = new Person("Sijon");
        Person second = new Person("Joy");
        Person third = new Person("Mohan");
        first.next=second;
        second.next=third;
        third.next=null;

        Person temp = first;
        while(temp!=null){
            System.out.print(temp.name+" ");
            temp=temp.next;
        }
       
    }
}
    


//Task 5-Create a Linked List
//Problem-Create the following linked list manually:10 → 20 → 30 → null
//Print all the elements using a while loop:-
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day38{
    public static void main(String[] args) {
        Node first =  new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next=second;
        second.next=third;

        Node temp = first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}



//Task 6 – Count Total Nodes
//Problem-Count the total number of nodes:-
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day38{
    public static void main(String[] args) {
        Node first =  new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next=second;
        second.next=third;
        third.next=fourth;

        int count=0;

        Node temp = first;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("Total Nodes:"+count);
    }
}
    


//Task 7 – Search an Element in linked list
//Problem-Search for the element 20:-
import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day38{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter a Element to Search:");
        int search=sc.nextInt();
        boolean found=false;
        Node first =  new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next=second;
        second.next=third;
        third.next=fourth;

        Node temp = first;
        while(temp!=null){
          if(search==temp.data){
            System.out.println("Element found");
            found=true;
            break;
          }else{
            temp=temp.next;
          }
        }
        if(!found){
            System.out.println("Element not Found!");
        }
        
        sc.close();
    }
}
    



//Task 8 – Find Largest Element
//Problem-Find the largest value in the Linked List:-
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day38{
    public static void main(String[] args) {
        
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next=second;
        second.next=third;
        third.next=fourth;

        Node temp=first;
        Node largest = first;

        while(temp!=null){
            if(largest.data<temp.data){
                largest=temp;
            }
            temp=temp.next;
        }
        System.out.println("Largest Element:"+largest.data);
    }
}
    


//Task 9 – Find Smallest Element
//Problem-Find the smallest value:-
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day38{
    public static void main(String[] args) {
        
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next=second;
        second.next=third;
        third.next=fourth;

        Node temp=first;
        Node smallest = first;

        while(temp!=null){
            if(smallest.data>temp.data){
                smallest=temp;
            }
            temp=temp.next;
        }
        System.out.println("Smallest Element:"+smallest.data);
    }
}
    


//Task 10 – Sum of All Nodes
//Problem-Find the sum of all node values:-
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day38{
    public static void main(String[] args) {
        Node first =  new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next=second;
        second.next=third;
        third.next=fourth;

        int sum=0;

        Node temp = first;
        while(temp!=null){
            sum=sum+temp.data;
            temp=temp.next;
        }
        System.out.println("Sum of All Nodes:"+sum);
    }
}
    


//Task 11 – Average of Nodes
//Problem-Find the average value:-
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day38{
    public static void main(String[] args) {
        Node first =  new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next=second;
        second.next=third;
        third.next=fourth;

        int sum=0;
        int count=0;

        Node temp = first;
        while(temp!=null){
            sum=sum+temp.data;
            count++;
            temp=temp.next;
        }
        System.out.println("Average :"+sum/count);
    }
}
    



//Task 12 – Insert at Beginning.
// Insert 10:-
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day38{
    public static void main(String[] args) {
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);
        
        first.next=second;
        second.next=third;

        Node insert = new Node(10);
            insert.next=first;
            first = insert;

        Node temp = first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        

    }
} 
    


//Task 13 – Insert at End.
//Insert 40:-
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day38{
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        
        first.next=second;
        second.next=third;

        Node insert = new Node(40);
            third.next=insert;
            third=insert;

        Node temp = first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
} 
    



//Task 14 – Display Even Numbers
//Problem-Print only even numbers:-
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day38{
    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        
        first.next=second;
        second.next=third;
        third.next=fourth;

        Node temp = first;
        while(temp!=null){
           if(temp.data%2==0){
            System.out.print(temp.data+" ");
           }
           temp=temp.next;
        }
    }
}
    */


//Challenge Program.
//Reverse Printing (Without Changing Links):-
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day38{
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next=second;
        second.next=third;
        third.next=fourth;

        int count=0;
        
        System.out.println("Linked List:");
        Node temp=first;
        while(temp!=null){
            count++;
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        int[] a = new int[count];
        temp=first;
        int i=0;
        while(temp!=null){
            a[i] = temp.data;
            temp=temp.next;
            i++;
        }
        System.out.println();
        System.out.println("Reversed List:");
        for(int j=a.length-1;j>=0;j--){
            System.out.print(a[j]+" ");
        }
    }
}
