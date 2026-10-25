import java.util.*;
public class Day3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int Total=a+b+c;
        System.out.println("Total:"+Total);
        int Average=Total/3;
        System.out.println("Average:"+Average);

        int largest=a;
        if(b>largest){
             largest=b;
        }
        if(c>largest){
             largest=c;
        }
        System.out.println("Largest number:"+largest);

        int smallest=a;
        if(b<smallest){
             smallest=b;
        }
        if(c<smallest){
             smallest=c;
        }
        System.out.println("Smallest number:"+smallest);
        sc.close();
    }
}