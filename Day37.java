/* 
//Task 1 – Insertion Sort (Ascending)
//Problem-Write a Java program to sort an array in ascending order using Insertion Sort:-
public class Day37{
    public static void main(String[] args) {
        int[] a = {10,4,7,2,1,9};

        for(int i=1;i<a.length;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        System.out.println("Sorted Array in Ascending Order:");
        for(int num:a){
            System.out.println(num+" ");
        }
    }
}



//Task 2 – Insertion Sort (Descending)
//Problem-Sort an array in descending order using Insertion Sort:-
public class Day37{
    public static void main(String[] args) {
        int [] a = {20,8,4,2,90,6};

        for(int i=1;i<a.length;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]<key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        System.out.println("Sorted Array in Descending Order:");
        for(int num:a){
            System.out.println(num+" ");
        }
    }
}
    



//Task 3 – User Input Insertion Sort
//Problem-Take the array size and elements from the user.
import java.util.*;
public class Day37{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array:");
        int size = sc.nextInt();
        
        System.out.println("Enter Elements:");
        int[] a = new int[size];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }

        for(int i=1;i<a.length;i++){
            int key=a[i];
            int j = i-1;
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }

        System.out.println("Sorted Array:");
        for(int num:a){
            System.out.println(num+" ");
        }

        sc.close();
    }
}



//Task 4 – Count Total Comparisons
//Problem-Count the total number of comparisons performed during Insertion Sort:-
public class Day37{
    public static void main(String[] args) {
        int[] a = {20,10,50,30,40};

        int count=0;

        for(int i=1;i<a.length;i++){
            int key=a[i];
            int j=i-1;
            
            while(j>=0){
            count++;
                if(a[j]>key){
                a[j+1]=a[j];
                j--;
                }else{
                    break;
                }
            }
            a[j+1]=key;
        }
        System.out.println("Sorted Array in Ascending Order:");
        for(int num:a){
            System.out.println(num+" ");
        }
        System.out.println("Total Comparision:"+count);
    }
}



//Task 5 – Count Total Shifts
//Problem-Count how many times elements are shifted to the right:-
public class Day37{
    public static void main(String[] args) {
        int[] a = {20,10,50,30,40};

        int count=0;

        for(int i=1;i<a.length;i++){
            int key=a[i];
            int j=i-1;
            
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                count++;
                j--;
            }
            a[j+1]=key;
        }
        System.out.println("Sorted Array in Ascending Order:");
        for(int num:a){
            System.out.println(num+" ");
        }
        System.out.println("Total Comparision:"+count);
    }
}




//Task 6 – Print Array After Every Pass
//Problem-Print the array after every pass:-
public class Day37{
    public static void main(String[] args) {
        int[] a={50,30,10,20,40};

        for(int i=1;i<a.length;i++){
            int key = a[i];
            int j = i-1;
            while(j>=0 && a[j]>key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1]=key;

            System.out.print("Pass "+i+": ");
            System.out.println();

            for(int num:a){
            System.out.print(num+" ");
            }
            System.out.println();
        }
        
    }
}
    



//Task 7 – Find Largest Element
//Problem-Without sorting the entire array, find only the largest element:-
import java.util.*;
public class Day37{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int size = sc.nextInt();
        System.out.println("Enter Elements:");
        int [] a = new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
         for(int i=1;i<a.length;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0){
                if(a[j]>key){
                    a[j+1]=a[j];
                    j--;
                }else{
                    break;
                }
            }
         }
         for(int num:a){
            System.out.println("Largest Element:"+a[a.length-1]);
            break;
         }
        sc.close();
    }
}




//Task 8 – Insertion Sort with Duplicate Elements
//Problem-Sort an array containing duplicate values:-
import java.util.*;
public class Day37{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size=sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter Elements:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        for(int i=1;i<a.length;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0){
                if(a[j]>key){
                    a[j+1]=a[j];
                    j--;
                }else{
                    break;
                }
            }
            a[j+1]=key;
        }
        System.out.println("Sorted Duplicate value Array:");
        for(int num:a){
            System.out.print(num+" ");
        }
        sc.close();
    }
}
    



//Task 9 – Sort Student Marks
//Problem-Sort student marks using Insertion Sort:-
import java.util.*;
public class Day37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int size = sc.nextInt();
        int [] a = new int[size];
        System.out.println("Enter the mark of the Students:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        for(int i=1;i<a.length;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0){
                if(a[j]>key){
                    a[j+1]=a[j];
                    j--;
                }else{
                    break;
                }
            }
            a[j+1]=key;
        }
        System.out.println("Sorted MarkList:");
        for(int num:a){
            System.out.print(num+" ");
        }
        for(int num:a){
             System.out.println();
            System.out.println("Lowest Mark:"+a[0]);
            System.out.println("Highest Mark:"+a[a.length-1]);
            break;
        }
        
        sc.close();
    }
}
    



//Tassk 10 – Sort Names Alphabetically
//Problem-Sort an array of strings alphabetically using Insertion Sort:-
import java.util.*;
public class Day37{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array to store Names:");
        int size = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Names:");
        String[] a = new String[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextLine();
        }

        for(int i=1;i<a.length;i++){
            String key=a[i];
            int j=i-1;
            while(j>=0){
                if(a[j].compareTo(key)>0){
                    a[j+1]=a[j];
                    j--;
                }else{
                    break;
                }
            }
            a[j+1]=key;
        }
        System.out.println("Sorted NameList:");
        for(String num:a){
            System.out.println(num+" ");
        }
        sc.close();
    }
}
*/

//Challenge Program:-Sort Employee IDs.
//Problem-Sort employee IDs in ascending order:-
import java.util.*;
public class Day37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array to store Employees IDs:");
        int size = sc.nextInt();
        int [] a = new int[size];
        System.out.println("Enter the IDs of the Employees:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        for(int i=1;i<a.length;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0){
                if(a[j]>key){
                    a[j+1]=a[j];
                    j--;
                }else{
                    break;
                }
            }
            a[j+1]=key;
        }
        System.out.println("Sorted Employees IDs:");
        for(int num:a){
            System.out.print(num+" ");
        }
        for(int num:a){
            System.out.println();
            System.out.println("Smallest Id:"+a[0]);
            System.out.println("Largest Id:"+a[a.length-1]);
            break;
        }
        
        sc.close();
    }
}