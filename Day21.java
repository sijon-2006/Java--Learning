/* 
//Task1:-
class Student{
    String name="sijon";
}
public class Day21{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
    }
}
   


//Task2:-
class Car{
    String brand = "BMW";
}
public class Day21{
    public static void main(String[] args) {
     Car obj = new Car();
     System.out.println(obj.brand);   
    }
}
 


//Task3:-
class Mobile{
    String model="Realme";
}
public class Day21{
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        System.out.println(m1.model);
        System.out.println(m2.model);
    }
}
       


//Task4:-
class Student{
    String name="sijon";
    int age=21;
}
public class Day21{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.age);
    }
}
     */




//Task5:-
class Student{
    String name;
    int age;
}
public class Day21{
    public static void main(String[] args) {
        Student s = new Student();
        s.name="sijon";
        s.age=21;
        System.out.println("Name:"+s.name);
        System.out.println("Age:"+s.age);
    }
}