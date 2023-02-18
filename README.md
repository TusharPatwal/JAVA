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

```
// First Java program
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```
- Every line of code that runs in Java must be inside a <b>class</b>.
- The <b>main()</b> method is required and you will see it in every Java program:
```
public static void main(String[] args)
```
- Any code inside the <b>main()</b> method will be executed.

<hr>

### Output
##### System.out.println()
- Inside the main() method, we can use the println() method to print a line of text to the screen
```
// for strings
System.out.println("Hello World!");

// for numbers
System.out.println(500);
```
- When you are working with text, it must be wrapped inside double quotations marks " ".

##### System.out.print()
- There is also a print() method, which is similar to println(). The only difference is that it does not insert a new line at the end of the output.
```
// for strings
System.out.print("Hello World!");

// for numbers
System.out.print(500);
```

### Java Comments
Comments can be used to explain Java code, and to make it more readable. It can also be used to prevent execution when testing alternative code.

##### Single-line Comments
- Single-line comments start with two forward slashes (//).
```
// This is a comment
System.out.println("Hello World");
```

##### Multi-line Comments
- Multi-line comments start with /* and ends with */.
```
/* The code 
below will print the 
words Hello World */
System.out.println("Hello World");
```
### Variables

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

```
// Boolean Data Type
Boolean one = false; 

// Char Data Type
char letterA = 'A';

// Byte Data Type 
byte a = 10, b = -20;

// Short Data Type
short s = 10000, r = -5000;

// Int Data Type
int a = 100000, b = -200000;

// Long Data Type
long a = 100000L, b = -200000L;

// Float Data Type
float f1 = 234.5f;

// Double Data Type
double d1 = 12.3; 
```