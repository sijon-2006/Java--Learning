/* 
//Task 1
//Using while loop, print:-
public class Day9{
    public static void main(String[] args) {
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
}





//Tak 2:-
import java.util.*;
public class Day9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
         System.out.println("Output:");
        while(num>=1){
            System.out.println(num);
            num--;
        }
        sc.close();
    }
}





//Task 3
//Print odd numbers from 1 to 25 using while loop:-
public class Day9{
    public static void main(String[] args) {
        int i = 1;
        while (i<=25){
            System.out.println(i);
            i=i+2;
        }
    }
}




//sum N numbers:-
import java.util.*;
public class Day9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int total=0;
        while(num>=1){
            total=total+num;
            num--;
        }
        System.out.println("Total:"+total);
        sc.close();
    }
}






//Write multiplication table using while loop:-
import java.util.*;
public class Day9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println(num +"x" +i +"=" +(num*i));
            i++;
        }
        sc.close();

    }
}






//Count digits:-
import java.util.*;
public class Day9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("Count:"+count);
        sc.close();
    }
}
*/

//Reverse the number:-
import java.util.*;
public class Day9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse:");
        int num = sc.nextInt();
        int reverse = 0;
        while(num>0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        System.out.println("Reverse of number:"+reverse);
        sc.close();
    }
}