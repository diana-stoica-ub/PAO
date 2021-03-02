# Arrays. Siruri de caractere

#### Arrays

- colectie ordonata de date de acelasi tip


#### String

- Strings are Objects that are backed internally by a char array. 
- Strings are immutable. Whenever a change to a String is made, an entirely new String is created.
- https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/String.html

#### StringBuilder

- The StringBuilder represents a mutable sequence of characters. Since the String Class in Java
  creates an immutable sequence of characters, the StringBuilder class provides an alternative to
  String Class, as it creates a mutable sequence of characters.
- https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/StringBuilder.html

#### StringBuffer

- The StringBuffer represents a mutable sequence of characters. String buffers are safe for use
  by multiple threads. The methods are synchronized where necessary so that all the operations
  on any particular instance behave as if they occur in some serial order that is consistent with the
  order of the method calls made by each of the individual threads involved.
- https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/StringBuffer.html


#### Is Java “pass-by-reference” or “pass-by-value”?

- Java is always **pass-by-value**.
- object parameters are actually references (which are passed by value)


#### Immutability 

-  Once an object is created, we cannot change its content. All the wrapper classes (like
Integer, Boolean, Byte, Short) and String class are immutable.
- We can create our own immutable class as well by following the rules:
◆ Make your class final, so that no other classes can extend it.
◆ Data members in the class must be declared as final (so that they’re initialized
only once inside the constructor and never modified afterward)
◆ Define a parameterized constructor
◆ Getter methods for all the variables in the class
◆ Don’t expose setter methods (to not have the option to change the value of the
instance variable)
◆ When exposing methods which modify the state of the class, you must always
return a new instance of the class.
◆ If the class holds a mutable object:
● Inside the constructor, make sure to use a clone copy of the passed
argument and never set your mutable field to the real instance passed
through the constructor, this is to prevent others who pass the object from
modifying it afterwards.
● Make sure to always return a clone copy of the field and never return the
real object instance.


