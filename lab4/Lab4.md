# Aggregation & Composition. Abstract classes & Interfaces

In Object-Oriented programming, an Object communicates with other Objects to use
functionality and services provided by that object.
Composition and Aggregation are the two forms of association.


#### Aggregation 

- represents a Has-A relationship.
- It is a unidirectional association, eg: a department can have students
- both entries can survive individually which means ending one entity will not affect the
other entity

#### Composition

- It represents part-of relationship.
- In composition, both the entities are dependent on each other.
- the contained class cannot exist independently of the container. If the container is destroyed, the child is also destroyed

#### Interfaces

- keyword: interface
- can only contain method signatures and constant fields (public static final -  constants; have to be initialised)
- since Java 8 - we can provide default implementation for methods (keyword: default)
- methods and fields are all public (even if the public keyword is missing)
- access modifiers: public or default package
- before using an interface, we need a class to implement it (an interface cannot be instantiated on its own!) - keyword: implements
- a class can implement multiple interfaces
- a class that implements an interface must implement all its methods (except default ones)
- interfaces can have static methods; they need to be implemented
- an interface can inherit other interfaces (keyword: extends)

#### Abstract classes

- keyword: abstract
- class that can contain 'abstract' methods (without implementation)
- can contain non-constant fields
- can use different access modifiers (not everything is public by default, like with interfaces)
- can have constructors, but can't be instantiated!

#### Generics

Java Generic methods and generic classes enable programmers to specify, 
with a single method declaration, a set of related methods, 
or with a single class declaration, a set of related types, respectively.

Generics also provide compile-time type safety that allows programmers to catch invalid 
types at compile time.

Using Java Generic concept, we might write a generic method for sorting an array 
of objects, then invoke the generic method with Integer arrays, 
Double arrays, String arrays and so on, to sort the array elements.

###### Generic methods

You can write a single generic method declaration that can be called with arguments 
of different types. Based on the types of the arguments passed to the generic method,
 the compiler handles each method call appropriately. Following are the rules to define 
 Generic Methods:

- All generic method declarations have a type parameter section delimited by angle 
brackets (< and >) that precedes the method's return type ( < E > in the next example).
- Each type parameter section contains one or more type parameters separated by commas. 
A type parameter, also known as a type variable, is an identifier that specifies a 
generic type name.
- The type parameters can be used to declare the return type and act as placeholders for 
the types of the arguments passed to the generic method, which are known as actual 
type arguments.
- A generic method's body is declared like that of any other method. Note that type 
parameters can represent only reference types, not primitive types 
(like int, double and char).

###### Bounded types parameters

There may be times when you'll want to restrict the kinds of types that are allowed to 
be passed to a type parameter. For example, a method that operates on numbers might 
only want to accept instances of Number or its subclasses. This is what bounded type 
parameters are for.

To declare a bounded type parameter, list the type parameter's name, followed by 
the extends keyword, followed by its upper bound. 

You can use super keyword for lower bound.

###### Generic classes/interfaces

A generic class declaration looks like a non-generic class declaration, except that the 
class name is followed by a type parameter section.

As with generic methods, the type parameter section of a generic class can have one or 
more type parameters separated by commas. These classes are known as parameterized 
classes or parameterized types because they accept one or more parameters.


More about generics: https://docs.oracle.com/javase/tutorial/java/generics/index.html

#### Comparable and Comparator

Java provides two interfaces to sort objects using data members of the class:
Comparable and Comparator.

###### Comparable

A comparable object is capable of comparing itself with another object. The class itself
must implement the java.lang.Comparable interface to compare its instances. This
interface imposes a total ordering on the objects of each class that implements it. This
ordering is referred to as the class's natural ordering, and the class's compareTo method
is referred to as its natural comparison method.

**_public int compareTo(Object obj):_** It is used to compare the current object with the
specified object. It returns:

- positive integer, if the current object is greater than the specified object.
- negative integer, if the current object is less than the specified object.
- zero, if the current object is equal to the specified object.

###### Comparator

Unlike Comparable, Comparator is external to the element type we are comparing. 
It’s a separate class. We create multiple separate classes (that implement Comparator) to
compare by different members.

To compare movies by Rating, we need to do 3 things :
- Create a class that implements **_Comparator_** (and the **_compare()_** method that
does the work previously done by compareTo()). The compare() method in Java
compares two class specific objects (x, y) given as parameters. It returns the
value:

■ 0: if (x==y)

■ -1: if (x < y)

■ 1: if (x > y)

- Make an instance of the Comparator class.
- Call the overloaded sort() method, giving it both the array and the instance of the
class that implements Comparator.


