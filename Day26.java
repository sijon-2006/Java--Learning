/* 
//Task1:-
class Student{
    private String name;

    void setName(String n){
        name=n;
    }
    String getName(){
        return name;
    }
}
public class Day26{
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("sijon");
        System.out.println(s.getName());
    }
}


//Task2:-
class Employee{
    private int salary;
     void setSalary(int a){
        salary = a;
     }
     int getSalary(){
        return salary;
     }
}
public class Day26 {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setSalary(100000);
        System.out.println("Salary:"+e.getSalary());
    }
}
    


//Task3:-
class Mobile{
    private String brand;
     void setBrand(String n){
        brand=n;
     }
     String getBrand(){
        return brand;
     }
}
public class Day26{
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.setBrand("Realme");
        System.out.println("Mobile Brand:"+m.getBrand());
    }
}
        */


//Task4:-
class BankAccount{
    private String name;
    private int balance;

    void setName(String n){
        name=n;
    }
    void setBalance(int a){
        balance=a;
    }
    
    String getName(){
        return name;
    }
    int getBalance(){
        return balance;
    }
}
public class Day26{
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setName("sijon");
        b.setBalance(1000000);
        System.out.println("Name:"+b.getName());
        System.out.println("Balance:"+b.getBalance());
    }
}
