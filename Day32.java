/* 
//Task 1 – Count the Number of Characters in a String:-
import java.util.*;
public class Day32{
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a word:");
    String word = sc.nextLine();
    System.out.println("Length of the Word:"+word.length());
    sc.close();
    }
}




//Task 2 – Count the Number of Vowels in a String:-
import java.util.*;
public class Day32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word:");
        String word = sc.nextLine();
        int count=0;
        for(int i=0;i<word.length();i++){
            char ch = Character.toLowerCase(word.charAt(i));
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u'){
                count++;
            }
        }
        System.out.println("Vowels count in the word is:"+count);
        sc.close();
    }
}





//Task 3 – Count the Number of Consonants in a String:-
import java.util.*;
public class Day32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word:");
        String word = sc.nextLine();
        int count=0;
        for(int i=0;i<word.length();i++){
            char ch = Character.toLowerCase(word.charAt(i));
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u'){
            }else{
                count++;
            }
        }
        System.out.println("Consonants count in the word is:"+count);
        sc.close();
    }
}
    




//Task 4 – Count the Number of Words in a Sentence:-
import java.util.*;
public class Day32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence:");
        String sent = sc.nextLine();

        String[] words = sent.split(" ");
        System.out.println("Words:"+words.length);
        
        sc.close();
    }
}
    



//Task 5 – Check Whether Two Strings are Equal:-
import java.util.*;
public class Day32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word1 = sc.nextLine();
        System.out.println("Enter another word:");
        String word2 = sc.nextLine();
        if(word1.equals(word2)){
            System.out.println("Two words are Equal");
        }else{
            System.out.println("The words are not Equal!");
        }
        sc.close();
    }
}
    





//Task 6 – Count Uppercase and Lowercase Letters:-
import java.util.*;
public class Day32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Word:");
        String word = sc.nextLine();

        int Uppercase=0;
        int Lowercase=0;

        for(int i=0;i<word.length();i++){

          char ch = word.charAt(i);

            if(Character.isUpperCase(ch)){
            Uppercase++;
            }
            if(Character.isLowerCase(ch)){
            Lowercase++;
            }
        }

        System.out.println("UpperCase="+Uppercase);
        System.out.println("LowerCase="+Lowercase);

        sc.close();
    }
}
    




//Task 7 – Count Digits and Alphabets in a String:-
import java.util.*;
public class Day32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter something:");
        String something = sc.nextLine();

        int alphabets = 0;
        int digits = 0;

        for(int i=0;i<something.length();i++){
            char ch = something.charAt(i);

            if(Character.isAlphabetic(ch)){
                alphabets++;
            }
            if(Character.isDigit(ch)){
                digits++;
            }
        }
        System.out.println("Alphabets="+alphabets);
        System.out.println("Digits="+digits);
        sc.close();
    }
}
    



//Task 8 – Remove All Spaces from a String:-
import java.util.*;
public class Day32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sent = sc.nextLine();

        System.out.println(sent.replace(" ", ""));
        sc.close();
    }
}
    



//Task 9 – Count the Frequency of a Character:-
import java.util.*;
public class Day32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int frequency = 0;
        System.out.println("Enter a word:");
        String word = sc.nextLine();

        System.out.println("Enter a character from the entered word:");
        char ch = sc.next().charAt(0);

        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                frequency++;
            }
        }
        System.out.println("Frequency:"+frequency);
        
        sc.close();

    }
}
    */



//Task 10 – Check Whether a String Contains a Particular Character:-
import java.util.*;
public class Day32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = sc.nextLine();

        System.out.println("Enter a Character to Search:");
        char ch = sc.next().charAt(0);
        

        boolean found = false;

        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
            found = true;
            break;
            }
        }
        if(found){
            System.out.println("Character Found");
        }else{
            System.out.println("Character not Found!");
        }
        sc.close();
    }
}