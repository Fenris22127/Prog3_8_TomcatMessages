package de.medieninformatik.Server;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private final static String command = "stopp";
    public static void main(String[] argv) {
        int port = argv.length > 0 ? Integer.parseInt(argv[0]) : 60000;
        ChatServer chat = null;
        try {
            chat = new ChatServer(port);
            chat.start();
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Chatserver erwartet Nachrichten auf Port %d!%n", port);
            System.out.printf("Eingabe von \"stopp\" beendet den Server.%n");
            while(!command.equals(scanner.nextLine()));
            chat.stopServer();
        } catch(IOException e) {
            System.exit(-1);
        }
    }
}
