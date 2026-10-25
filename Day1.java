import java.util.Scanner;
public class Day1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World");

        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Name:"+name +","+"Age:"+age);

        System.out.println("Enter First Number:");
        int a = sc.nextInt();
        System.out.println("Enter Second Number:");
        int b = sc.nextInt();
        System.out.println("Addition:"+(a+b));
        System.out.println("Subtraction:"+(a-b));
        System.out.println("Multiplication:"+(a*b));
        System.out.println("Division:"+((double)a/b));

        System.out.println("Enter a Natural Number:");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Entered number is EVEN");
        }else{
            System.out.println("Entered Number is ODD");
        }
        if(a>b && a>num){
            System.out.println("In this Program " +a +" is the largest number");
        }
        else if(b>num && b>a){
            System.out.println("In this Program " +b+" is the largest number");
        }else{
            System.out.println("In this Program " +num+" is the largest number");
        }

        sc.close();
}
}