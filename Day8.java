/*

public class Day8{
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
    }
}



    
import java.util.*;
public class Day8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = sc.nextInt();
        System.out.println();
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
        sc.close();        
    }
}




import java.util.*;
public class Day8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int num = sc.nextInt();
        System.out.println();
        for(int i=1;i<=num;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}




import java.util.*;
public class Day8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("sum of numbers:"+sum);
        sc.close();
    }
}




import java.util.*;
public class Day8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num +"x"+i+"="+(num*i));
        }
        sc.close();
    }
}
    */




import java.util.*;
public class Day8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1;i<=100;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        sc.close();

    }
}