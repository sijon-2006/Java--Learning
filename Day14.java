/* 
//Task1:-
public class Day14{
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("Total Sum:"+sum);
    }
}





//Task2:-
public class Day14{
    public static void main(String[] args) {
        int[] a={10,334,45,3,45};
        int largest=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>=largest){
                largest=a[i];
            }
        }
        System.out.println("Largest Element:"+largest);
    }
}



//Task3:-
public class Day14{
    public static void main(String[] args) {
        int[] a={10,34,567,8,676};
        int smallest=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<smallest){
                smallest=a[i];
            }
        }
        System.out.println("Smallest Element:"+smallest);
    }
}



//✍️ TASK 4:-
//Take 5 numbers from the user.
//Find their sum.
import java.util.*;
public class Day14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter 5 numbers:");
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






//✍️ TASK 2:-
//Take 5 numbers from the user.
//Find the largest element.
import java.util.*;
public class Day14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("Enter 5 numbers:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int largest=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>=largest){
                largest=a[i];
            }
        }
        System.out.println("Largest Element:"+largest);
        sc.close();
    }
}
*/





//✍️ TASK 3:-
//Take 5 numbers from the user.
//Find the smallest element.
import java.util.*;
public class Day14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("Enter 5 numbers:");
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