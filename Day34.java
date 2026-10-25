/* 
//Task 1 – Linear Search (Element Found or Not):-
import java.util.*;
public class Day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 Elements:");
        int[] a = new int[6];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter a Element to Search:");
        int search = sc.nextInt();
        boolean found = false;

        for(int i=0;i<a.length;i++){
            if(a[i] == search){
                found=true;
                break;
            }
        }

        if(found){
            System.out.println("Element Found");
        }else{
            System.out.println("Element not found!");
        }

        sc.close();
    }
}
    



//Task 2 – Linear Search(Print the Index of the Element):-
import java.util.*;
public class Day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 Elements:");
        int[] a = new int[6];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter a Element to Search its Index:");
        int search = sc.nextInt();
        int index = -1;

        for(int i=0;i<a.length;i++){
            if(a[i] == search){
                index=i;
                break;
            }
        }

        if(index!=-1){
            System.out.println("Element Found at the Index:"+index);
        }else{
            System.out.println("Element not found!");
        }

        sc.close();
    }
}
    




//Task 3 – Binary Search(Element Found or Not):-
import java.util.*;
public class Day34{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 6 Elements:");

        int[] a = new int[6];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter a Element to Search:");
        int search = sc.nextInt();

        int low=0;
        int high=a.length-1;
        boolean found = false;

        while(low<=high){
            int mid = (low+high)/2;

            if(a[mid] == search){
                found=true;
                break;
            }else if(search>a[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        if(found){
            System.out.println("Element Found");
        }else{
            System.out.println("Element not found!");
        }
        sc.close();
    }
}
    



//Task 4 – Binary Search (Print the Index of the Element):-
import java.util.*;
public class Day34{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 Elements:");
        int[] a = new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter a Element to Search Its Index:");
        int search=sc.nextInt();

        int low=0;
        int high=a.length-1;
        
        int index=-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(a[mid]==search){
                index=mid;
                break;
            }else if(search>a[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }        

        if(index!=-1){
            System.out.println("Element Found at the Index:"+index);
        }else{
            System.out.println("Element not Found!");
        }
        sc.close();
    }
}
    




//Task 5 – Linear Search (Check Whether an Element Exists)
//Problem:
//Write a Java program to search an element in an array using Linear Search:-
import java.util.*;
public class Day34{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 Elements:");
        int[] a=new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter a Element To Search:");
        int search=sc.nextInt();

        boolean found=false;

        for(int i=0;i<a.length;i++){
            if(a[i]==search){
                found=true;
                break;
            }
        }

        if(found){
            System.out.println("Element Found");
        }else{
            System.out.println("Element Not Found!");
        }
        
        sc.close();
    }
}
    





//Task 6 – Linear Search (Find Position)
//Problem:
//Write a Java program to print the position (index) of the searched element:-
import java.util.*;
public class Day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 6 Elements:");
        int[] a=new int[6];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter a Element to Search its Index:");
        int search=sc.nextInt();

        int index=-1;

        for(int i=0;i<a.length;i++){
            if(a[i]==search){
                index=i;
                break;
            }
        }

        if(index!=-1){
            System.out.println("Element Found at the Index:"+index);
        }else{
            System.out.println("Element Not Found!");
        }
        sc.close();
    }
}




//Task 7 – Linear Search (Count Occurrences)
//Problem
//Find how many times a number appears in an array:-
import java.util.*;
public class Day34{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 Elements:");
        int[] a = new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter a Element to Count its Occurance:");
        int element=sc.nextInt();

        int count=0;

        for(int i=0;i<a.length;i++){
            if(a[i]==element){
                count++;
            }
        }

        System.out.println("Element "+element+" appears "+count+" times in the array.");
        sc.close();
    }
}




//Task 8 – Linear Search (Search Character)
//Problem
//Search a character inside a String:-
import java.util.*;
public class Day34{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Word:");
        String word = sc.nextLine();

        System.out.println("Enter a Character to Search in the Word:");
        char ch = sc.next().charAt(0);

        boolean found=false;

        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Character Found");
        }else{
            System.out.println("Character Not Found!");
        }
        sc.close();
    }
}
    



//Task 9 – Linear Search (Search String)
//Problem
//Store five names in an array and search for one name:-
import java.util.*;
public class Day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Five Names:");
        String[] arr=new String[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextLine();
        }

        System.out.println("Enter the name to search:");
        String name = sc.nextLine();

        boolean found=false;

        for(int i=0;i<arr.length;i++){
            if(arr[i].equalsIgnoreCase(name)){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Name Found in the array");
        }else{
            System.out.println("Name Not Found!");
        }
        sc.close();
    }
}




//Task 10 – Binary Search (Basic)
//Problem
//Search an element using Binary Search:-
import java.util.*;
public class Day34{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 6 Elements:");
        int[] a = new int[6];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter a Element to Search:");
        int search=sc.nextInt();

        int low=0;
        int high=a.length-1;
        boolean found=false;

        while(low<=high){
            int mid=(low+high)/2;

            if(a[mid]==search){
                found=true; 
                System.out.println("Element found");
                break;
            }else if(search>a[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        if(found!=true){
            System.out.println("Element Not Found!");
        }
        sc.close();
    }
}
    



//Task 11 – Binary Search (Print Index)
//Print the index of the searched element:-
import java.util.*;
public class Day34{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 6 Elements:");
        int[] arr=new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter a Element to Search its Index:");
        int element=sc.nextInt();

        int low=0;
        int high=arr.length-1;
        boolean found=false;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==element){
                found=true;
                System.out.println("Element Found at the Index:"+mid);
                break;
            }else if(element>arr[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        if(!found){
            System.out.println("Element Not Found!");
        }
        sc.close();
    }
}



//Task 12 – Binary Search (Search User Input)
//Take a sorted array from the user and search an element using Binary Search:-
import java.util.*;
public class Day34{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 6 Elements:");
        int[] arr=new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Sorted Array:");
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("Enter a Element to Search its Index:");
        int element=sc.nextInt();

        int low=0;
        int high=arr.length-1;
        boolean found=false;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==element){
                found=true;
                System.out.println("Element Found at the Index:"+mid);
                break;
            }else if(element>arr[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        if(!found){
            System.out.println("Element Not Found!");
        }
        sc.close();
    }
}
    



//Task 13 – Binary Search (Count Comparisons)
//Count how many comparisons Binary Search takes:-
import java.util.*;
public class Day34{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 7 Elements:");
        int[] a = new int[7];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter a Element to Search:");
        int search = sc.nextInt();

        int low=0;
        int high=a.length-1;
        boolean found=false;
        int count=0;
        
        
        for(int i=low;i<=high;i++){
            count++;
            int mid=(low+high)/2;
           
            if(a[mid]==search){
                found=true;
                System.out.println("Element Found");
                break;
            }else if(search>a[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
            
        }
    
        
    
        if(!found){
            System.out.println("Element Not Found!");
        }
        System.out.println("Comparision = "+count);
        sc.close();
    }
}
    */


//Task 14 – Compare Linear Search & Binary Search
//Search the same element using both methods:-
import java.util.*;
public class Day34{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 6 Elements:");
        int[] a = new int[6];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter a Element to Search:");
        int search=sc.nextInt();

        int low=0;
        int high=a.length-1;
        boolean found=false;

        while(low<=high){
            int mid=(low+high)/2;

            if(a[mid]==search){
                found=true; 
                System.out.println("Element found by Binary Search");
                break;
            }else if(search>a[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        if(found!=true){
            System.out.println("Element Not Found!");
        }

        for(int i=0;i<a.length;i++){
            if(a[i]==search){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Element found by Linear Search");
        }
        sc.close();
    }
}