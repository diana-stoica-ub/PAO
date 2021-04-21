package multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoMultiClient {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void startConnection(String ip, int port) {
        try {
            clientSocket = new Socket(ip, port);
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String sendMessage(String msg) {
        try {
            out.println(msg);
            return in.readLine();
        } catch (Exception e) {
            return null;
        }
    }

    public void stopConnection() {
        try {
            in.close();
            out.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        EchoMultiClient client1 = new EchoMultiClient();
        client1.startConnection("127.0.0.1", 5555);
        String resp1 = client1.sendMessage("hello");
        String resp2 = client1.sendMessage("world");
        String resp3 = client1.sendMessage(".");
        System.out.println("GreetClient: got response " + resp1);
        System.out.println("GreetClient: got response " + resp2);
        System.out.println("GreetClient: got response " + resp3);

    }
}
