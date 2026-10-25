/* 
//Task 1 – Find the Sum of Digits of a Number:-
import java.util.*;
public class Day33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();

        int sum = 0;
        while(num!=0){
            int digit = num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println("Sum="+sum);
        sc.close();
    }
    
}
    



//Task 2 – Find the Reverse of a Number:-
import java.util.*;
public class Day33{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        
        while(num!=0){
            int reverse=num%10;
            num=num/10;
            System.out.print(reverse);
        }
        sc.close();
    }
}
    



//Task 3 – Check Whether a Number is Palindrome:-
import java.util.*;
public class Day33{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check palindrome or not:");
        int num = sc.nextInt();
        int orginal = num;
        int reverse=0;
        while(num!=0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        System.out.println("Reverse of the number:"+reverse);
        if(orginal==reverse){
            System.out.println("The number is palindrome");
        }else{
            System.out.println("The number is not a palindrome!");
        }
        sc.close();
    }
}
    



//Task 4 – Count Even and Odd Numbers in an Array:-
import java.util.*;
public class Day33{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 6 numbers:");
        System.out.println("(NOTE:- Only First 6 elements are taken!!!)");

        int[] a = new int[6];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int even = 0;
        int odd = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even Numbers:"+even);
        System.out.println("Odd Numbers:"+odd);
       
        
        sc.close();
    }
}
    




//Task 5 – Count Positive, Negative and Zero:-
import java.util.*;
public class Day33{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 6 numbers:");
        System.out.println("(NOTE:- Only First 6 elements are taken!!!)");

        int[] a = new int[6];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        int positive=0;
        int negative=0;
        int zero=0;
        for(int i=0;i<a.length;i++){
        if(a[i]>0){
            positive++;
        }else if(a[i]<0){
            negative++;
        }else{
            zero++;
        }
    }
        System.out.println("Positive number = "+positive);
        System.out.println("Negative number = "+negative);
        System.out.println("Zero's = "+zero);
        sc.close();

    }
}
    




//Task 6 – Find the Largest Digit in a Number:-
import java.util.*;
public class Day33{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number of Digit:");
        int num = sc.nextInt();
        
        
        int largest=0;
        
        while(num!=0){
            
            int number = num%10;
            if(number>largest){
            largest = number;
            }else{
                largest=largest+0;
            }
            num=num/10;
        }
        System.out.println("Largest Digit:"+largest);
        sc.close();
    }
}
    




//Task 7 – Find the Smallest Digit in a Number:-
import java.util.*;
public class Day33{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Digit:");
        int num = sc.nextInt();

        int smallest=num;

        while(num!=0){
            int digit = num%10;
            if(digit<smallest){
                smallest=digit;
            }else{
                smallest=smallest+0;
            }
            num=num/10;
        }
        System.out.println("Smallest Digit:"+smallest);
        sc.close();
    }
}
    




//Task 8 – Count Even and Odd Digits in a Number:-
import java.util.*;
public class Day33{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any number of digit:");
        int num = sc.nextInt();
         int even = 0;
         int odd = 0;
          while(num!=0){
            int digit = num%10;
            if(digit%2==0){
                even++;
            }else{
                odd++;
            }
            num=num/10;
          }
          System.out.println("Even Digits:"+even);
          System.out.println("Odd Digits:"+odd);

        sc.close();
    }
}
    




//Task 9 – Check Whether a String is an Anagram:-
import java.util.*;
import java.util.Arrays;

public class Day33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first String: ");
        String str1 = sc.nextLine().toLowerCase();

        System.out.print("Enter second String: ");
        String str2 = sc.nextLine().toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
        } else {

            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }

        sc.close();
    }
}
    */



//Task 10 – Find the Second Largest Element in an Array:-
import java.util.*;
public class Day33{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 Elements:");
        System.out.println("(NOTE:- Only 6 Elements are taken in Array!)");
        int[] a = new int[6];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int largest1 = a[0];
        for(int i=0;i<a.length;i++){
            if(largest1<a[i]){
                largest1 = a[i];
            }
        }
        int largest2 = a[0];
        for(int i=0;i<a.length;i++){
            if(largest2<a[i] && largest1>a[i]){
                largest2=a[i];
            }
        }
        System.out.println("Second Largest:"+largest2);
        sc.close();
    }
}