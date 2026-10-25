import java.util.*;
public class c2c {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<0){
            System.out.println("wrong input");
        }
        else if(a>=0){
        if(a>350){
            System.out.println("Large");
        }
        else if(a<=350&&a>=200){
            System.out.println("Medium");
        }
        else if(a<200){
            System.out.println("small");
        }
        
    }
    sc.close();
}
}