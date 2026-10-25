/* 
//Task1:-
public class Day17 {
    public static void main(String[] args) {
        String name = "sijon";
        System.out.println(name);
    }
    
}
   



//Task2:-
import java.util.*;
public class Day17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name:");
        String name = sc.nextLine();
        System.out.println("Welcomne "+name);
        sc.close();
    }
}
    


//Task3:-
import java.util.*;
public class Day17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your college name:");
        String college = sc.nextLine();
        System.out.println("College Name:"+college);
        sc.close();
    }
}
     

//Task4:-
public class Day17{
    public static void main(String[] args) {
        String firstname="sijon";
        String lastname="dybala";
        System.out.println(firstname+" "+lastname);
    }
}




//Task5:-
import java.util.*;
public class Day17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = sc.nextLine();
        System.out.println("Length:"+word.length());
        sc.close();
    }
}
    */


//Task6:-
import java.util.*;
public class Day17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word:");
        String word1 = sc.nextLine();
        System.out.println("Enter second word:");
        String word2 = sc.nextLine();
        if(word1.equals(word2)){
            System.out.println("same");
        }else{
            System.out.println("Not same");
        }
        sc.close();
    }
}