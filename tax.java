import java.util.*;
public class tax {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int amount=sc.nextInt();
        sc.nextLine();
        String dep=sc.nextLine();
        if(amount<0 && dep.equals("no dependence")){
            System.out.println("wrong ");
        }
        else if(amount>80000 && dep.equals("no dependence")){
            System.out.println("tax rate: " + (amount * 30 / 100));
        }
        else if(amount>80000 && dep.equals("dependence")){
            System.out.println("Tax rate: " + (amount * 20 / 100));
        }
        sc.close();
        }

}
