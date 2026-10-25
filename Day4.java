import java.util.*;
public class Day4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Entered number is Even");
        }else{
            System.out.println("Entered number is Odd");
        }


        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("You are not Eligible to vote");
        }


        System.out.println("Enter a number:");
        int num1 = sc.nextInt();
        System.out.println("Enter a number:");
        int num2 = sc.nextInt();
        if(num1==num2){
            System.out.println("Both are Equal");
        }
        else if(num1>num2){
            System.out.println(num1 +" is the biggest number");
        }else{
            System.out.println(num2+" is the biggest number");
        }


        System.out.println("Enter the number:");
        int num3 = sc.nextInt();
        if(num3==0){
            System.out.println("Number is zero");
        }else if(num3>0){
            System.out.println("Number is positive");
        }else{
            System.out.println("Number is negative");
        }


        System.out.println("Enter the Mark:");
        int mark =sc.nextInt();
        if(mark>=40 && mark<=100){
            System.out.println("You Passed");
        }else if(mark>=0 && mark<40){
            System.out.println("you Failed");
        }else{
            System.out.println("Invalid mark!");
        }

        sc.close();
    }
}