/* 
//💻 PROGRAM 1: LARGEST OF 3 NUMBERS
//Problem:
//Input 3 numbers and print the largest:-
import java.util.*;
public class Day7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest = a;
        if(b>largest){
            largest=b;
        }
        if(c>largest){
            largest=c;
        }
        System.out.println("Largest number is:"+largest);
        sc.close();
    }
}





//✍️ TASK 2
//Write a Leap Year program:-
import java.util.*;
public class Day7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year=sc.nextInt();
        if(year%4==0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year!");
        }
        sc.close();

    }
}






//✍️ TASK 3
//Write the Electricity Bill program:-
import java.util.*;
public class Day7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Unit:");
        int unit = sc.nextInt();
        if(unit>=0 && unit<=100){
            System.out.println("Electricity Bill:"+unit*2);
        }else if(unit>100 && unit <=200){
            System.out.println("Electricity Bill:"+unit*3);
        }else if(unit>200 && unit<=300){
            System.out.println("Electricity Bill:"+unit*4);
        }else{
            System.out.println("Unit Limit Exceeded!");
        }
     
        sc.close();
        
    }
}
*/



//✍️ TASK 4
//Create the menu-driven program.
import java.util.*;
public class Day7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU::\n 1.Even/odd\n 2.Positive/Negative\n 3.Exit");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter a number to check:");
                int num1 = sc.nextInt();
                if(num1%2==0){
                    System.out.println("Even Number");
                }else{
                    System.out.println("Odd Number");
                }
                break;
            case 2:
                System.out.println("Enter a number to check:");
                int num2 = sc.nextInt();
                if(num2>0){
                    System.out.println("Positive Number");
                }else if(num2==0){
                    System.out.println("Number is Zero");
                }else{
                    System.out.println("Negative Number");
                }
                break;
            case 3:
                System.out.println("SUCEESFULLY EXITED");
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}