/* 
//Task1:-
public class Day15{
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}
  


//Task2:-
public class Day15{
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        int search = 50;
        boolean found = false;
        for(int i=0;i<a.length;i++){
            if(a[i]==search){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }
    }
}
    



//Task3:-
public class Day15{
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        int search = 40;
        for(int i=0;i<a.length;i++){
            if(a[i] == search){
                System.out.println("Element found at index "+i);
            }
        }
    }
}
  

//Task4:-
import java.util.*;
public class Day15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a= new int[5];
        System.out.println("Enter 5 numbers:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Reverse order:");
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
        
        sc.close();
    }
}





//Task5:-
import java.util.*;
public class Day15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a= new int[5];
        System.out.println("Enter 5 numbers:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter a element to search:");
        int search = sc.nextInt();
        boolean found = false;
        for(int i=0;i<a.length;i++){
            if(a[i]==search){
                found=true;
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




//Task6:-
import java.util.*;
public class Day15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("Enter 5 numbers:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search position:");
        int search = sc.nextInt();
        boolean found = false;
        int position = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]==search){
                position=i;
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Element found at index "+position);
        }else{
            System.out.println("Element not found");
        }
        sc.close();
    }
}



