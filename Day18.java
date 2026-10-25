/* 
//Task1:-
public class Day18 {
    public static void main(String[] args) {
        String word = "java";
        System.out.println("Orginal word:"+word);
        System.out.println("Uppercase word:"+word.toUpperCase());
    }
    
}



//Task2:
public class Day18 {
    public static void main(String[] args) {
        String word = "Java";
        System.out.println("Orginal word:"+word);
        System.out.println("Lowercase word:"+word.toLowerCase());
    }
    
}




//Task3:-
public class Day18 {
    public static void main(String[] args) {
        String word = "Java";
        System.out.println("First Character:"+word.charAt(0));
        System.out.println("Last Character:"+word.charAt(word.length()-1));
    }
    
}

//Task4:-
public class Day18{
    public static void main(String[] args) {
        String s = "JAVA";
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}
*/


//Task5:-
public class Day18{
    public static void main(String[] args) {
        String word = "Java";
        for(int i=0;i<word.length();i++){
            System.out.println(word.charAt(i));
        }

    }
}
