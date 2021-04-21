# Java Sockets. Server-Client model

Socket programming refers to writing programs that execute across multiple computers
in which the devices are all connected to each other using a network.

#### Communication protocols

There are two communication protocols that one can use for socket programming: User
Datagram Protocol (UDP) and Transfer Control Protocol (TCP).
- _UDP_ is connectionless = there is no session between the base.client and the base.server; faster but not reliable
- _TCP_ is connection-oriented = an exclusive connection must first be established
between base.client and base.server for communication to take place; slower, but reliable

#### What is a port?

Port is a part of the transport layer and helps in network communication. 
A port is a logical identifier assigned to a process in order to identify that process uniquely 
in a network system. 

When two network devices communicate, they do so by sending packets to each other. 
Each packet received by a receiver device contains a port number that uniquely identifies 
the process where the packet needs to be sent.

Not all the network protocol uses a port for communication. 
But protocols like TCP, UDP, HTTP utilize a port for communication.

https://www.baeldung.com/cs/port-vs-socket

#### Sockets programming over TCP/IP networks:
CLIENT - SERVER

Java provides a collection of classes and interfaces that take care of low-level communication
details between the base.client and the base.server. These are mostly contained in the java.net package,
so we need to make the following import:
**_import java.net.*;**_

For our examples we'll run our base.client and base.server programs on the same computer. If we were to
execute them on different networked computers, the only thing that would change is the IP
address. In our case, we will use localhost on 127.0.0.1.

First, we will create a basic example involving a base.client and a base.server. It's going to be a two-way
communication application where the **base.client** greets the base.server and the **base.server** responds.

See: GreetClient.java & GreetServer.java

#### How sockets work:

- A socket is one endpoint of a two-way communication link between two programs running 
on different computers on a network. 
- A socket is bound to a port number so that the transport layer can identify the application
 that data is destined to be sent to.
- A socket consists of the IP address of a system and the port number of a program within the system. 
The IP address corresponds to the system and the port number corresponds to the program where the 
data needs to be sent.


###### The base.server

Usually, a base.server runs on a specific computer on the network and has a socket that is bound 
to a specific port number. In our case, we use the same computer as the base.client and started the base.server 
on port 6666:

_ServerSocket serverSocket = new ServerSocket(6666);_

The base.server just waits, listening to the socket for a base.client to make a connection request. 
This happens in the next step:

_Socket clientSocket = serverSocket.accept();_

When the base.server code encounters the _accept_ method, it blocks until a base.client makes 
a connection request to it.

If everything goes well, the base.server accepts the connection. 
Upon acceptance, the base.server gets a new socket, clientSocket, bound to the same local port, 6666, 
and also has its remote endpoint set to the address and port of the base.client.


At this point, the new Socket object puts the base.server in direct connection with the base.client, 
we can then access the output and input streams to write and receive messages to and from 
the base.client respectively:

_PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);_

_BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));_

From here onwards, the base.server is capable of exchanging messages with the base.client endlessly 
until the socket is closed with its streams.
However, in our example the base.server can only send a greeting response before it closes the connection, 
this means that if we ran our main again, the connection would be refused.

To allow continuity in communication, we will have to read from the input stream inside a 
while loop and only exit when the base.client sends a termination request.

For every new base.client, the base.server needs a new socket returned by the accept call. 
The serverSocket is used to continue to listen for connection requests while tending to the needs 
of the connected clients. We have not allowed for this yet in our first example.

###### The base.client

The base.client must know the hostname or IP of the machine on which the base.server is running 
and the port number on which the base.server is listening.

To make a connection request, the base.client tries to connect with the base.server on the base.server's machine 
and port:

_Socket clientSocket = new Socket("127.0.0.1", 6666);_

The base.client also needs to identify itself to the base.server so it binds to a local port number, 
assigned by the system, that it will use during this connection. We don't deal with this ourselves.

The above constructor only creates a new socket when the base.server has accepted the connection, 
otherwise, we will get a connection refused exception.
When successfully created we can then obtain input and output streams from it to communicate 
with the base.server:

_PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);_

_BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));_

The input stream of the base.client is connected to the output stream of the base.server, 
just like the input stream of the base.server is connected to the output stream of the base.client.

#### Continuous communication

If we would like to implement a chat base.server, continuous back and forth communication between base.server and 
base.client would definitely be required.

We will have to create a while loop to continuously observe the input stream of the base.server 
for incoming messages.

Let's create a new base.server called EchoServer.java whose sole purpose is to echo back whatever 
messages it receives from clients.

EchoClient is similar, so we can duplicate the code/reuse the initial client.

#### Server with multiple clients

A server must have the capacity to service many clients and many requests simultaneously.

Another feature we will see here is that the same client could disconnect and reconnect again, 
without getting a connection refused exception or a connection reset on the server. 
Previously we were not able to do this.

This means that our server is going to be more robust and resilient across multiple requests 
from multiple clients.

How we will do this is to create a new socket for every new client and service that client's 
requests on a different thread. The number of clients being served simultaneously will equal 
the number of threads running.

The main thread will be running a while loop as it listens for new connections.

Let's create another server called EchoMultiServer.java. 
Inside it, we will create a handler thread class to manage each client's communications on its socket.

Notice that we now call accept inside a while loop. Every time the while loop is executed, 
it blocks on the accept call until a new client connects, then the handler thread, EchoClientHandler, 
is created for this client.

What happens inside the thread is what we previously did in the EchoServer where we 
handled only a single client. So the EchoMultiServer delegates this work to EchoClientHandler 
so that it can keep listening for more clients in the while loop.

EchoMultiClient code is similar to the EchoClient
