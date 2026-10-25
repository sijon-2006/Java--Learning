/* 
//Task1:-
class Demo{
    void show(){
        System.out.println("No parameter");
    }
    void show(String name){
      System.out.println(name);
    }
}
public class Day25 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
        d.show("sijon");
    }
}
    


//Task2:-
class Demo{
    void show(){
        System.out.println("No parameter");
    }
    void show(int a){
        System.out.println(a);
    }
    void show(String name,int a){
        System.out.println(name + ","+a);
    }
}
public class Day25{
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
        d.show(20);
        d.show("sijon", 20);
    }
}
    


//Task3:-
class Animal{
    void sound(){
        System.out.println("animal makes differnt sounds");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog is Barking");
    }
}
public class Day25{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
    

//Task4:-
class Vehicle{
    void start(){
        System.out.println("Vehicle Started");
    }
}
class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("car started");
    }
}
public class Day25 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}




//Task5:-
class Person{
    void display(){
        System.out.println("method displayed");
    }
}
class Student extends Person{
    @Override
    void display(){
        System.out.println("Student method displayed");
    }
}
public class Day25{
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
    


//Task6:-
class Calculator{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
public class Day25{
    public static void main(String[] args) {
     Calculator c = new Calculator();
     c.add(10, 20);
     c.add(10, 20, 30);   
    }
}
 


//Task7:-
class Display{
    void display(){
        System.out.println("Method Overloading");
    }
    void display(char initial){
        System.out.println("Initial:"+initial);
    }
    void display(String name,int a){
        System.out.println("Name:"+name +";"+"Age:"+a);
    }
}
public class Day25{
    public static void main(String[] args) {
        Display d = new Display();
        d.display();
        d.display('A');
        d.display("sijon", 20);
    }
}
       


//Task8:-
class Bird{
    void sound(){
        System.out.println("Birds makes sound");
    }
}
class Parrot extends Bird{
    @Override
    void sound(){
        System.out.println("Parrot speaks");
    }
}
public class Day25 {

    public static void main(String[] args) {
        Parrot p  = new Parrot();
        p.sound();
    }
}
    */

//Task9:-
class Shape{
    void draw(){
        System.out.println("Drawing shape");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing circle");
    }
}
public class Day25{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}

        