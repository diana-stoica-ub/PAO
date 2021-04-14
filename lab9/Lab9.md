# Multithreading

Java provides built-in support for multithreading.

- A **thread** is actually a lightweight process. A multithreaded program contains two or more
parts that can run concurrently. Each part of such a program is called a thread and each
thread defines a separate path of the execution.
- **Multithreading** is a specialized form of multitasking.
- Thread => set of instructions executed in a clear, defined order and independent 
and parallel of other sets of instructions of the same application program.

When we have only one thread in our program => we call it “a single threaded program”. 

In Java the first thread, the one that starts with the main method is also called **main thread**.
When we say that we have a single threaded application in Java => it means that we have an
application that starts from the main method and doesn’t create any other threads. 

We discuss here only about the threads created by us in the application program. 
There are also other threads managed by the JVM, such as the thread on which runs the 
java garbage collector.

The Java run-time system depends on threads for many things. Threads reduce inefficiency by
preventing the waste of CPU cycles.

When we have multiple threads, we have no way of knowing the order their code will be executed.

#### Defining and Starting a Thread

An application that creates an instance of Thread must provide the code that will run in that
thread.

There are two ways of doing that:

###### Subclass Thread

The Thread class itself implements Runnable, though its run method does nothing. An
application can subclass Thread, providing its own implementation of run.

This approach is easier to use in simple applications, but is limited by the fact 
that your task class must be a descendant of Thread.


###### Provide a Runnable object

The Runnable interface defines a single method, run, meant to contain the code
executed in the thread. The Runnable object is passed to the Thread constructor

This approach is more general, because the Runnable object can subclass a class other 
than Thread.

#### Threads states:
- **New** - When we create an instance of Thread class, a thread is in a new state.
- **Running** - The Java thread is in a running state.
- **Suspended** - A running thread can be suspended, which temporarily suspends its
activity. A suspended thread can then be resumed, allowing it to pick up where it left off.
- **Blocked** - A Java thread can be blocked when waiting for a resource.
- **Terminated** - A thread can be terminated, which halts its execution immediately at any
given time. Once a thread is terminated, it cannot be resumed.

###### Pausing Execution with Sleep:
- _Thread.sleep_ causes the current thread to suspend execution for a specified period.
- This is an efficient means of making processor time available to the other threads of an
application or other applications that might be running on a computer system.
- The sleep method can also be used for pacing;

#### Wait & notify

- Object.wait() – used to suspend a thread
- Object.notify() – used to wake a thread up
- Object.notifyAll() - used to wake all the threads up

####  Interrupts:
- An interrupt is an indication to a thread that it should stop what it is doing and do
something else. It's up to the programmer to decide exactly how a thread responds to an
interrupt, but it is very common for the thread to terminate.
- A thread sends an interrupt by invoking interrupt on the Thread object for the thread to
be interrupted. For the interrupt mechanism to work correctly, the interrupted thread
must support its own interruption.

###### Supporting Interruption:
- If the thread is frequently invoking methods that throw InterruptedException, it simply
returns from the run method after it catches that exception.

- Many methods that throw InterruptedException, such as sleep, are designed to cancel
their current operation and return immediately when an interrupt is received.

- What if a thread goes a long time without invoking a method that throws
InterruptedException? Then it must periodically invoke Thread.interrupted, which returns
true if an interrupt has been received.

#### Joins
- The join method allows one thread to wait for the completion of another. 
- If t is a Thread object whose thread is currently executing, _t.join();_ causes 
the current thread to pause execution until t's thread terminates.


#### Synchronization
- Threads communicate primarily by sharing access to fields and the objects reference
fields refer to. This form of communication is extremely efficient, but makes two kinds of
errors possible: thread interference and memory consistency errors. The tool needed to
prevent these errors is **synchronization**.
- However, synchronization can introduce thread contention, which occurs when two or
more threads try to access the same resource simultaneously and cause the Java
runtime to execute one or more threads more slowly, or even suspend their execution.
Starvation and livelock are forms of thread contention.


##### Synchronized Methods
- The Java programming language provides two basic synchronization idioms:
synchronized methods and synchronized statements.
To make a method synchronized, simply add the **_synchronized_** keyword to its declaration.

=> it is not possible for two invocations of synchronized methods on the same object to
interleave. 
When one thread is executing a synchronized method for an object, all other threads
that invoke synchronized methods for the same object block suspend execution until the 
first thread is done with the object.
When a synchronized method exits, it automatically establishes a happens-before 
relationship with any subsequent invocation of a synchronized method for the same object. This guarantees
that changes to the state of the object are visible to all threads.
Note that constructors cannot be synchronized - using the synchronized keyword with a
constructor is a syntax error. 
Synchronizing constructors doesn't make sense, because only the thread that creates 
an object should have access to it while it is being constructed.

##### Synchronized Blocks

Alongside methods, we can also have synchronized blocks of code that follow the same 
principles.

#### Deadlock
- Deadlock describes a situation where two or more threads are blocked forever, waiting
for each other.

