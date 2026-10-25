
/* 
//Task 1
//Using do-while loop, print:-

public class Day10 {
    public static void main(String[] args) {
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
    }
    
}
    





//Task 2:
import java.util.*;
public class Day10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        do{
            System.out.println(num);
            num--;
        }while(num>=1);
        sc.close();
    }
}





//Task 3
//Print odd numbers from 1 to 25 using do-while loop:-
public class Day10{
    public static void main(String[] args) {
     int i = 1;
     do{
        System.out.println(i);
        i=i+2;
       }while(i<=25);   
    }
}
    





//✍️ TASK 1
//Create a menu:
//Menu should repeat until user chooses Exit.
import java.util.*;
public class Day10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int num;
        do{
            System.out.println("MENU::\n 1.Even/Odd\n 2.Positive/Negative\n 3.Exit");
            System.out.println("Enter your Choice:");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter a number");
                    num = sc.nextInt();
                    if(num%2==0){
                        System.out.println("Even Number");
                    }else{
                        System.out.println("Odd Number");
                    }
                    break;
                case 2:
                    System.out.println("Enter a number");
                    num = sc.nextInt();
                    if(num>0){
                        System.out.println("Positive Number");
                    }else if(num==0){
                        System.out.println("Number is zero");
                    }else{
                        System.out.println("Negative Number");
                    }
                    break;
                case 3:
                    System.out.println("Exited Successfully!");
                    break;
                default:
                    System.out.println("Invalid choice!!!");
            }

        }while(choice!=3);
        sc.close();
    }
}








//✍️ TASK 2
//Create a program:
//Enter number
//Continue? (Y/N)
//Keep taking numbers and find total sum:-
import java.util.*;
public class Day10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int total=0;
        char choice;
        do{
            System.out.print("Enter a number:");
            num = sc.nextInt();
            total=total+num;           
            System.out.println("Continue? (Y/N):");
            choice = sc.next().charAt(0);
        }while(choice=='Y' || choice=='y');
        System.out.println("Total:"+total);
        sc.close();
    }
}
*/





//✍️ TASK 3
//Create a password check:
//Keep asking until correct password is entered:-
import java.util.*;
public class Day10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user;
        String pass;
        do{
            System.out.println("Enter your UserName:");
            user = sc.nextLine();
            System.out.println("Enter your PssWord:");
            pass = sc.nextLine();
            if(!user.equals("621323104110") || !pass.equals("cse2027")){
                System.out.println("Try Again");
            }
        }while(!user.equals("621323104110") || !pass.equals("cse2027"));
        System.out.println("Login successfull");
        sc.close();
    }
}