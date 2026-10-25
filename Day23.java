/* 
//Task1:-
class Student{
    String name="sijon";
    void display(){
        System.out.println(name);
    }
}
public class Day23{
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
    


//Task2:-
class Employee{
    String name="sijon";
    int salary=100000;
    void display(){
        System.out.println("Name:"+name+";"+"Salary:"+salary);
    }
}
public class Day23{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
    }
}



//Task3:-
class Car{
    Car(){
        System.out.println("car object created");
}
}
public class Day23{
    public static void main(String[] args) {
        Car c = new Car();
    }
}

//Task4:-
class Mobile{
    String model="Realme";
    Mobile(){
        System.out.println("mobile object is created");
    }
    void display(){
        System.out.println("Mobile Model:"+model);
    }
}
public class Day23{
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.display();
    }
}
    
    */



//Task5:-
class Student{
    String name="sijon";
    int age=20;
    Student(){
        System.out.println("student object is created");
    }
    void display(){
        System.out.println("Name:"+name +";"+"Age:"+age);
    }
}
public class Day23{
    public static void main(String[] args) {
     Student s = new Student();
     s.display();   
    }
}