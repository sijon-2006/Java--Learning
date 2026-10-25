/*
//Write a switch program:

👉 Input number (1–5)
👉 Print:

1 → One
2 → Two
3 → Three
4 → Four
5 → Five

import java.util.*;
public class Day6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1-5:");
        int num = sc.nextInt();
        switch(num){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Invalid number!");
        }
        sc.close();
        
    }
}


//MENU-BASED CALCULATOR:-
import java.util.*;
public class Day6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Choices::\n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Modulus\n 6.Power");
        System.out.println("Enter the number to perform the choice:");
        int num = sc.nextInt();
        switch(num){
            case 1:
                System.out.println("Result:"+(a+b));
                break;
            case 2:
                System.out.println("Result:"+(a-b));
                break;
            case 3:
                System.out.println("Result:"+(a*b));
                break;
            case 4:
                if(b!=0){
                System.out.println("Result:"+((double)a/b));
                }else{
                    System.out.println("Second number cannot be zero");
                }
                break;
            case 5:
                System.out.println("Result:"+(a%b));
                break;
            case 6:
                System.out.println("Result:"+Math.pow(a,b));
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}



//CONDITION-BASED PROBLEM 1
//👉 Check Vowel or Consonant:-
import java.util.*;
public class Day6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character:");
        char ch = sc.next().charAt(0);
        switch(ch){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Vowel Character");
                break;
            default:
                System.out.println("Consonant Character");
        }

        sc.close();
    }
}
*/



//CONDITION-BASED PROBLEM 2
//👉 Simple Login System
import java.util.*;
public class Day6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter UserNmae:");
        String user = sc.nextLine();
        System.out.println("Enter PassWord:");
        String pass = sc.nextLine();
        if(user.equals("621323104064") && pass.equals("cse2027")){
            System.out.println("Login Successful");
        }else if(user.equals("621323104110") && pass.equals("cse2027")){
            System.out.println("Login Successful");
        }else if(user.equals("621323104090") && pass.equals("cse2027")){
            System.out.println("Login Successful");
        }else{
            System.out.println("Wrong Details!");
        }
        sc.close();
    }
}