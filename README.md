# JAVA

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
### Data Types

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

##### Final Variable
- If you make any variable as final, you cannot change the value of final variable(It will be constant).

Example:
```java
final int num = 5;
num = 20; // Will gererate an error: cannot assign a value to final variable num
```

#### Type casting
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

#### Input 

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