/* 

//Task1:-
public class Day13 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}







//✍️ TASK 2:-
//Take 5 numbers from the user and store them in an array.
//Print all numbers
import java.util.*;
public class Day13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");
        for(int i = 0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Values stored in an Array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        sc.close();
        }
}





//Task3:-
public class Day13{
    public static void main(String[] args) {
        int[] arr={5,30,45,56,78};
        System.out.println("First Element = "+arr[0]);
        System.out.println("Last Element = "+arr[arr.length-1]);

    }
}
    





//Task4:-
public class Day13{
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Total:"+sum);
    }
}






//Task5:-
public class Day13{
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int largest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("Largest Element:"+largest);
    }
}
*/





//Task6:-
public class Day13{
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int smallest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest Element:"+smallest);
    }
}
