/* 
//Task1:-
import java.util.*;
public class Day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
             System.out.println("Enter numerator number to divide:");
             int a = sc.nextInt();
             System.out.println("Enter denominator number to divide:");
             int b = sc.nextInt();
             System.out.println("Output:"+a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
     sc.close();
    }
    
}
 



//Task2:-
import java.util.*;
public class Day27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[3];

        System.out.print("Enter 3 numbers:");
        for(int i=0;i<=2;i++){
            a[i]=sc.nextInt();
            System.out.println(a[i]);
        }

        System.out.println("Enter the index value :");
        int index = sc.nextInt();

        try{
            System.out.println("Value:"+a[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Array Index");
        }
        
        sc.close();
    }
}




//Task3:-
import java.util.*;
public class Day27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        try{
            System.out.println("Output:"+a/b);
        }catch(Exception e){
            System.out.println("Cannot divide by zero");
        }
        sc.close();
    }
}


//Task4:-
public class Day27{
    public static void main(String[] args) {
        String name = null;
        try{
            System.out.println(name.length());
        }catch(Exception e){
            System.out.println("String is null");
        }
    }
}
       


//Task5:-
public class Day27 {
    public static void main(String[] args) {

        try {
            int num = Integer.parseInt("ABC");
            System.out.println(num);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid Number Format");
        }

    }
}
   


//Task6:-
import java.util.*;
public class Day27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        try{
            System.out.println("Output:"+num1/num2);
        }catch(Exception e){
            System.out.println("Cannot Divide by Zero");
        }
        sc.close();
    }
}




//Task7:-
import java.util.*;
public class Day27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int[] a=new int[3];
           System.out.println("Enter 3 elements:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        
        System.out.println("Enter a index value to print the element:");
        int index = sc.nextInt();

            System.out.println("Output:"+a[index]);
        }catch(InputMismatchException e){
            System.out.println("Enter only the numbers!!!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index!");
        }
        sc.close();
    }
}
     */


//Task8:-
public class Day27{
    public static void main(String[] args) {
        String name=null;

        try{
            System.out.println(name.length());
        }catch(NullPointerException e){
            System.out.println("String is null!!!");
        }
    }
}

