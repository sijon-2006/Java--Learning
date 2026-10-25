/* 
//Task1:-
import java.io.File;
public class Day28{
    public static void main(String[] args) {
        try{
            File f = new File("Student.txt");

            if(f.createNewFile()){
                System.out.println("File created successfully");
            }
        }catch(Exception e){
            System.out.println("Error!");
        }
    }
}
  


//Task2:-
import java.io.File;
public class Day28{
    public static void main(String[] args) {
        try{
        File f = new File("college.txt");
        if(f.createNewFile()){
            System.out.println("File created");
        }
    }catch(Exception e){
        System.out.println("Eroor!");
    }
}
}

//Task3:-
import java.io.File;
public class Day28{
    public static void main(String[] args) {
        try{
            File f = new File("employee.txt");
            if(f.createNewFile()){
                System.out.println("Employee File Created");
            }
        }catch(Exception e){
            System.out.println("Error!");
        }
    }
}
    
 



//Task4:-
import java.io.File;
public class Day28{
    public static void main(String[] args) {
        try{
            File f = new File("mobile.txt");
            if(f.createNewFile()){
                System.out.println("Mobile File Created");
            }
        }catch(Exception e){
            System.out.println("Error!");
        }
    }
}
     



//Task5:-
import java.io.File;
public class Day28{
    public static void main(String[] args) {
        try{
            File f = new File("bank.txt");
            if(f.createNewFile()){
                System.out.println("Bank File Created");
            }
        }catch(Exception e){
            System.out.println("Error!");
        }
    }
}
      



//Task6:-
import java.io.File;
public class Day28{
    public static void main(String[] args) {
        try{
            File f = new File("udent.txt");
            if(f.createNewFile()){
                System.out.println("File created successfully");
            }else{
                System.out.println("File already exists");
            }
        }catch(Exception e){
            System.out.println("Error!");
        }
    }
}
     



//Task7:-
import java.io.File;
public class Day28{
    public static void main(String[] args) {
        try{
            File f = new File("mark.txt");
            if(f.createNewFile()){
                System.out.println("Mark file created");
            }else{
                System.out.println("File already exists");
            }
        }catch(Exception e){
            System.out.println("Error!");
        }
    }
}
     



//Task8:-
import java.io.File;
public class Day28{
    public static void main(String[] args) {
        try{
            File f = new File("Mobile.txt");
            if(f.createNewFile()){
                System.out.println("File created successfully");
            }else{
                System.out.println("File already exists");
            }
        }catch(Exception e){
            System.out.println("Error!");
        }
    }
}
 

//Null string Error:-
//Task8:-
public class Day28{
    public static void main(String[] args){
    String name=null;
    try{
        System.out.println(name.length());
    }catch(Exception e){
        System.out.println("String null Error!");
    }


}
}



//Task8:-
public class Day28{
    public static void main(String[] args) {
        int[] a={10,20,30};
        try{
            System.out.println(a[5]);
        }catch(Exception e){
            System.out.println("Invalid Array Index!");
        }
    }
}
    */


//Task9:-
public class Day28{
    public static void main(String[] args) {
        String num="XYZ";
        try{
            System.out.println(Integer.parseInt(num));
        }catch(Exception e){
            System.out.println("Invalid number Format!");
        }
    }
}