# JAVA

### Index
|Index no.|Topic Name|Link|
|---------|----------|----|
|1.| Java syntax |[Click here](#java-syntax)|
|2.| Data Types |[Click here](#data-types)|
|3.| Java Operators |[Click here](#java-operator-precedence)|
|4.| Type Casting & Input |[Click here](#type-casting)|
|5.| Java Control Statements |[Click here](#java-control-statements)|
|6.| Java Arrays |[Click here](#java-arrays)| 
|7.|OOPs|[Click here](#oops)|
|8.|Inheritance|[Click here](#inheritance-1)|
|9.|Super Keyword|[Click here](#super-keyword)|
|10.|Dynamic Method Dispatch|[Click here](#dynamic-method-dispatch-runtime-polymorphism)|
|11.|Interface|[Click here](#interface)|
|12.|String|[Click here](#string)|
|13.|Package|[Click here](#package)|
|14.|Exception Handling|[Click here](#exception-handling)|
|15.|Wrapper Class|[Click here](#wrapper-classes-in-java)|
|16.|StringBuffer|[Click here](#stringbuffer-class)|
### What is Java?
Java is a general-purpose, class-based, object-oriented programming language designed for having lesser implementation dependencies. It is owned by Oracle, and more than 3 billion devices run Java.<br>
Designed by	James Gosling <br>
First appeared in May 23, 1995

#### Uses of Java
1. Mobile applications, Desktop applications, Web applications
2. Web servers and application servers
3. Database connection
4. Games


## Java syntax
In Java, every application begins with a class name, and that class must match the filename.
Let's create our first Java file, called Main.java.

Example:
```java
// First Java program
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```
- Every line of code that runs in Java must be inside a <b>class</b>.
- The <b>main()</b> method is required and you will see it in every Java program.

Example:
```java
public static void main(String[] args)
```
- Any code inside the <b>main()</b> method will be executed.

<hr>

#### Output
##### System.out.println()
- Inside the main() method, we can use the println() method to print a line of text to the screen.

Example:
```java
// for strings
System.out.println("Hello World!");

// for numbers
System.out.println(500);
```
- When you are working with text, it must be wrapped inside double quotations marks " ".

##### System.out.print()
- There is also a print() method, which is similar to println(). The only difference is that it does not insert a new line at the end of the output.

Example:
```java
// for strings
System.out.print("Hello World!");

// for numbers
System.out.print(500);
```

### Java Comments
Comments can be used to explain Java code, and to make it more readable. It can also be used to prevent execution when testing alternative code.

##### Single-line Comments
- Single-line comments start with two forward slashes (//).

Example:
```java
// This is a comment
System.out.println("Hello World");
```

##### Multi-line Comments
- Multi-line comments start with /* and ends with */.

Example:
```java
/* The code 
below will print the 
words Hello World */
System.out.println("Hello World");
```
## Data Types

#### Primitive Data Types
| Data Type | <Center>Definition</center> | Default size |
|-----------|------------|--------------|
|boolean | It is used to store only two possible values: true and false. |	1 bit|
|char		| It is used to store characters. |2 byte|
|byte		| It is an 8-bit signed two's complement integer.| 1 byte|
|short	| It is a 16-bit signed two's complement integer. |	2 byte|
|int		| It is a 32-bit signed two's complement integer. |	4 byte|
|long		| It is a 64-bit two's complement integer. |	8 byte|
|float	| It is a single-precision 32-bit IEEE 754 floating point. |	4 byte|
|double | It  is a double-precision 64-bit IEEE 754 floating point. |	8 byte|

Example:
```java
// Boolean Data Type
Boolean one = false; 

// Char Data Type
char letterA = 'A';

// Byte Data Type 
byte a = 10, b = -20;

// Short Data Type
short s = 10000;

// Int Data Type
int a = 100000;

// Long Data Type
long a = 100000L;

// Float Data Type
float f1 = 234.5f;

// Double Data Type
double d1 = 12.3; 

```

## Variable
A variable is the name of a reserved area allocated in memory. In other words, it is a name of the memory location. It is a combination of "vary + able" which means its value can be changed.

#### Types of Variables
There are three types of variables in Java:
1) Local Variable
- A variable declared inside the body of the method is called local variable. You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.

2) Instance Variable
- A variable declared inside the class but outside the body of the method, is called an instance variable. It is not declared as static.

3) Static variable
- A variable that is declared as static is called a static variable. It cannot be local. You can create a single copy of the static variable and share it among all the instances of the class. Memory allocation for static variables happens only once when the class is loaded in the memory.

Example:
![TypesOfVariable](https://mlvhinnhtvi1.i.optimole.com/w:900/h:518/q:mauto/https://kaizensk.com/wp-content/uploads/2021/12/types-of-variable-in-python.png)

## Keywords
![JavaReserveKeywods](https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/06/List-of-Java-Keywords.jpg)


## Java Operator Precedence
|Operator Type |	Category |	Precedence |
|--------------|-----------|-------------|
|Unary |	postfix | expr++ expr-- |
|      |prefix	  |++expr --expr +expr -expr ~ !|
|Arithmetic |	multiplicative |	* / % |
|           |additive |	+ - | 
|Shift |	shift |	<< >> >>> |
|Relational	|comparison	|< > <= >= instanceof|
||equality|	== !=|
|Bitwise	|bitwise AND|	&|
||bitwise exclusive OR|	^|
||bitwise inclusive OR| l |
|Logical|	logical AND	|&&|
||logical OR |      l l     |
| Ternary	| ternary	|? :|
| Assignment |	assignment	| = += -= *= /= %= &= ^= |= <<= >>= >>>=|

## Type casting
- Convert a value from one data type to another data type is known as type casting.

##### Types of Type Casting

###### 1. Widening Type Casting
- Converting a lower data type into a higher one is called widening type casting.
- Both data types must be compatible with each other.
- The target type must be larger than the source type.

```java
byte -> short -> char -> int -> long -> float -> double  
```
Example:
```java
public class WideningTypeCasting{  
public static void main(String[] args){ 
 
  int x = 7;  
//automatically converts the integer type into long type  
  
  long y = x;  
//automatically converts the long type into float type  

  float z = y;  
}}
```

###### 2. Narrowing Type Casting
- Converting a higher data type into a lower one is called narrowing type casting.

```java
double -> float -> long -> int -> char -> short -> byte  
```
Example:
```java
public class NarrowingTypeCastingExample{  
public static void main(String args[]){  

  double d = 166.66;  
//converting double data type into long data type  

  long l = (long)d;   
//converting long data type into int data type  

  int i = (int)l;  
}} 
```

## Input 

###### Java Scanner Class
- Java Scanner class allows the user to take input from the console. It belongs to java.util package.

```java 
import java.util.*;
```
```java
// Syntax
Scanner sc=new Scanner(System.in);  
```
###### Methods of Java Scanner Class
| Method |	Description |
|--------|--------------| 
|int nextInt() |	It is used to scan the next token of the input as an integer.|
|float nextFloat()	| It is used to scan the next token of the input as a float. |
|double nextDouble() |	It is used to scan the next token of the input as a double.|
|byte nextByte() |	It is used to scan the next token of the input as a byte.|
|String nextLine() |	Advances this scanner past the current line.|
|boolean nextBoolean() |	It is used to scan the next token of the input into a boolean value.|
|long nextLong() |	It is used to scan the next token of the input as a long.|
|short nextShort() |	It is used to scan the next token of the input as a Short.|


Example:
```java
import java.util.*;  
class UserInput{  
public static void main(String[] args){  
Scanner sc= new Scanner(System.in); 

System.out.print("Enter first number- ");  
int a= sc.nextInt();  // read int
System.out.print("Enter second number- ");  
int b= sc.nextInt();  // read int
int d=a+b;  
System.out.println("Total= " +d);  

System.out.print("Enter a string: ");  
String str= sc.nextLine();  //reads string  
System.out.print("You have entered: "+str); 
}}  
```
###### Java Scanner close() Method
- The close() is a method of Java Scanner class which is used to closes this scanner.

```java
import java.util.*;    
public class ScannerClose{    
   public static void main(String args[]){   
     System.out.print("Enter Your Name: ");  
     
       //Create a scanner with the specified Object  
       Scanner scanner = new Scanner(System.in);      
       String name = scanner.next();  
       System.out.println("Name: "+name);   

       //Close the scanner  
       scanner.close();  
}}     
```

## Java Control Statements
### 1. Decision Making statements
#### 1) If Statement:
##### 1. Simple if statement
- It evaluates a Boolean expression and enables the program to enter a block of code if the expression evaluates to true.

Synatx
```java
if(condition) {    
statement 1; //executes when condition is true   
}    
```
Example:
```java
public class Student {    
public static void main(String[] args) {    
int x = 10;    
int y = 12;    
if(x+y > 20) {    
    System.out.println("x + y is greater than 20");    
}}}    
```

##### 2. if-else statement
-   If the given condition is true, then the code inside the if block is executed, otherwise else block code is executed.

Synatx
```java
if(condition) {    
statement 1; //executes when condition is true   
} else{  
statement 2; //executes when condition is false   
}    
```
Example:
```java
public class Student {  
public static void main(String[] args) {  
int x = 10;  
int y = 12;  
if(x+y < 10) {  
    System.out.println("x + y is less than 10");  
} else {  
    System.out.println("x + y is greater than 20");  
}}}     
```
##### 3. if-else-if ladder
-  As soon as a true condition is found, the statement associated with it is executed, and the rest of the ladder is bypassed.

Synatx
```java
if(condition 1) {    
statement 1; //executes when condition 1 is true   
} else if(condition 2) {  
statement 2; //executes when condition 2 is true   
} else {  
statement 2; //executes when all the conditions are false   
}    
```
Example:
```java
public class Student {  
public static void main(String[] args) {  
String city = "Delhi";  
if(city == "Meerut") {  
    System.out.println("city is meerut");  
}else if (city == "Noida") {  
    System.out.println("city is noida");  
}else {  
    System.out.println(city);  
}}}     
```
##### 4. Nested if-statement
- It means one IF function inside of another, allows you to test multiple criteria and increases the number of possible outcomes.

Synatx
```java
if(condition 1) {    
statement 1; //executes when condition 1 is true   
  if(condition 2) {  
      statement 2; //executes when condition 2 is true   
  } else{  
      statement 2; //executes when condition 2 is false   
}}    
```
Example:
```java
public class Student {    
public static void main(String[] args) {    
String address = "Delhi, India";    
    
if(address.endsWith("India")) {    
  if(address.contains("Meerut")) {    
    System.out.println("Your city is Meerut");    
  }else {    
    System.out.println(address.split(",")[0]);    
  }    
}else {    
  System.out.println("You are not living in India");    
}}}      
```

#### 2) Switch Statement:
- It contains multiple blocks of code called cases and a single case is executed based on the variable which is being switched.

Syntax
```java
switch (expression){  
    case value1:  statement1;  
     break;  
    .  
    .  
    case valueN:  statementN;  
     break;  
    default:  default statement;  
}  
```
Example:
```java
public class Student implements Cloneable {  
public static void main(String[] args) {  
int num = 2;  
switch (num){  
case 0:  System.out.println("number is 0");  
  break;  
case 1: System.out.println("number is 1");  
  break;
case 2: System.out.println("number is 2");  
  break;  
case 3: System.out.println("number is 3");  
  break;
default: System.out.println(num);  
}}}  
```

### 2. Loop statements
#### 1) For loop
- It  is used to check for certain conditions and then repeatedly execute a block of code as long as those conditions are met.

Syntax
```java
for(initialization, condition, increment/decrement) {    
//block of statements    
}    
```

Example:
```java
public class Cal {  
public static void main(String[] args) {  

int sum = 0;  
for(int j = 1; j<=10; j++) {  
    sum = sum + j;}  
System.out.println(sum);  
}}  
```

#### 2) While loop 
- It is also known as the entry-controlled loop since the condition is checked at the start of the loop. If the condition is true, then the loop body will be executed; otherwise, the statements after the loop will be executed.

Syntax
```java
while(condition){    
//looping statements    
} 
```
Example:
```java
public class Cal {    
public static void main(String[] args) {
    
int i = 0;     
while(i<=10) {    
  System.out.println(i);    
  i = i + 2;
}}}  
```

#### 3) Do-while loop
- It is also known as the exit-controlled loop since the condition is not checked in advance. 

Syntax
```java
do {    
//statements    
} while (condition); 
```
Example:
```java
public class Cal {    
public static void main(String[] args) {    
int i = 0;    
do {    
  System.out.println(i);    
  i = i + 2;    
}while(i<=10);    
}}    
```

### 3. Jump Statements
#### 1) Break 
- It is used to break the current flow of the program and transfer the control to the next statement outside a loop or switch statement.

Syntax
```java
break;
```
Example:
```java
public class Break {    
public static void main(String[] args) {  

for(int i = 0; i<= 10; i++) {  
  System.out.println(i);  
    if(i==6) {  
      break;  
}}}}  
```

#### 2) Continue
- It skips the specific part of the loop and jumps to the next iteration of the loop immediately.

Syntax
```java
continue;
```
Example:
```java
public class ContinueExample {  
public static void main(String[] args) {  
      
  for(int i=1;i<=10;i++){  
        if(i==5){  
          continue; 
        } System.out.println(i);  
}}}  
```

#### Java Arrays
- Java array is an object which contains elements of a similar data type. Additionally, The elements of an array are stored in a contiguous memory location. It is a data structure where we store similar elements. We can store only a fixed set of elements in a Java array.

###### There are two types of array.

- Single Dimensional Array

Syntax
```java 
dataType[] arr = new datatype[size];  
```

Example: 
```java
class Testarray{  
public static void main(String args[]){  
  int a[] =new int[5]; 
  a[0]=10;
  a[1]=20;  
  a[2]=70;  
  a[3]=40;  
  a[4]=50;  

  for(int i=0;i<a.length;i++) 
  System.out.print(a[i] + " ");
}}  
```
- Multidimensional Array

Syntax
```java 
dataType[][] arr = new datatype[size][size];   
```

Example: 
```java
class Testarray{  
public static void main(String args[]){  
  int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
  for(int i=0;i<3;i++){  
    for(int j=0;j<3;j++){  
      System.out.print(arr[i][j]+" ");  
    }  
  System.out.println();}  
}}     
```



## OOPs
- Object means a real-world entity such as a pen, chair, table, computer, watch, etc. Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects.

### Characteristics of Object Oriented Programming

##### Class
- Collection of objects is called class. It is a logical entity.
A class can also be defined as a blueprint from which you can create an individual object. Class doesn't consume any space.

##### Object
- An Object can be defined as an instance of a class. An object contains an address and takes up some space in memory.


##### Polymorphism 
- If one task is performed in different ways, it is known as polymorphism. For example: to convince the customer differently, to draw something, for example, shape, triangle, rectangle, etc.

![Polymorphism](https://pbs.twimg.com/media/FDVytz0UcAQOUXX?format=jpg&name=large)

##### Inheritance
- When one object acquires all the properties and behaviors of a parent object, it is known as inheritance. It provides code reusability. It is used to achieve runtime polymorphism.

![Inheritance](https://pbs.twimg.com/media/FDVysGkUcAI3iSX?format=jpg&name=medium)

##### Encapsulation
- Binding (or wrapping) code and data together into a single unit are known as encapsulation. For example, a capsule, it is wrapped with different medicines. 

![Encapsulation](https://pbs.twimg.com/media/FDVyspOUcAInVT8?format=jpg&name=medium)

##### Abstraction
- Hiding internal details and showing functionality is known as abstraction. For example phone call, we don't know the internal processing.

![Abstraction](https://pbs.twimg.com/media/FDVytMJVUAk405v?format=jpg&name=medium)




### Class in Java
A class is a group of objects which have common properties. It is a template or blueprint from which objects are created. It is a logical entity. It can't be physical.


A class in Java can contain:

![Class in Java](https://static.javatpoint.com/images/class-in-java.png)


Syntax
```java
class ClassName {
    // field;  
    // method;  
}

```
Example:
```java
class Student{  
  int id;  
 String name;    
 public static void main(String args[]){  

  Student s1 = new Student();
  
  System.out.println(s1.id);
  System.out.println(s1.name);  
}}  
```

### Object in Java
- Objects correspond to things found in the real world. For example, a animal class may have objects such as “cat”, “dog”, and “cow”.  

- Declaring Objects (Also called instantiating a class)

Syntax
```java
Class_name object = new Class_name();  
```

Example:
```java
class Student{  
 int id;  
 String name;  
}  
class TestStudent2{  
 public static void main(String args[]){  
  Student s1=new Student();  
  s1.id=101;  
  s1.name="Sonoo";  
  System.out.println(s1.id+" "+s1.name);//printing members 
}}  
```

### Method in Java
  - A method is a block of code or collection of statements or a set of code grouped together to perform a certain task or operation. It is used to achieve the reusability of code. We write a method once and use it many times. We do not require to write code again and again.
  
#### Method Declaration
  
  ![method](https://media.geeksforgeeks.org/wp-content/uploads/methods-in-java.png)
  
  
  Syntax
  ```java
  public class Main {
    static void myMethod() {
      // code to be executed
    }
  }
  ```
  Example:
  ```java
  public class Main {
    static void myMethod() {
      System.out.println("I just got executed!");
    }
  
    public static void main(String[] args) {
      myMethod(); // calling method in main function
    }
  }
```

### Method Overloading in Java
- In Java, two or more methods may have the same name if they differ in parameters (different number of parameters, different types of parameters, or both). These methods are called overloaded methods and this feature is called method overloading. 

Example:
```java
class Adder{  
  public int add(int a, int b){
    return a+b;}  
  public double add(double a, double b){
    return a+b;}  
}  
class TestOverloading2{  
  public static void main(String[] args){  
    System.out.println(Adder.add(11,11));  
    System.out.println(Adder.add(12.3,12.6));  
}}  
```

### Constructors in Java
- In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory.

- There are rules defined for the constructor.
  1. Constructor name must be the same as its class name
  2. A Constructor must have no explicit return type
  3. A Java constructor cannot be abstract, static, final, and  synchronized


##### Types of Java constructors
1. Default constructor (no-arg constructor)
- The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.

Syntax
```java
<class_name>(){}
```

Example:
```java
class Bike1{  
//default constructor  
  Bike1(){System.out.println("Bike is created");}  
  public static void main(String args[]){  
    Bike1 b=new Bike1();  
}}  
```
2. Parameterized constructor
- The parameterized constructor is used to provide different values to distinct objects. However, you can provide the same values also.

Syntax
```java
<class_name>(dataType para1, dataType para2, ...){}
```

Example:
```java
class Student{  
    int id;  
    String name;  
    // parameterized constructor  
    Student(int i,String n){  
    id = i;  
    name = n;}  
    //method to display the values  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    Student s1 = new Student(111,"Karan");  
    //calling method to display 
    s1.display();  
}}  
```

#### Constructor overloading in Java
-  The constructor overloading can be defined as the concept of having more than one constructor with different parameters so that every constructor can perform a different task.

Example:
```java
public class Student {  
  int id;  
  String name;  
  
  Student(){  
    System.out.println("this a default constructor");}  
  
  Student(int i, String n){  
    id = i;  
    name = n;}  
  
  public static void main(String[] args) {  
    Student s = new Student();  
    System.out.println("\nDefault Constructor values: \n");  
    System.out.println("Student Id :"+s.id +"\nStudent Name :    "+s.name);  
  
    System.out.println("\nParameterized Constructor values: \n");  
    Student student = new Student(10, "David");  
    System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name);}}  
```

#### Finalize() Method
- Finalize() is the method of Object class. This method is called just before an object is garbage collected. finalize() method overrides to dispose system resources, perform clean-up activities and minimize memory leaks.

Syntax
```java
protected void finalize() throws Throwable
// Throwable - the Exception is raised by this method
```

Example:
```java
public class FinalizeExample {    
     public static void main(String[] args)     
    {     
        FinalizeExample obj = new FinalizeExample();        
        // printing the hashcode   
        System.out.println("Hashcode is: " + obj.hashCode());           
        obj = null;    
        // calling the garbage collector using gc()   
        System.gc();     
        System.out.println("End of the garbage collection");     
    }     
   // defining the finalize method   
    protected void finalize()     
    {     
        System.out.println("Called the finalize() method");     
    }     
}  
```

#### Call by Value and Call by Reference in Java

##### Call by Value in java
- There is only call by value in java, not call by reference. If we call a method passing a value, it is known as call by value. The changes being done in the called method, is not affected in the calling method.

Example:
```java
class Operation{  
 int data=50;  
  
 void change(int data){  
    data += 100;//changes will be in the local variable only  
 }  
     
 public static void main(String args[]){  
   Operation op=new Operation();  
  
   System.out.println("before change "+op.data);  
   op.change(500);  
   System.out.println("after change "+op.data);    
}}  
```

##### Call by Reference in java
- In case of call by reference original value is changed if we made changes in the called method. If we pass object in place of any primitive value, original value will be changed. In this example we are passing object as a value. 

Example:
```java
class Operation2{  
 int data=50;  
  
 void change(Operation2 op){  
    op.data=op.data+100;//changes will be in the instance variable  
 }  
     
    
 public static void main(String args[]){  
   Operation2 op=new Operation2();  
  
   System.out.println("before change "+op.data);  
   op.change(op);//passing object  
   System.out.println("after change "+op.data);  
}} 
```

#### This keyword
- There can be a lot of usage of Java this keyword. In Java, this is a reference variable that refers to the current object.

![method](https://static.javatpoint.com/images/usage-of-java-this-keyword.png)

Example-1: 

```java
class Student{  
  int rollno;  
  String name;  
  float fee;  
  Student(int rollno,String name,float fee){  
    this.rollno=rollno;  
    this.name=name;  
    this.fee=fee;
  }  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class TestThis2{  
  public static void main(String args[]){  
    Student s1=new Student(111,"ankit",5000f);  
    Student s2=new Student(112,"sumit",6000f);  
    s1.display();  
    s2.display();  
  }
}  
```
Example-2: 

```java
class A5{  
  void m(){  
    System.out.println(this);
  }  
  public static void main(String args[]){  
    A5 obj=new A5();  
    System.out.println(obj);
    obj.m();  
  }  
}  
```

#### Static keyword

The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested classes. The static keyword belongs to the class than an instance of the class.

- The static can be:

1. Static Variable
- The static variable can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.

- The static variable gets memory only once in the class area at the time of class loading.

Example:
```java
class Student{  
   int rollno; 
   String name;  
   static String college ="ITS";  
   Student(int r, String n){  
   rollno = r;  
   name = n;  
   }    
   void display (){System.out.println(rollno+" "+name+" "+college);}  
}  
public class TestStaticVariable1{  
 public static void main(String args[]){  
 Student s1 = new Student(111,"Karan");   
 s1.display();  
 }  
}  
```

2. Static Method 
- A static method belongs to the class rather than the object of a class.
- A static method can be invoked without the need for creating an instance of a class.
- A static method can access static data member and can change the value of it.

Example:
```java
class Calculate{  
  static int cube(int x){  
  return x*x*x;  
  }  
  public static void main(String args[]){  
  int result=Calculate.cube(5);  
  System.out.println(result);  
  }  
}   
```
3. Static Block

- Is used to initialize the static data member.
- It is executed before the main method at the time of classloading.

Example: 
```java
class A{  
  static{System.out.println("static block is invoked");}  
  public static void main(String args[]){  
   System.out.println("Hello main");  
  }  
}  
```

### Inheritance

- The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you can reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class also.

Synatx
```java
class Subclass-name extends Superclass-name {  
   //methods and fields  
}
```

![Inheritance](https://static.javatpoint.com/images/core/inheritance.jpg)

Example:
```java
class Employee{  
 float salary=40000;  
}  
class Programmer extends Employee{  
 int bonus=10000;  
 public static void main(String args[]){  
   Programmer p=new Programmer();  
   System.out.println("Programmer salary is:"+p.salary);  
   System.out.println("Bonus of Programmer is:"+p.bonus);  
}}
```

#### Types of inheritance

1. Single Inheritance
- When a class inherits another class, it is known as a single inheritance.

Example:
```java
class Animal{  
void eat(){System.out.println("eating...");}}

class Dog extends Animal{  
void bark(){System.out.println("barking...");}}  

class TestInheritance{  
  public static void main(String args[]){  
    Dog d=new Dog();  
    d.bark();  
    d.eat(); 
  }
}  
```

2. Multilevel Inheritance
-  Multilevel Inheritance in java occurs when a class extends a class that extends another class. This is called multilevel Inheritance in java.

Example:
```java
class Animal{  
void eat(){System.out.println("eating...");}}  

class Dog extends Animal{  
void bark(){System.out.println("barking...");}}  

class BabyDog extends Dog{  
void weep(){System.out.println("weeping...");}}  

class TestInheritance2{  
  public static void main(String args[]){  
    BabyDog d=new BabyDog();  
    d.weep();  
    d.bark();  
    d.eat();  
  }
}  
```

3. Hierarchical Inheritance
- When two or more classes inherits a single class, it is known as hierarchical inheritance.

Example: 
```java
class Animal{  
void eat(){System.out.println("eating...");}}  

class Dog extends Animal{  
void bark(){System.out.println("barking...");}}  

class Cat extends Animal{  
void meow(){System.out.println("meowing...");}}  

class TestInheritance3{  
  public static void main(String args[]){  
    Cat c=new Cat();  
    c.meow();  
    c.eat();  
  }
}  
```

4. Hybrid Inheritance
- It is the composition of two or more types of inheritance. The main purpose of using hybrid inheritance is to modularize the code into well-defined classes. 

Example:
```java
class C {
  public void disp(){ System.out.println("C");}
}

class A extends C {
  public void disp(){ System.out.println("A");}
}

class B extends C {
  public void disp(){ System.out.println("B");}
}

class D extends A {
  public void disp(){ System.out.println("D");}
  
  public static void main(String args[]){
    D obj = new D();
	  obj.disp();
  }
}
```

#### NOTE:
Why multiple inheritance is not supported in java?
=

- To reduce the complexity and simplify the language, multiple inheritance is not supported in java.

- Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes. If A and B classes have the same method and you call it from child class object, there will be ambiguity to call the method of A or B class.


### Super Keyword
- The super keyword in Java is a reference variable which is used to refer immediate parent class object.

- Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.

#### Super Keyword Usage

![usageOfSuperKeyword](https://static.javatpoint.com/images/usage-of-java-super.jpg)

1. Super is used to refer immediate parent class instance variable.

- We can use super keyword to access the data member or field of parent class. It is used if parent class and child class have same fields.

Example: 
```java
class Animal{
  String color="white";}  

class Dog extends Animal{  
  String color="black";  
  void printColor(){  
    System.out.println(color);//prints color of Dog class  
    System.out.println(super.color);//prints color of Animal class  
  }  
}  
class TestSuper1{  
  public static void main(String args[]){  
    Dog d=new Dog();  
    d.printColor();  
  }
}  
```

2. Super can be used to invoke parent class method

- The super keyword can also be used to invoke parent class method. It should be used if subclass contains the same method as parent class. In other words, it is used if method is overridden.

Exapmle:
```java
class Animal{  
  void eat(){System.out.println("eating...");}
}  

class Dog extends Animal{  
  void eat(){System.out.println("eating bread...");}  
  void bark(){System.out.println("barking...");}  
  void work(){  
  super.eat();  
  bark();  
  }  
}  
class TestSuper2{  
  public static void main(String args[]){  
    Dog d=new Dog();  
    d.work();  
  }
}  
```

3. Super is used to invoke parent class constructor

- The super keyword can also be used to invoke the parent class constructor. Let's see a simple example:

```java
class Value{  
  Value(int a){
    System.out.println("Value : " + a);
  }  
} 

class Value2 extends Value{  
  Value2(){  
    super(2000);  
    System.out.println("Value 2");
  }  
} 

class TestSuper3{  
  public static void main(String args[]){  
    Value2 d=new Value2();  
  }
}  
```

#### Method Overriding
- If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.

- In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.

![MethodOverriding](https://static.javatpoint.com/images/java-rules-for-method-overriding.png)

Example:
```java
class Vehicle{  
  //defining a method  
  void run(){System.out.println("Vehicle is running");}  
}  

//Creating a child class  
class Bike2 extends Vehicle{  
  //defining the same method as in the parent class  
  void run(){System.out.println("Bike is running safely");}  
  
  public static void main(String args[]){  
    Bike2 obj = new Bike2();//creating object  
    obj.run();//calling method  
  }  
}  
```

#### Dynamic Method Dispatch (Runtime polymorphism)

- Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.

- In this process, an overridden method is called through the reference variable of a superclass. The determination of the method to be called is based on the object being referred to by the reference variable.

![upcasting](https://static.javatpoint.com/images/java-upcasting.png)

Syntax
```java
class A{}  
class B extends A{}  

A a = new B();//upcasting 
```

Example:
```java
class Bike{  
  void run(){System.out.println("running");}  
}  

class Splendor extends Bike{  
  void run(){System.out.println("running safely with 60km");}  
  
  public static void main(String args[]){  
    Bike b = new Splendor();//upcasting  
    b.run();  
  }  
}  
```

### Final Keyword
- The final keyword in java is used to restrict the user. The java final keyword can be used in many context. 

1. Final variable
- If you make any variable as final, you cannot change the value of final variable(It will be constant).

Example:
```java
class Bike{  
 final int speedlimit=90;//final variable  
 void run(){  
  speedlimit=400;  
 }  
 public static void main(String args[]){  
 Bike obj=new  Bike();  
 obj.run();  
 }  
}
```
2. Final method
- If you make any method as final, you cannot override it.

Example:
```java
class Bike{  
    final void run(){System.out.println("running");}  
}  
     
class Honda extends Bike{  
   void run(){System.out.println("running safely on 100kmph");}  
     
  public static void main(String args[]){  
    Honda honda= new Honda();  
    honda.run();  
  }  
}  
```

3. Final class 
- If you make any class as final, you cannot extent it.

Example:
```java
final class Bike{}  
  
class Honda1 extends Bike{  
  void run(){System.out.println("running safely with 100kmph");}  
    
  public static void main(String args[]){  
    Honda1 honda= new Honda1();  
    honda.run();  
  }  
}  
```

#### Abstract Method
- A method declared using the abstract keyword within an abstract class and does not have a definition (implementation) is called an abstract method.

- When we need just the method declaration in a super class, it can be achieved by declaring the methods as abstracts.

Syntax
```java
abstract return_type method_name( [ argument-list ] );  
```

Example:
```java
// abstract class  
abstract class Multiply {  
     
   // abstract methods   
   public abstract int MultiplyTwo (int n1, int n2);  
   public abstract int MultiplyThree (int n1, int n2, int n3);       
}  

class AbstractMethodEx1 extends Multiply {    
  public int MultiplyTwo (int num1, int num2) {  
    return num1 * num2;  
  }  
  public int MultiplyThree (int num1, int num2, int num3) {  
    return num1 * num2 * num3;  
  }   
  public static void main (String args[]) {  
    Multiply obj = new AbstractMethodEx1();  
    System.out.println ("Multiplication of 2 numbers: " + obj.MultiplyTwo (10, 50));  
    System.out.println ("Multiplication of 3 numbers: " + obj.MultiplyThree (5, 8, 10));  
  }  
}  
```

#### Abstract class
- A class which is declared with the abstract keyword is known as an abstract class in Java. It can have abstract and non-abstract methods (method with the body).

![AbstractClass](https://static.javatpoint.com/images/abstract-class-in-java.jpg)


Example:
```java
abstract class Bike{  
  abstract void run();  
}  

class Honda extends Bike{  
  void run(){System.out.println("running safely");}  
  public static void main(String args[]){  
    Bike obj = new Honda();  
    obj.run();  
  }  
}  
```

### Interface 
- The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

Why use Java interface?

![interface](https://static.javatpoint.com/interview/images/why-use-java-interface.jpg)

Syntax
```java
interface <interface_name>{  
      
    // declare constant fields  
    // declare methods that abstract   
    // by default.  
}  
```

Example:
```java
interface Bank{  
  float rateOfInterest();  
}  
class SBI implements Bank{  
  public float rateOfInterest(){return 9.15f;}  
}  
class PNB implements Bank{  
  public float rateOfInterest(){return 9.7f;}  
}  
class TestInterface2{  
  public static void main(String[] args){  
    Bank b=new SBI();  
    System.out.println("ROI: "+b.rateOfInterest());  
  }
} 
```
#### String
- String is a sequence of characters. But in Java, string is an object that represents a sequence of characters. The java.lang.String class is used to create a string object.

 
Two ways to create String object:

1. By string literal
```java
String s = "welcome";  
```
2. By new keyword
```java
String s = new String("Welcome");  
```

##### String class methods

|S.no.| Java Method | Syntax | Returns | Usage | 
|-----|-------------|--------|---------|-------| 
|1.|indexOf()|indexOf​(String str, int fromIndex)|int|For finding the index of the first occurrence of a character or a string in the given string. |
|2.|charAt()|charAt​(int index)|char|To get character at the specified index |
|3.|concat()|concat​(String str)|String|To append the passed string to the end of the given string.|
|4.|replace()|replace​(char oldChar, char newChar)|String|To replace all the occurrences of the given character/String from given String|
|5.|substring()|substring​(int beginIndex, int endIndex)|String|To get a part of a string from the given string.|
|6.|split()|split​(String regex,int limit)|String|For splitting the given string based on the given regular Expression.|
|7.|compareTo()|compareTo​(String anotherString)|int|To compare two Strings Lexicographically.|
|8.|strip()|strip()|String|To remove all trailing and leading whitespaces from the given string.|
|9.|valueOf()|valueOf​(char[] data)|String|To return String representation of the passed argument.|
|10.|isEmpty()|str.isEmpty()|boolean|To checks if the input string is empty or not.|
|11.|toLowerCase()|str.toLowerCase()|String|To returns the string in lowercase letter.|
|12.|toUpperCase()|str.toUpperCase()|String|To returns the string in uppercase letter.|
|13.|startsWith()|str.startsWith("F")|boolean|To checks if this string starts with the given prefix.|
|14.|endsWith()|str.endsWith("K")|boolean|To checks if this string ends with a given suffix. |


### Package

- A java package is a group of similar types of classes, interfaces and sub-packages.
Package in java can be categorized in two form, built-in package and user-defined package.

- There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.

Example:
```java
//save as Simple.java  
package mypack;  
public class Simple{  
  public static void main(String args[]){  
    System.out.println("Welcome to package");  
  }  
}  
```

#### Package Creation
- The package keyword is used to create a package in java.

```java
// package creation in java
package myPackage;

public class Package {
    public void show(){
        System.out.println("This is a package");
    }
    public static void main(String[] args) {
        Package obj1 = new Package();
        obj1.show(); 
    }
}
```

#### Calling a package
- The import keyword is used to make the classes and interface of another package accessible to the current package.

```java
import myPackage.Package;

class one {
    public static void main(String[] args) {
        Package o = new Package();
        o.show();
    }
}
```

### Exception Handling
- Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.

- The core advantage of exception handling is to maintain the normal flow of the application. An exception normally disrupts the normal flow of the application; that is why we need to handle exceptions.


#### Exception Class in Java
- An error is a problem, bug, or human-created mistake that arises at the time of execution of a program. An exception interrupts the flow of the program and terminates it abnormally. The termination of the program abnormally is not recommended, and for that, we need to handle these exceptions.

- Java provides Java.lang.Exception class for handling the exceptions which inherit the properties and methods of Object and Throwable class.

```java
class EXceptionClass extends Exception{
    public EXceptionClass(String string){
        super(string);
    }
}
public class test07{
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j==0){
                throw new EXceptionClass("Error exception class");
            }
        }catch (EXceptionClass e) {
            System.out.println(e);
        }
    }
}
```

#### User Defined Exception 
- In Java, we can create our own exceptions that are derived classes of the Exception class. Creating our own Exception is known as custom exception or user-defined exception. Basically, Java custom exceptions are used to customize the exception according to user need.

```java
class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        System.out.println(msg);
    }
}
public class test001 {
    public static void main(String[] args) {
        try {
            vote(5);
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public static void vote(int age) throws InvalidAgeException {
        if(age < 18){
            throw new InvalidAgeException("Not eligible for voiting");
        } else{
            System.out.println("Eligible for voting");  
        }
    }
}
```

#### Types of Java Exceptions

1. Checked Exception
- The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions. For example, IOException, SQLException, etc. Checked exceptions are checked at compile-time.

2. Unchecked Exception
- The classes that inherit the RuntimeException are known as unchecked exceptions. For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.


#### Types of Exception
![exceptions](https://prepbytes-misc-images.s3.ap-south-1.amazonaws.com/assets/1672052723981-Checked%20and%20unchecked%20exceptions%20in%20java1.png)

##### Exception Keywords

|Keyword|Description|
|-------|-----------|
|try|The "try" keyword is used to specify a block where we should place an exception code. It means we can't use try block alone. The try block must be followed by either catch or finally.|
|catch|The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.|
|finally|The "finally" block is used to execute the necessary code of the program. It is executed whether an exception is handled or not.|
|theow|The "throw" keyword is used to throw an exception.|
|throws|The "throws" keyword is used to declare exceptions. It specifies that there may occur an exception in the method. It doesn't throw an exception. It is always used with method signature.|

#### Difference between final, finally and finalize
![difference](https://miro.medium.com/v2/resize:fit:736/1*cI8tIyU0xmTnRJ72Ao2XqA.png)


### Wrapper classes in Java
- The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.
- Since J2SE 5.0, autoboxing and unboxing feature convert primitives into objects and objects into primitives automatically.

The eight classes of the java.lang package are known as wrapper classes in Java. 
|Primitive Type	|Wrapper class|
|--|--|
|boolean|	Boolean|
|char|Character|
|byte|Byte|
|short|Short|
|int|Integer|
|long|Long|
|float|Float|
|double|Double|

#### Autoboxing
- The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing, for example, byte to Byte, char to Character, int to Integer, long to Long, float to Float, boolean to Boolean, double to Double, and short to Short.

Example:
```java
public class WrapperExample1{  
  public static void main(String args[]){  
    //Converting int into Integer  
    int a=20;  
    Integer i=Integer.valueOf(a);//converting int into Integer  explicitly  
    Integer j=a;//autoboxing
  
    System.out.println(a+" "+i+" "+j);  
  }
}  
```

#### Unboxing
- The automatic conversion of wrapper type into its corresponding primitive type is known as unboxing. It is the reverse process of autoboxing.

Example:
```java
public class WrapperExample2{    
  public static void main(String args[]){    
    //Converting Integer to int    
    Integer a=new Integer(3);    
    int i=a.intValue();//converting Integer to int explicitly  
    int j=a;//unboxing, now compiler will write a.intValue() internally    
    
    System.out.println(a+" "+i+" "+j);    
  }
}  
```

#### StringBuffer Class
- Java StringBuffer class is used to create mutable (modifiable) String objects. The StringBuffer class in Java is the same as String class except it is mutable i.e. it can be changed.

- Methods of StringBuffer
1. StringBuffer Class append() Method
The append() method concatenates the given argument with this String.

Example:
```java
class StringBufferExample{  
  public static void main(String args[]){  
    StringBuffer sb=new StringBuffer("Hello ");  
    sb.append("Java");//now original string is changed  
    System.out.println(sb);//prints Hello Java  
  }  
}  
```

2. StringBuffer insert() Method
The insert() method inserts the given String with this string at the given position.

Example:
```java
class StringBufferExample2{  
  public static void main(String args[]){  
    StringBuffer sb=new StringBuffer("Hello ");  
    sb.insert(1,"Java");//now original string is changed  
    System.out.println(sb);//prints HJavaello  
  }  
} 
```

3. StringBuffer replace() Method
The replace() method replaces the given String from the specified beginIndex and endIndex.

Example:
```java
class StringBufferExample3{  
  public static void main(String args[]){  
    StringBuffer sb=new StringBuffer("Hello");  
    sb.replace(1,3,"Java");  
    System.out.println(sb);//prints HJavalo  
  }  
}  
```

4. StringBuffer delete() Method
The delete() method of the StringBuffer class deletes the String from the specified beginIndex to endIndex.

Example:
```java
class StringBufferExample4{  
  public static void main(String args[]){  
    StringBuffer sb=new StringBuffer("Hello");  
    sb.delete(1,3);  
    System.out.println(sb);//prints Hlo  
  }  
}  
```

5.  StringBuffer reverse() Method
The reverse() method of the StringBuilder class reverses the current String.

Example:
```java
class StringBufferExample5{  
  public static void main(String args[]){  
    StringBuffer sb=new StringBuffer("Hello");  
    sb.reverse();  
    System.out.println(sb);//prints olleH  
  }  
}  
```

### Covariant Return Type
- The covariant return type specifies that the return type may vary in the same direction as the subclass.

Example: 
```java
class X {
    X show() {
        System.out.println("method of x");
        return this;
    }
}

class Y extends X {
    Y show() {
        super.show();
        System.out.println("method of y");
        return this;
    }
}

class CovarientReturnType {
    public static void main(String[] args) {
        Y a = new Y();
        a.show();
    }
}
```