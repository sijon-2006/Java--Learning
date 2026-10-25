/* 
//Task 1 — Create and Display a Queue
//Create:- 10 20 30 40
//Expected:- Queue: [10, 20, 30, 40]
import java.util.*;
public class Day44{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Queue: "+queue);
    }
}
    


//Task 2 — Display Front Element
//Create:- 10 20 30 40
//Print only the front element.
//Expected:- Front: 10
import java.util.*;
public class Day44{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        
        System.out.println("Front: "+queue.peek());
    }
}
    


//Task 3 — Remove the Front Element
//Create:- 10 20 30 40
//Remove the first element.
//Expected:- After Poll: [20, 30, 40]
import java.util.*;
public class Day44{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        
        queue.poll();
        System.out.println("After Poll: "+queue);
    }
}
    


//Task 4 — Remove Multiple Elements
//Create:- 10 20 30 40 50
//Remove the first two elements.
//Expected:- [30, 40, 50]
import java.util.*;
public class Day44{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        
        queue.poll();
        queue.poll();
        System.out.println("After Poll Two Elements: "+queue);
    }
}
    


//Task 5 — Check Empty Queue
//Create an empty Queue.
//Check whether it is empty.
//Expected:- Queue is Empty
import java.util.*;
public class Day44{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        if(queue.isEmpty()){
            System.out.println("Queue is Empty");
        }else{
            System.out.println("Queue is Not Empty!");
        }
    }
}




//Task 6 — Find Queue Size
//Create:- 5 10 15 20 25 30
//Find the number of elements.
//Expected:- Queue Size: 6
import java.util.*;
public class Day44{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(10);
        queue.add(15);
        queue.add(20);
        queue.add(25);
        queue.add(30);

        System.out.println("Queue Size: "+queue.size());
    }
}
    


//Task 7 — Display Elements Using poll()
//Create:- 10 20 30 40 50
//Print each element using poll().
//Expected:- 10 20 30 40 50
import java.util.*;
public class Day44{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        
       while(!queue.isEmpty()){
        System.out.print(queue.poll()+" ");
       }
    }
}
    


//Task 8 — Search an Element
//Create:- 10 20 30 40 50
//Search for:- 40
//Expected:- Element Found
import java.util.*;
public class Day44{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        int search = 40;
        boolean found = false;
        while(!queue.isEmpty()){
            if(search==queue.peek()){
                System.out.println("Element Found");
                found=true;
                break;
            }else{
                queue.poll();
            }
        }
        if(!found){
            System.out.println("Element Not Found!");
        }
    }
}
    */

//Task 9 — Count Even Numbers
//Create:- 10 15 20 25 30 35
//Use poll() to examine every element.
//Expected:- Even Count: 3
import java.util.*;
public class Day44{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(15);
        queue.add(20);
        queue.add(25);
        queue.add(30);
        queue.add(35);

        int EvenCount = 0;
        while(!queue.isEmpty()){
            if(queue.peek()%2==0){
                EvenCount++;
                queue.poll();
            }else{
                queue.poll();
            }
        }
        System.out.println("Even Count: "+EvenCount);
    }
}