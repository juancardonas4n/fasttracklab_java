# Java Essentials and Git Basics (**Modify the title with Java Essentials**)

## Objetives

* set up Java environment required for passing the course (depending on OS specifics)
* create a simple project with a console application and run examples provided in the course
* get the basics of the main types of primitives and strings
* become aware of the version control approach in programming (**Get rid of this**)
* gain the understanding of basic Git concepts (**Get rid of this**)
* practice essential Git commands directly from the console view (**Get rid of this**)

## Proposed Objectives

### You will achieve

* Apply Fundamental Types (Primitive type) in Java Programming Language
* Apply Object Values (String,StringBuilder) in Java Programming Languages
* Use a basic structure of basic console application
* Using an IDE to create, compile and execute a basic console application

### What you must know

* Basic understanding about programming
* Know what is a type
* Know what is a variable

### We expect that you learn

* Edit, compile and execute a basic Java console application

## Syllabus

* Java Essentials
  * Java History
    * Java Origins
    * Java Versions History
  * Principles and components of Java
    * Principles of Java
    * Runtime Architecture
    * Java Compared to C++
    * Java Compared to JavaScript
    * Java Editions
      * Java Platform, Standard Edition (SE)
      * Java Platform, Enterprise Edition (EE)
      * Java Platform, Micro Edition (ME)
    * Java Runtime Enviroment
    * Java SE Development Kit (JDK)
  * Java Syntax and compilation
    * Creating Java Classes
    * A Simple Java Class
      * Introduction concept `package`
      * Introduction concept `class`
      * Introduction concept main method (`method`)
    * Testing Code in JShell
    * Case Sensitivity
    * White Space (**Lexical interpretation compared with JShell where can be ommited**)
    * Identifiers and [Keywords ](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html)
    * Identifiers Conventions
    * Code blocks 
  * Memory Management and Garbage Collection
    * Automatic Memory Management
    * When References Expire
    * Tips for Managing Memory
      * `Runtime.maxMemory()` (This looks statict, but you must manage in this way `Runtime.getRuntime().maxMemory()`)
      * `Runtime.totalMemory()`(This looks statict, but you must manage in this way `Runtime.getRuntime().totalMemory()`)
    * Links: 
      * Java HotSpot VM
        * Serial: single thread
        * Parallel (aka throughput): multithread
        * Garbage-First (G1): For server environments
        * Concurrent Mark-Sweep (CMS): shorter pauses, share resources
      * [Garbage Collection](https://docs.oracle.com/javase/9/gctuning/introduction-garbage-collection-tuning.htm)
      * [Java JRockit Garbage Collect](https://docs.oracle.com/cd/E13150_01/jrockit_jvm/jrockit/geninfo/diagnos/garbage_collect.html#wp1086087)
      * [Java jrockit](https://docs.oracle.com/cd/E13150_01/jrockit_jvm/jrockit/geninfo/diagnos/)
* Java Environment
  * Choosing a development environment
    * Choosing an IDE
      * Any text editor
    * Editors and IDEs for macOS
      * BBEdit
      * TextWrangler
    * Editors and IDEs for Windows
      * TextPad
      * JCreator
    * Cross-Platform IDEs
      * Visual Studio Code
      * BlueJ (¿?)
      * NetBeans
      * Eclipse with Java Development Tools
      * *IntelliJ IDEA* 
  * Installing Java on Windows (**Interactive video, guiding how to install Java on Windows, on particular using PowerShell**)
  * Add Java to the system PATH on Windows (**Interactive video**)
    * [Java Environment](https://www.wikihow.com/Set-Up-a-Java-Programming-Environment)
  * Installing Java on OS X (**There must be a suggestion to change terminal application**)
  * Test simple Java code in JShell
* First Project in IDE
  * Install and configure Intellij IDEA (**Video works with an older version of IntelliJ IDEA version has differents features**)
  * Create a Project in IntelliJ IDEA (**Video works with an older version of IntelliJ IDEA version has differents features**). Project: HelloWorld
  * Pass arguments to project (**Introduction Array of Strings, foreach statement with an Arrray of Strings (args)**) Project: PassArgs
  * Take a tour of Intellij IDEA. Project: IDEATour
  * Use Java API Documentation. Project: APIDocs
* Numeric Variables
  * Work with primitive variables
    * What is a primitive variable? (**Object values, primitive values, differences**)
    * Declaring a primitive object
    * Numeric Primitive Data Types
    * Primitive Wrapper Classes (**package `java.lang` is explained**)
    * Wrapper Class Example (**Boxing and unboxing is not explained**)
    * Unsigned Integer (**Some classes Integer and Long can managed Unsigned Integer, because all numeric types are signed**)
  * Declare and Modify Primitive Values (**There is not an explanations about the real diference between Primitive and Object Types**)
    * `MIN_VALUE`, `MAX_VALUE`.
    * **Video explains that all numeric value are implemente in a circular manner, like an odometer**
  * Convert Values Between Numeric Type (**Convertion is not completed explained**)
    * **Double literals (d suffix)** 
    * **Widening**
    * **Narrowing**
    * **Convertion syntax (casting)**
  * Math Operators and the Math Class
    * [`Math` class](https://docs.oracle.com/javase/9/docs/api/java/lang/Math.html)
    * Definition of an `static` method.
    * `Math.round()`
    * `Math.abs()`
  * Store Currency Values with BigDecimals
    * **There are problems with the computations of decimal values**
    * `BigDecimal`
    * `BigInteger`
    * `new` operator
    * **Using `BigDecimal` enables work with decimal precision**
* Boolean Variables (**Change the title by Boolean Values, Characters Values and Basic operators**)
  * Working with Boolean Values
    * Literal boolean values: `true` y `false`.
    * **In Java is mandatory to initialize a variable with a value according to the type** 
    * `!` operator
    * compare operators produce a `Boolean` value
    * `String` to `Boolean` value
  * Work with Character Values
    * Diference between `String`, `char`, `Character` 
    * Relationship between `char`and Unicode code.
    * Array of characters (`char`) convert into a `String`
    * Initialize an array of characters with = `{}`
    * Obtain an array of characters from an `String`
  * More about Java Operators
    * General Rules of Operators
    * Type of Operators
      * Equality
      * Assigment
      * Mathematical
      * Logical
      * Ternary 
    * Assigments and Math
      * Assigment
      * Arithmetical operators
      * Incrementing and decrement (prefix and postfix)
      * Assigment operators with arithmetic operator
    * Equality Operators
    * Comparing Values
      * `instanceof`
    * Comparing `String`s
    * Logical Operator
* Working with String Values
  * Declare and initialize String objects
  * Create and Concatenate String values
  * Convert primitive values to String
  * Build a String from Multiple values
  * Compare String with Methods
    * `Scanner`
  * Formating Numeric Values as Strings
    * `FormatNumber`
    * `Locale`
    * `DecimalFormat`
  * Parser String Values
    * `length()`
    * `indexOf()`
    * `substring()`
    * `trim()`
    * Convertion
      * `Double.parseDouble()` (**Object value convert Primitive Value, wrapper clases, Boxing and Unboxing is not mentioned**)
  * Challenge: A Simple Calculator (Work with numeric variables, String values)
    * Challenge: A simple calculator
    *  Solution: A simple calculator

## Concepts with reference D1 Competency Matrix

​	

|       Skill        | D1 - Competency Level | Knowledge                                                    | Learned on the course                                        |
| :----------------: | --------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
|   Object, class    | 3                     | Able to describe reference types, classes and objects, inheritance, interfaces | Basic types: Primitives and Object values                    |
|       String       | 3                     | Able to describe `String` class in detail, its main methods and related classes (`StringBuilder`, `StringJoiner`, etc.) | `String` were explain, not in complete detail, an `StringBuilder` were introduced, with also `FormatNumber`, `Locale` and `DecimalFormat` |
| Garbage Collection | 1                     | Able to describe garbage collecting concept and generational garbage collecting | It only was described that object's cycle of life is manage automatically with garbage collection. Some references to basic garbage collection. The subject about generational garbage collection wasn't cover. |

## Evaluation