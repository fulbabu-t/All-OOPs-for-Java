// ==========================  Object Oriented Programming Java  ==================
// ===============================1. Class and Objects =====================

// class Demo {
//     int a = 10;  String b="Fulbabu";
//     void display() {
//         System.out.println(a+" "+b );
//     }
// }
//  class Test {
//     public static void main(String[] args) {
//         Demo r= new Demo();
//         r.display();
//     }
// }


// ================================== 2. Constructor  =======================

// class A {
//     int a; String b;
//     A() {               // Constructor
//         a=100; b="Fulbabu";
//     }
//     void display() {
//         System.out.println(a+" "+b );
//     }
// }
//  class B {
//     public static void main(String[] args) {
//         A r= new A();
//         r.display();
//     }
// }


// ================================ 3. Default Constructor =======================

// class A {
//     int a; String b; boolean c;
//     // Default Constructor
//     A() {
//         a=708656; b="Fulbabu"; c=true;
//     }
//     void display() {
//         System.out.println(a+" "+b+" "+c );
//     }
// }
//  class B {
//     public static void main(String[] args) {
//         A r= new A();
//         r.display();
//     }
// }


// ================================ 4. Parameterized Constructor x =======================

// class A {
//     int id;
//     String name;

//     // Parameterized Constructor
//     A(int x, String y) {
//         id = x;
//         name = y;
//     }

//     void display() {
//         System.out.println(id + " " + name);
//     }
// }

// class B {
//     public static void main(String[] args) {
//         // Creating object using parameterized constructor
//         A obj = new A(  75, "Fulbabu");

//         obj.display();
//     }
// }


// =============================== 5. Copy Constructor  =======================

// class A {
//     int id;
//     String name;

//     // Parameterized Constructor
//     A() {
//         id = 75;
//         name = "Fulbabu";
//         System.out.println(id+" "+name);
//     }

//     // Copy Constructor
//     A(A obj) {
//         id = obj.id;
//         name = obj.name;
//         System.out.println(id+" "+name);
//     }
//     void display() {
//         System.out.println(id + " " + name);
//     }
// }

// class B {
//     public static void main(String[] args) {
//         A obj1 = new A(); // Creating first object
//         A obj2 = new A(obj1); // Creating second object using copy constructor
//     }
// }

// =============================== 6. private Constructor =======================

// class A {
//     int a;
//     String b;

//     // Private Constructor
//     private A() {
//         a = 69;
//         b = "Fulbabu";
//         System.out.println(a + " " + b);
//     }
//      public static void main(String[] args) {
//         A  r=new A(); // Creating object using private constructo
//     }
// }


// ============================== 7. Constructor Overloading =======================

//   class A {
//     int a; double b; String c;   
//      A(){
//         a = 100;
//         b = 70865;
//         c = "babu";       
//  }
//     A(int x) {
//        a=x;
//     }  
//     A(double y, String z) {
//         b = y;
//         c = z;
//     }
//     void display() {
//         System.out.println(a + " " + b + " " + c);
//     } 
// }
//     class B {
//         public static void main(String[] args) {
//             A r1= new A();
//             A r2= new A(750);
//             A r3= new A(70865.56,"Fulbabu");          
//             r1.display();
//             r2.display();
//             r3.display();
//             System.out.println(r1.a+" "+r1.b+" "+r1.c);
//             System.out.println(r2.a);
//             System.out.println(r3.b+" "+r3.c);
//         }
//     }


// ========================= 8.Static Block ===============================

// class A {
//     static{
//         System.out.println("Fulbabu");
//     }
//     public static void main(String[] args){

//     }
//      void display() {
//         System.out.println("FulbabuIslam");
//     }
     
// }


// ======================== 9.Instance Block ===============================

// class A {
//     int a,b;
//       A(){
//          a=30; b=40;
//          System.out.println(a+" "+b); 
//       }
//       {
//         a=10; b=26;
//         System.out.println(a+" "+b);
//       }
//        void display() {
//        System.out.println(a+" "+b);
//     }
// }
// class B {
//     public static void main(String[] args) {
//         A r=new A();
//     }
// }


// ========================= 10.Instance Vs Static Blocks ===========================

// class A {
// //    Instance
//     {    
//         System.out.println("Fulbabu");
//     }

//     public static void main(String[] args) {
//         A r=new A();
//     }
//    void display() {
//         System.out.println();
//       }
// }


// class A {
//      int a=12; static int b=13;
//     static{
//         System.out.println(b);
//     }
//     public static void main(String[] args) {
//        A r=new A();
//     }
//     void  display() {
//        System.out.println();
//    }
// }

// class A {
//     // //    Instance
//      int a=12; static int b=13;
//     {
//         System.out.println(a+" "+b);
//     }
//     public static void main(String[] args) {
//        A r=new A();
//     }
//     void  display() {
//        System.out.println();
//    }
// }


// =========================== 11.Simple Inheritance  =================================

// class A {
//    protected int roll,marks;
//     String name;
//     protected void input(){
//         System.out.println("Enter roll name & marks:");
//     }
//      void display(){
//         roll=1; name="fulbabu"; marks=98;
//         System.out.println(roll+" "+name+" "+marks);
//     }
   
// }
// class fulbabu extends A 
// {
//     public static void main(String[] args){
//      fulbabu r=new fulbabu();
//      r.input(); r.display();
//     }
    
// }


// ========================= 12.Multilevel  Inheritance x ========================

// class A{
//     int a, b, c;
//     void add(){
//         a=10; b=20; c=a+b;
//         System.out.println("Fulbabu:"+c);
//     }
//     void sub(){
//         a=200; b=100;
//         c=a-b;
//         System.out.println("Fulbau:"+c);
//     }
    
// }
// class B extends A {
//     void multi(){
//         a=10; b=20;
//         c=a*b;
//         System.out.println("Fulbabu:"+c);{

//         }
//     }
//     void div (){
//         a=10; b=20;
//         c=a/b;
//         System.out.println("Fulbabu:"+c );
//         {
            
//         }
//     }
    

// }
// class C extends B{
//     void rem(){
//         a=10; b=20;
//         c=a%b;
//         System.out.println("Fulbabu:"+c);{
            
//         }
//     }
   
// }
// class Test{
//      void main(String[] args) {
//         C r=new C();
//         r.add(); r.sub(); r.multi(); r.div(); r.rem();
//     }
    
// }


// =========================== 13.Hierarchical Inheritance  ========================

// class A {
//     void display() { 
//         System.out.println("Fulbabu");
//     }
// }
// class B extends A {
//     void show() {
//         System.out.println("Islam");
//     }
// }
// class C extends A {  
//     void print() {
//         System.out.println("Fulbabu Islam");
//     }
// }
// class Test {
//     public static void main(String[] args) {
//         B r1 = new B();
//         r1.display();
//         r1.show();
//         C r2 = new C();
//         r2.display();
//         r2.print();
//     }
// }






// ========================== 14.Super Keyword X ======================================

// class G {
//     void display() {
//         System.out.println("Class A ");
//     }
// }
// class F extends G {
//    void show() {
//        System.out.println("fulbabu");
//     }
// }
// class Test {
//     public static void main(String[] args) {
//         F r = new F();
//         r.show();
//     }
// }


// ========================= 15. This Keyword  ================================

// class X {
//     public  static void main(String[] args) {
//         X r=new X();
//        System.out.println(r);
//     }
// }




//================= 15.Ppiymorphism ,(1)Compile time,  Example: Method Overloading ==========================

//  class A {
//      void add() {
//     int a=10, b=20;
//     int c=a+b;
//     System.out.println(c);
//      } 
 
//   void add(int x, int y) {
//     int c;
//      c=x+y;
//     System.out.println(c);
//      } 
//       void add(int x, double y  ) {
//     double c;
//      c=x+y;
//     System.out.println(c);
//     } 
// }
//  void main(String[] args) {
//         A r=new A();
//         r.add();
//         r.add(30, 40);
//         r.add(50, 60.5);
//      }


// ================16.Ppiymorphism ,(1)Runtime, Example: Method Overloading ==========================

// class shape {
//     void area() {
//         System.out.println("Area of Shape");
//     }
// }
// class square extends shape {
//     @Override
//     void area() {
//         System.out.println("Area of Square");
//     }
// }
// class demo {
// public static  void main(String[] args) {
//         shape s;
//         s = new shape();
//         s.area();
//         s = new square();
//         s.area();
//     }
// }

// ========================= 17.Abstraction  ================================

// abstract class A {
//     abstract void display();
// }
// class B extends A {
//     void display() {
//         System.out.println("Fulbabu");
//     }
// }
// class Test {
//     public static void main(String[] args) {
//         B r = new B();
//         r.display();
//     }
// }
// ========================= 18.Interface  ================================

// import java.util.Scanner;

// interface client {
//     void input();
//     void output();
// }

// class server implements client {
//     String name;
//     double sal;

//     public void input() {
//         Scanner r = new Scanner(System.in);
//         System.out.println("Enter name & salary:");
//         name = r.nextLine();
//         sal = r.nextDouble();
//     }

//     public void output() {
//         System.out.println("Name: " + name);
//         System.out.println("Salary: " + sal);
//     }
// }

// public class  OOPs {
//     public static void main(String[] args) {
//         server r = new server();
//         r.input();
//         r.output();
//     }
// }



   