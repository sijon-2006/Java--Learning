import java.util.*;
public class Day20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = sc.nextLine();
        System.out.println("Length of the word:"+word.length());
        System.out.println("First Character:"+word.charAt(0));
        System.out.println("Last Character:"+word.charAt(word.length()-1));
        System.out.println("UpperCase:"+word.toUpperCase());
        System.out.println("Lowercase:"+word.toLowerCase());
        String reverse = "";
        for(int i=word.length()-1;i>=0;i--){
            reverse=reverse+word.charAt(i);
        }
        System.out.println("Reversed word:"+reverse);
        if(word.equals(reverse)){
            System.out.println("It is a Palindrome word");
        }else{
            System.out.println("It is not a palindrome word!");
        }
        System.out.print("Whether word and reversed word are same : ");
        if(word.equals(reverse)){
            System.out.println("Yes,They are same.");
        }else{
            System.out.println("No,They are not same!");
        }
       
        sc.close();
    }
}

/* 

 System.out.println("STRING COMPARISION:-");
        System.out.println("Enter a word:");
        String word1=sc.nextLine();
        System.out.println("Enter a word:");
        String word2=sc.nextLine();
        if(word1.equals(word2)){
            System.out.println("Two words are same");
        }else{
            System.out.println("The words are not same");
        }
            */