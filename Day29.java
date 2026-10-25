/* 
//Mini-Project-1:-CALCULATOR




import java.util.*;
class Calculator{
    void add(int a,int b){
        System.out.println("Sum:"+(a+b));
    }

    void subtract(int c,int d){
        System.out.println("Difference:"+(c-d));
    }

    void multiply(int e,int f){
        System.out.println("Product:"+(e*f));
    }

    void divide(int g,int h){
        try{
            System.out.println("Result:"+(g/h));
        }catch(ArithmeticException e){
            System.out.println("Cannot Divide By Zero!");
        }
    }
}
public class Day29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();
        System.out.println("MENU::\n 1.Addition\n 2.Subtraction\n 3.Multiply\n 4.Division\n 5.Exit");
        System.out.println("Enter your choice:-");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter first number:");
                int a = sc.nextInt();
                System.out.println("Enter second number:");
                int b = sc.nextInt();
                cal.add(a,b);
                break;
            case 2:
                System.out.println("Enter first number:");
                int c = sc.nextInt();
                System.out.println("Enter second number:");
                int d = sc.nextInt();
                cal.subtract(c,d);
                break;
            case 3:
                System.out.println("Enter first number:");
                int e = sc.nextInt();
                System.out.println("Enter second number:");
                int f = sc.nextInt();
                cal.multiply(e,f);
                break;
            case 4:
                System.out.println("Enter first number:");
                int g = sc.nextInt();
                System.out.println("Enter second number:");
                int h = sc.nextInt();
                cal.divide(g,h);
                break;
            case 5:
                System.out.println("Thank you");
                break;
            default:
                System.out.println("Invalid choice!!!");
                break;
        }
        sc.close();  
    }
}
    */



//Mini-Project:-Student Mangement System
class Student{
    String name = "sijon";
    int age = 20;
    String dept = "CSE";

    void display(){
        System.out.println("---- STUDENT DETAILS ----");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Department: "+dept);
        System.out.println("-------------------------");
        System.out.println("");
        
    }

    Student(){
        System.out.println("Student record Created!");
    }
}
public class Day29{
    public static void main(String[] args) {
       
        Student s1 = new Student();
         s1.display();
        Student s2 = new Student(); 
        s2.display();
    }
}