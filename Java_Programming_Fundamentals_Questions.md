# Java Programming Fundamentals Questions

## Managing Programming Flow

### Evaluation Conditions with `if-then-else`

1. Look at the below code snippet
```java
// Variables a and b have defined and initialized previously
if (a > 10)
   if (b > 20)
      System.out.println("Both values are correct");
   else 
      System.out.println("At least one value is incorrect");
else
   System.out.println("At least one value is incorrect");
```

>> Which one of the following code snippet has the same meaning that code above <<

(X) A.
```java
if (a > 10 && b > 20)
   System.out.println("Both values are correct");
else
   System.out.println("At least one value is incorrect");
```
( ) B.
```java
if (a > 10 || b > 20)
   System.out.println("Both values are correct");
else
   System.out.println("At least one value is incorrect");
```
( ) C.
```java
if (a > 10 and b > 20)
   System.out.println("Both values are correct");
else
   System.out.println("At leat one value is incorrect");
```
( ) D.
```java
if (a > 10 or b > 20)
   System.out.println("Both values are correct");
else
   System.out.println("At least one value is incorrect");
```

[explanation]

The question code snippet is an extended version of the operator and (`&&`). Therefore, the answer is option A.

[explanation]

2. Look at the below code snippet
```java
// Variables a and b have defined and initialized previously
if (a < 10 || b < 20)
   System.out.println("At least one value is correct");
else
   System.out.println("Both values are incorrect");
```

>> Which one of the following code snippet has the same meaning that code above <<

( ) A.

```java
if (a < 10)
   if (b < 20)
      System.out.println("At least one value is correct");
   else
      System.out.println("At least one value is correct");
else
   System.out.println("Both values are incorrect");
```
( ) B.

```java
if (a < 10)
   if (b < 20)
     System.out.println("At least one value is correct");
   else
     System.out.println("Both values are incorrect");
else
   System.out.println("Both values are incorrect");
```
(X) C.

```java
if (a < 10)
   System.out.println("At least one value is correct");
else if (b < 20)
   System.out.println("At least one value is correct");
else
   System.out.println("Both values are incorrect");
```
( ) D.

```java
if (a < 10 )
   if (b < 20) {
      System.out.println("At least one value is correct");
   }
else 
   System.out.println("Both values are incorrect");
```
[explanation]
The question code snippet uses an or (`||`) operator to join both conditions.. This can be managed by using two `if` statements in cascade like is represented by option C. It first checks whether `if`statement is valid, therefore the first `if` body is executed. The other way, if the first conditional is not valid the first `else` statement  part is executed and the second `if`statement is validad, if that is true, the second `if`body is executed, but if the second condition is false therefore the last `else` statement is executed. 
[explanation]

3.  The next snippet code is using negative logic
```java
if (!(a != b)) 
   System.out.println("Hey, bro!");
else
   System.out.println("Bye, bro!");
```

>> Choose one of the following code snippet that has the same behavoir of previous code snippet <<

( ) A.
```java
if (a != b) 
   System.out.println("Hey, bro!");
else
   System.out.println("Bye, bro!");
```
( ) B.

```java
if (a == b)
   System.out.println("Bye, bro!");
else
   System.out.println("Hey, bro!");
```
( ) C.
```java
if (!(a == b))
   System.out.println(", bro!");
else
   System.out.println("Hey, bro!");
```
(X) D.
```java
if (a == b)
   System.out.println("Bye, bro!");
else
   System.out.println("Hey, bro!");
```
[explanation]
The original conditional is double negation `(!(a!=b))` that transformed produce `a==b` but the body is kept it.
[explanation]

4. An `if-then-else` statement at least has constructor `if`, a condiction, a then-body and an else-body, this last option.

>> A condition is an expression, which is the type of the conditional <<

( ) A. `int`
( ) B. `void`
(X) C. `boolean`
( ) D. `String`

[explanation]
By definition a conditional expression is the `boolean` type.
[explanation]

### Evaluate conditions with `switch-case`statement

5. Look at the following code
```java
switch (a) {
case 0:
case 1:
   b = 0;
case 2:
case 3:
   b = 1;
   break;
case 4:
   b = 0;
case 5:
case 6:
case 7:
   b = 2;
case 8:
case 9:
default: 
   b = 3;
   break;
}
```

>> if variable `a` is initialized with the value `4`before the switch, which is the value of variable `b` <<

( ) A. `0`
( ) B. `1`
( ) C. `2`
(X) D. `3`

[explanation]
The `switch-case` is a simple structure of control, when it examines the value variable `a`, which is `4`, it going to jump directly to label  `case 4:` and then it assign to the variable `b` the value `0`, but the flow control goes on to the next assignation `b = 2;`, then the value of variable `b` is changed, but the flow control continues to the next assign statement `b = 3;`. Therefore, the final value of `b`is `3`.
[explanation]

6. The  `switch-case` statement transfers control to one of several statements depending on the value of an expression

>> There are two kinds of switch labels, `case` labels and `default`labels. You can add one o more `case` labels, how many `default` labels can add.

[X] A. Zero, It can be ommitted.
[X] B. One at most
[ ] C. Two or more.

[explanation]
By definition, at most one `default`label is associated with the switch statement.
[explanation]

7. The `switch-case` statement uses the value of an expression to determine transfer control.

>> Which one of these types cannot be used as type of expression of a `switch-case` <<

( ) A.  `String`
( ) B. `short`
( ) C. `byte`
(X) D. `long`

[explanation]
The basic type for `switch-case` statement is an `int`(intenger) type, but any other types than can be promoted to a `int` can be used as type in a `switch-case` statement. But, Since the Java version 9, the `String` type can be used as type in a `switch-case`statement. A `long` type cannot be promoted to `int`. Therefore, option D is valid.
[explanation]

8. Take a look at the following snippet code:

```java
public enum Value { One, Two, Three };

Value value = Value.One;
```

>> Which one of the following snippet codes is correct <<

( ) A.
```java
switch (value) {
case Value.One: System.out.println("One"); break;
case Value.Two: System.out.println("Two"); break;
case Value.Three: System.out.println("Three"); break;
}
```

(X) B.
```java
switch (value) {
case One: System.out.println("One"); break;
case Two: System.out.println("Two"); break;
case Three: System.out.println("Three"); break;
}
```

( ) C.
```java
switch (value) {
case 1: System.out.println("One"); break;
case 2: System.out.println("Two"); break;
case 3: System.out.println("Three"); break;
}
```

( ) D.
```java
switch (value) {
case "One": System.out.println("One"); break;
case "Two": System.out.println("Two"); break;
case "Three": System.out.println("Three"); break;
}
```

[explanation]
If the type of the switch statement's Expression is an enum type, then every case constant associated with the switch statement must be an enum constant of that type without qualification.
[explanation]


9. [String switch case]
<!-- TODO Add this question -->

### Create looping code blocks

10. The most basic loop statement in Java is the `while` loop. This loop statement uses a special kind of variable in order to manage the loop named variable loop control. In order for a loop ends that variable must be controled in three different ways

>> Which are those actions of variable loop control in a loop <<

( ) A. Declare, Increment and Decrement
( ) B. Invoke, Assign and Instantiate
(X) C.Initialize, Test and Change
( ) D. Define, Boxing and Unboxing

[explanation]
A variable loop control must be initalized, tested in a condiction and change inside the loop body.
[explanation]

11. Look at the next code snippet
```java
for (int i = 0; i < N; i++) {
   System.out.println("i: " + i);
   i++;
}
```

>> Which one of the following code snippet have the same semantic that the above code snippet<<

( ) A. 
```java
do {
   int i = 0;
   System.out.println("i: " + i);
   i++;
} while (i < N);
```
(X) B.
```java
int i = 0;
while (i < N) {
   System.out.println("i: " + i);
   i++;
}
```
( ) C.
```java
for (int i: N) {
   System.out.println("i: " + i);
}
```
( ) D.
```java
int i = 0;
until (i == N) {
   System.out.println("i: "  + i);
   i++;
}
```

[explanation]
A `for` statement can transformer into a `while` statement. The `has` is composed of threee elements, an initialization expression `<init>`, a conditional expression `<cond>` and a change expresssion `<incr>`: `for (<init>; <cond>; <incr>) <body>`, then the for can be transformed into:
```java
<init>
while (<cond>) {
   <body>
   <incr>
}
```
[explanation]

12. See the next shape
```java
*****
****
***
**
*
```

>> Which one of the following code snippet produce the expected shape <<


[X] A.
```java
for (int i = 0; i < 5; i++) {
   for (int j = i; j < 5; j++) 
      System.out.print('*');
   System.out.println();
}
```

[ ] B.
```java
for (int i = 0; i < 5; i++) {
   for (int j = 0; j < 5; j++) 
      System.out.print('*');
   System.out.println();
}
```

[X] C.
```java
for (int i = 5; i > 0; i--) {
   for (int j = (5 - i); j < 5; j++) 
      System.out.print('*');
   System.out.println();
}
```

[X] D.
```java
for (int i = 5; i > 0; i--) {
   for (int j = i; j > 0; j--) 
      System.out.print('*');
   System.out.println();
}
```

[explanation]
Option A, output:
```java
*****
****
***
**
*
```
Option B, output:
```java
*****
****
***
**
*
```
Option C, output:
```java
*****
*****
*****
*****
*****
```
Option C, output:
```java
*****
****
***
**
*
```
[explanation]



13. Read the following code snippet

```java
for (int i = 0; i <= 5; i++) {
   for (int j = 0; j < 5 - i; j++)
      System.out.print(' ');
   for (int j = 0; j < 2 * i; j++)
      System.out.print('*');
   System.out.println();
}
```

>> What is the output of below code <<

( ) A.
```java
        **
      ****
    ******
  ********
**********
```

( ) B.
```java
**
****
******
********
**********
```

( ) C.
```java
     *
    ***
   *****
  *******
 *********
**********
```

(X) D.
```java
    **
   ****
  ******
 ********
**********
```

[Explanation]

Next table show how the program iterates, the light lines show the first `for` loop with variable `j`, the dark lines shows the second loop with variable `j` 

| `i`  | `j` times | Spaces | Asterisks |    Output    |
| :--: | :-------: | :----: | :-------: | :----------: |
|  0   |     5     |   5    |     0     |              |
|  0   |     0     |   0    |     0     |              |
|  1   |     4     |   4    |     0     |              |
|  1   |     2     |   0    |     2     |     `**`     |
|  2   |     3     |   3    |     0     |              |
|  2   |     4     |   0    |     4     |    `****`    |
|  3   |     2     |   2    |     0     |              |
|  3   |     6     |   0    |     6     |   `******`   |
|  4   |     1     |   1    |     0     |              |
|  4   |     8     |   8    |     8     |  `********`  |
|  5   |     0     |   0    |     0     |              |
|  5   |    10     |   0    |    10     | `**********` |

Take the output produced on the above table, we obtain:

```java
    **
   ****
  ******
 ********
**********
```

[Explanation]

14. Look at the next code

```java
int function(int value) {
   int res = 0;
   int next = 1;
   for (int i = 0; i < value; i++) {
      int tmp = res;
      res = next;
      next += tmp;
   }
   return res;
}
```

>> If you execute the previous instruction in this way `function(5)`, which is the result that function returns <<

( ) A. 2
( ) B. 4
(X) C. 5
( ) D. 8

[explanation]
The next desk check shows the execution of `function(5)`. 

| `value` | `res` | `next` | `i`  | `tmp` |
| :-----: | :---: | :----: | :--: | :---: |
|    5    |       |        |      |       |
|         |   0   |   1    |      |       |
|         |       |        |  0   |       |
|         |   1   |   1    |      |   0   |
|         |       |        |  1   |       |
|         |   1   |   2    |      |   1   |
|         |       |        |  2   |       |
|         |   2   |   3    |      |   1   |
|         |       |        |  3   |       |
|         |   3   |   5    |      |   2   |
|         |       |        |  4   |       |
|         |   5   |   8    |      |   3   |
|         |       |        |  5   |       |

 Following the above code we get the last value of `res`, which is  `5`. 

[explanation]

15. Take a look at next code snippet
```java
Scanner scan = new Scanner(System.in);
int value = 0;
int nr = 0; // current number of retries
int R = 3;
System.out.println("Enter a value between 0 and 5");
value = scan.nextInt();
do {
   if (nr == R) {
      System.out.println("You have reached the maximum number of retries");
      value = -1;
      break;
   }
   if (value >= 0 && value <= 5) break;
   nr++;
   System.out.println("Enter a value between 0 and 5");
   value = scan.nextInt();
} while (true);
```
>> The above code show how try to read a particular value a maximum number of retries. That code uses `do-while` loop. Which one of the following code has the same behavior that the above code <<

[X] A.
```java
Scanner scan = new Scanner(System.in);
int value = 0;
int nr = 0; // current number of retries
int R = 3;
for (;true;) {
   System.out.println("Enter a value between 0 and 5");
   value = scan.nextInt();
   if (value >= 0 && value <= 5) break;
   nr++;
   if (nr == R) {
      System.out.println("You have reached the maximum number of retries");
      value = -1;
      break;
   }
}
```

[X] B.
```java
Scanner scan = new Scanner(System.in);
int value = 0;
int nr = 0; // current number of retries
int R = 3;
while (true) {
   System.out.println("Enter a value between 0 and 5");
   value = scan.nextInt();
   if (value >= 0 && value <= 5) break;
   nr++;
   if (nr == R) {
      System.out.println("You have reached the maximum number of retries");
      value = -1;
      break;
   }
}
```

[X] C.
```java
Scanner scan = new Scanner(System.in);
int value = 0;
int nr = 0; // current number of retries
int R = 3;
for (;true;nr++) {
   if (nr == R) {
      System.out.println("You have reached the maximum number of retries");
      value = -1;
      break;
   }
   System.out.println("Enter a value between 0 and 5");
   value = scan.nextInt();
   if (value >= 0 && value <= 5) break;
}
```

[X] D.
```java
Scanner scan = new Scanner(System.in);
int value = 0;
int nr = 0; // current number of retries
int R = 3;
while (true) {
   if (nr == R) {
      System.out.println("You have reached the maximum number of retries");
      value = -1;
      break;
   }
   System.out.println("Enter a value between 0 and 5");
   value = scan.nextInt();
   if (value >= 0 && value <= 5) break;
   nr++;
}
```
[explanation]
A `do-while` can be describe in this way:
```java
do {
   <body>
} (<cond>);
```
It can be translated into a `while` loop structure:
```java
<body>
while (<cond>) {
   <body>
}
```
It means that the option D is correct.

Also, it can be translated into a `for` loop structure:
```java
<body>
for (;<cond>;) {
   <body>
}
```

It also means that the option C is correct.

The option A is similar to option C, but the `<body>` were reorder but it works similar, therefore option A is valid.
The option B is similiar to option D, but the `<body>` were reorder but it works in the same way, that means that also option B is valid.
[explanation]

16. Look at next code snippet

```java
String unArray[] = {"First", "Two", "Three", "Four", "Five"};

for (int i = 0; i < unArray.length, i++) {
   System.out.println(unArray[i]);
}
```

>> Which one of the following code snippet uses correctly a foreach loop (`for`) <<

( ) A.
```java
foreach (s: unArray) {
   System.out.println(unArray[s]);
}
```
( ) B. 
```java
for (int i: unArray) {
   System.out.println(unArray[i]);
}
```
( ) C.
```java
for (s: unArray) {
   System.out.println(s);
}
```
(X ) D.
```java
for (String s: unArray) {
   System.out.println(s);
}
```

[explication]
The foreach structure in Java has this way:
```java
for (<Type> <var>: <Collection[Type]>) {
   <body>
}
```
The code of option D follows that structure.
[explication]

17. The next code define an Array of Arrays of String.
```java
String[][] anArrayofArray = ...
```
>> How you can initialize such Array of Arrays of String<<

[X] A.
```java
String[][] anArrayofArray = new String[2][2];
```
[X] B.
```java
String[][] anArrayofArray = { {"One", "Two"}, {"Three", "Four"}};
```
[ ] C.
```java
String[][] anArrayofArray = { "One", "Two", "Three", "Four"}
```
[ ] D.
```java
String[][] anArrayofArray = [ ["One", "Two"], ["Three", "Four"]]
```
[explanation]
In Java an Array is an object, that object is dinamically created. The first option creates an Array of two dimensions each value is initiaized with null elemets.
The second option uses syntactic sugar in order to create and initialize an array of two dimensions.
The third option has system type error, the syntactic sugar on assignation right-hand side produce a value of one dimension, whereas left-hand side is two dimension array.
The fourth option the right-hand side part is syntactically incorrect.
[explanation]


17. The following snippet of code shows how to declare an two-dimension array of integers and obtain the sum of alls its elements.
```java
int[][] ia2D =  ... ;
int sum = 0;
for (int[] inner: ia2D)
   for (int value : inner) sum += value
```

>> Which one of the following snippet of code obtains the sums of all elements from array `ia2D`<<

( ) A.
```java
for (int i = 0; i < ia2D[][i].length; i++)
   for (int j = 0; j < ia2D[j][].length; j++)
      sum += ia2D[i][i];
```
( ) B.
```java
for (int i = 0; i < ia2D[][].length; i++) 
    for (int j = 0; j < ia2D[i][].length; j++)
       sum += ia2D[i][j];
```
(X) C.
```java
for (int i = 0; i < ia2D.length; i++)
   for (int j = 0; j < ia2D[i].length; j++)
      sum += ia2D[i][j];
```
( ) D.
```java
for (int i = 0; i < ia2D[].length; i++)
    for (int j = 0; j < ia2D[j][].length; j++)
       sum += ia2D[i][j]
```

[explanation]
A two-dimension array in Java, its an array of arrays. This means that most extern array contains an array of integers. In order know the size of the array of arrays we use `ai2D.length` and the for each array we get its size by `ai2D[i].lenght`.
[explanation]

18. An array of characters is shown on the following snippet of code
```java
char chars[] = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
```
>> An array of chars is an String <<

( ) True.
(X) False.

[explanation]
A char array in Java is an object with a fixed size but mutable on its elements, whereas a String is an object with a fixed size but immutable on its elements.
An char array in Java is different thant an char array in C, in this former language an array is a region of memory ending by null caracter indicating the last element of the array, but in Java and char array is an object that contains other fields like `length`.
[explanation]

19. Look at following snippet of code
```java
int i = 0, sum  = 0;
while (i < 7) {
   if (i % 3 == 0) continue;
   if (i == 5) break;
   sum += i;
   i++;
}
```

>> Which is final value of variable sum<<

( ) A. 3
( ) B. 7
( ) C. 14
(X) D. Undefined

[explanation]
Undefined because when value of i is module `3` the variable `i` doesn't change, and loop never ends. If you see the deck check you can observer that when `i=3` the loop engaged in a infinite loop.

|   line   |   `i`    |  `sum `  |
| :------: | :------: | :------: |
|    1     |    0     |    0     |
|    2     |    0     |    0     |
|    3     |    0     |    0     |
|    4     |    0     |    0     |
|    5     |    1     |    0     |
|    6     |    1     |    0     |
|    2     |    1     |    0     |
|    3     |    1     |    0     |
|    4     |    1     |    0     |
|    5     |    1     |    1     |
|    6     |    2     |    1     |
|    2     |    2     |    1     |
|    3     |    2     |    1     |
|    4     |    2     |    1     |
|    5     |    2     |    3     |
|    6     |    3     |    3     |
|    2     |    3     |    3     |
|    3     |    3     |    3     |
|    2     |    3     |    3     |
|    3     |    3     |    3     |
|    2     |    3     |    3     |
|    3     |    3     |    3     |
|    2     |    3     |    3     |
|    3     |    3     |    3     |
| $\vdots$ | $\vdots$ | $\vdots$ |

[explanation]

20. Loot at following snippet of code
```java
int sum = 0;
for (int i = 0; i < 7; i++) {
   if (i % 2 == 0) continue;
   if (i == 5) break;
   sum += i;
   i++;
}
```

>> Which is final value of variable sum<<

( ) A. 1
( ) B. 3
( ) C. 4
(X) D. Undefined

[explanation]

The programs ignores each value of i when it is even. [1,3,5], but when `i=5`the loop ends. Therefore, it sums `1 + 3 = 4`.

[explanation]

21 . Sometimes, the better way to read a sequence of values is using an `Scanner` associated with `System.in` (Standard input).Usuallyt, the number of elements to read is unknown.

> > 

```java
```
22. Bad
23. Very bad

