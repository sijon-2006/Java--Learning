/* 
//Task1:-
import java.util.*;
public class Day19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to check it is palindrome or not:");
        String word = sc.nextLine();
        String reverse = "";
        for(int i=word.length()-1;i>=0;i--){
            reverse = reverse + word.charAt(i);
        }
        if(word.equals(reverse)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
        sc.close();   
    }
}
    */


//Task2:-
import java.util.*;
public class Day19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = sc.nextLine();
        for(int i=word.length()-1;i>=0;i--){
            System.out.print(word.charAt(i));
        }
        sc.close();
    }
}