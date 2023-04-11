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
|8.|||
|9.|||
|10.|||
|11.|||
|12.|||
|13.|||
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

##### Final Variable
- If you make any variable as final, you cannot change the value of final variable(It will be constant).

Example:
```java
final int num = 5;
num = 20; // Will gererate an error: cannot assign a value to final variable num
```

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

##### Finalize() Method
- Finalize() is the method of Object class. This method is called just before an object is garbage collected. finalize() method overrides to dispose system resources, perform clean-up activities and minimize memory leaks.

Syntax
```java
protected void finalize() throws Throwable
// Throwable - the Exception is raised by this method
```

Example:
```java
public class Finalize {  
     public static void main(String[] args)   
    {   
        Finalize obj = new Finalize();   
        System.out.println(obj.hashCode());   
        obj = null;   
        // calling garbage collector    
        System.gc();   
        System.out.println("end of garbage collection");   
  
    }   
    @Override  
    protected void finalize(){   
        System.out.println("finalize method called");}   
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