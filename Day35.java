/* 
//Task 1-Write a Java program to sort 5 numbers in ascending order using Bubble Sort:-
public class Day35{
    public static void main(String[] args) {

        int[] arr={10,1,4,23,2};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array in Ascending Order:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }   
    }
}



//Task 2-Write a Java program to sort 5 numbers in descending order using Bubble Sort:-
public class Day35{
    public static void main(String[] args) {
        
        int[] a = {10,2,3,30,1};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]<a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array in Descending Order:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
}



//Task 3-Take 6 numbers from the user, sort them in ascending order, and print the sorted array:-
import java.util.*;
public class Day35{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 6 Elements:");
        int[] arr = new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array in Ascending Order:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        sc.close();
    }
}



//Task 4-Take 6 numbers from the user, sort them in descending order, and print the sorted array:-
import java.util.*;
public class Day35{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 6 Elements:");
        int[] arr = new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array in Descending Order:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        sc.close();
    }
}



//Task 5-Write a Java program to sort the array[40 10 50 20 30]:-
public class Day35{
    public static void main(String[] args) {
        
        int[] arr = {40,10,50,20,30};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}




//Task 6 – Bubble Sort (Count Number of Swaps)
//Problem:-
//Write a Java program to count how many swaps are performed while sorting an array in ascending order:-
public class Day35{
    public static void main(String[] args) {
        int [] a={40,10,50,20,30}; 
        int count=0;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    count++;
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nTotal Swaps:"+count);
    }
}




//Task 7 – Bubble Sort (Count Number of Comparisons)
//Problem:-
//Write a Java program to count the total number of comparisons made during Bubble Sort:-
public class Day35{
    public static void main(String[] args) {
        int [] a={5,4,3,8,1,9}; 
        int total=0;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                total++;
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nComparision:"+total);
       
    }
}





//Task 8 – Bubble Sort (Optimized Version)
//Problem:-
//Write a Java program that stops early if the array is already sorted:-
public class Day35{
    public static void main(String[] args) {
        int [] a={1,2,3,4,5}; 
        boolean swapped=false;

        for(int i=0;i<a.length;i++){
            swapped=false;
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    swapped=true;
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
                if(!swapped){
                    break;
                }
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
       
    }
}





//Task 9 – Bubble Sort (Sort User Input)
//Problem:-
//Take 8 numbers from the user and sort them in ascending order:-
import java.util.*;
public class Day35{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 8 Elemets:");
        int[] a = new int[8];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array in Ascending Order:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
    */



//Task 10 – Bubble Sort (Sort String Array)
//Problem:-
//Sort the names in alphabetical order using Bubble Sort:-
import java.util.*;
public class Day35{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Five Names:");
        String[] a = new String[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextLine();
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j].compareTo(a[j+1])>0){
                    String temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("Alphabetic Order:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        sc.close();
    }
}
