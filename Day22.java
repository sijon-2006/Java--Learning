/* 

//METHOD:-

//Task1:-
class Student{
    void display(){
        System.out.println("Method displayed");
    }
}
public class Day22{
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
   

//Task2:-
class Car{
    void brand(){
        System.out.println("BMW");
    }
}
public class Day22{
    public static void main(String[] args) {
        Car c = new Car();
        c.brand();
    }
}
    


//CONSTRUCTOR:-

//Task1:-
class Student{
    Student(){
        System.out.println("Consructor called");
    }
}
public class Day22{
    public static void main(String[] args) {
        Student s = new Student();
    }
}


//Task2:-
class Football{
    Football(){
        System.out.println("Gooooooooooaaaaaaaaal!!!");
    }
}
public class Day22{
    public static void main(String[] args) {
        Football F = new Football();
    }
}

    



//Task1:-
class Student{
    String name="sijon";
    int age=20;
    void show(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class Day22{
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
    }
}
     


//Task2:-
class Student{
    String name="sijon";
    Student(){
        System.out.println(name);
    }
}
public class Day22{
    public static void main(String[] args) {
        Student s = new Student();
    }
}



//Task3:-
class Student{
    Student(){
        System.out.println("constructor called!!!");
    }
    void display(){
        System.out.println("Method called!!!");
    }
}
public class Day22{
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
    */


//Task4:-
class Student{
    String name="sijon";
    int age=20;
    Student(){
        System.out.println("hello");
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class Day22{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.display();
        s2.display();
    }
}




