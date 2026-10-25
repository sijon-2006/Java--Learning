/* 
//MOCK CODING TEST:-

//Program 1-Write a Java program to check whether a number is Even or Odd:-
import java.util.*;
public class Day30{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
        sc.close();
        
    }
}




//Program 2-Write a Java program to find the largest of 3 numbers:-
import java.util.*;
public class Day30{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num1 = sc.nextInt();
        System.out.print("Enter a number:");
        int num2 = sc.nextInt();
        System.out.print("Enter a number:");
        int num3 = sc.nextInt();
        int largest=num1;
        if(num2>largest && num2>num3 ){
            largest = num2;
        }else if(num3>largest && num3>num2){
            largest = num3;
        }
        System.out.println("Largest of 3 number is:"+largest);
        
        sc.close();

    }
}
    
    




//Program 3-Write a Java program to print numbers from 1 to 10 using a loop:-

public class Day30{
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}





//Program 4-Write a Java program to find the sum of elements in an array:-
import java.util.*;
public class Day30{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        System.out.println("Enter 4 numbers:");
        System.out.println("(Note:-Only first 4 numbers it stores in array)");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("Sum of Elements in Array:"+sum);
        sc.close();
    }
}
    */






//Program 5-Write a Java program to check whether a String is a palindrome:-
import java.util.*;
public class Day30{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word:");
        String text = sc.nextLine();
        String word = "";
        for(int i=text.length()-1;i>=0;i--){
            word=word+text.charAt(i);
        }
        System.out.println("Reversed word:"+word);
        if(word.equals(text)){
            System.out.println("The Word is Palindrome");
        }else{
            System.out.println("The Word is Not a Palindrome!");
        }
        sc.close();
    }
}