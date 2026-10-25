import java.util.*;
public class Autocal {
    public static void main(String[] args) {
        System.out.println("no of days");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<0){
            System.out.println("wrong input");
        }
        else if(a>=1 && a<=3){
            System.out.println("Total rental cost:"+(a*500));
        }
        else if(a>=4 && a<=7){
            System.out.println("Total rental cost:"+(3*500+(a-3)*400));
        }
        else if(a>=8){
            System.out.println("Total rental cost:"+(3*500+4*400+(a-7)*300));

        }
        sc.close();
    }
    
}
