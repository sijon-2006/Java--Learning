/* 
//Task1:-
import java.util.*;
public class Day16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 elements:");
        int[] a=new int[3];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("Total sum:"+sum);
        sc.close();
    }
}
    
    


//Task2:-
import java.util.*;
public class Day16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int[] a=new int[3];
        for(int i = 0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int largest=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
        System.out.println("Largest Element:"+largest);
        sc.close();
    }
}



//Task3:-
import java.util.*;
public class Day16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int[] a=new int[3];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int smallest=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<smallest){
                smallest=a[i];
            }
        }
        System.out.println("Smallest Element:"+smallest);
        sc.close();
    }
}
*/




//Task4:-
import java.util.*;
public class Day16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers to reverse:");
        int[] a=new int[3];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Reverse:");
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
        sc.close();
    }
}


/* 

//Task5:-
import java.util.*;
public class Day16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers to store in array");
        int[] a=new int[3];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter a number to search:");
        int search = sc.nextInt();
        boolean found = false;
        for(int i=0;i<a.length;i++){
            if(a[i] == search){
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




