/* 
//Task 1-Write a Java program to declare an integer array with 5 elements and print all the elements:-

public class Day31{
    public static void main(String[] args) {

        int[] a={10,20,30,40,50};
        System.out.println("Elements are:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        
    }
}
    



//Task 2-Write a Java program to take 5 integer inputs from the user and print them using a loop:-
import java.util.*;
public class Day31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Elements:");
        int[] a = new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Stored Elements are:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        sc.close();
    }
}
    





//Task 3-Write a Java program to print the first and last element of an array:-
import java.util.*;
public class Day31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Elements:");
        int[] a = new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("First Element of the Array:"+a[0]);
        System.out.println("Last Element of the Array:"+a[a.length-1]);
        sc.close();
    }
}
    



//Task 4-Write a Java program to print the index and value of each element:-
import java.util.*;
public class Day31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Elements:");
        int[] a = new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The Index and Value of Each Elements are:");
        for(int i=0;i<a.length;i++){
            System.out.println("Index "+i+" = "+a[i]);
        }
       
        sc.close();
    }
}
    



//Task 5-Write a Java program to count the total number of elements in an array using the length property:-
public class Day31{
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        
        int count = a.length;
        System.out.println("Total numbers of Element in array:"+count);
    }
}
    



//Task 6-Write a Java program to find the sum of all elements in an array:-
import java.util.*;
public class Day31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        int[] a = new int[5];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int sum =0;
        for(int i=0;i<a.length;i++){
            sum = sum+a[i];
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}
    




//Task 7-Write a Java program to find the largest element in an array:-
import java.util.*;
public class Day31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        int[] a = new int[5];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int largest = a[0];
        for(int i=1;i<a.length;i++){
            if(largest<a[i]){
                largest = a[i];
            }
        }
        System.out.println("Largest Element:"+largest);
        sc.close();
    }
}
    




//Task 8-Write a Java program to find the smallest element in an array:-
import java.util.*;
public class Day31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        int[] a = new int[5];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int smallest = a[0];
        for(int i=1;i<a.length;i++){
            if(smallest>a[i]){
                smallest = a[i];
            }
        }
        System.out.println("Smallest Element:"+smallest);
        sc.close();
    }
}
    



//Task 9-Write a Java program to search for an element in an array using Linear Search:-
import java.util.*;
public class Day31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Elements:");
        int[] a = new int[5];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter a element to search:");
        int num = sc.nextInt();
        int search = num;
        boolean found = false;
        for(int i=0;i<a.length;i++){
            if(search == a[i]){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found!");
        }
        sc.close();
    }
}
*/




//Task 10-Write a Java program to reverse an array:-
import java.util.*;
public class Day31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers to reverse:");
        int[] a = new int[5];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("The Reversed Elements:");
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
        sc.close();
    }
}