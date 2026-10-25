//NESTED IF:-

/*import java.util.*;
public class Day5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if(num>0){
            if(num%2==0){
                System.out.println("Number is even");
            }else{
                System.out.println("Number is odd");
            }
        }else if(num==0){
            System.out.println("Invalid:Number is Zero");
        }else{
            System.out.println("Invalid:Number is Negative");
        }

        sc.close();
    }
}*/






//SWITCH CASE:-

/*import java.util.*;
public class Day5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=sc.nextInt();
        System.out.println("Enter second number:");
        int num2=sc.nextInt();
        System.out.println("Choices::-\n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division");
        System.out.println("Choose the Number from the choices:");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Addition of two number is:"+(num1+num2));
                break;
            case 2:
                System.out.println("Subtraction of two number is:"+(num1-num2));
                break;
            case 3:
                System.out.println("Multiplication of two number is:"+(num1*num2));
                break;
            case 4:
                System.out.println("Division of two number is:"+((double)num1/num2));
                break;
            default :
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}*/


import java.util.*;
public class Day5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Mark:");
        int mark = sc.nextInt();
        char grade = 'X';
        if(mark>90 && mark<=100){
          System.out.println("You got Grade-A");
          grade='A';
        }else if(mark>80 && mark<=90){
          System.out.println("You got Grade-B");
          grade='B';
        }else if(mark>70 && mark<=80){
          System.out.println("You got Grade-C");
          grade='C';
        }else if(mark>60 && mark<=70){
          System.out.println("You got Grade-D");
          grade='D';
        }else if(mark>50 && mark<=60){
          System.out.println("You got Grade-E");
          grade='E';
        }else if(mark>=0 && mark<=50){
          System.out.println("You got Grade-F");
          grade='F';
        }else{
            System.out.println("Invalid mark");
        }
        
        switch(grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Work Hard");
                break;
            case 'E':
                System.out.println("Try More");
                break;
            case 'F':
                System.out.println("Fail");
                break;
        }
        sc.close();
    }
}
