package extra_uzenetkuldo_alk;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Nagy","David");
        System.out.println(user1.getId());
        System.out.println(user1.toString());


        Messenger messenger = new Messenger();
        messenger.readUsers("users.csv");


        try (BufferedReader br = new BufferedReader(new FileReader("messages.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",", 3);
                if (parts.length < 3) continue;

                int fromId = Integer.parseInt(parts[0]);
                int toId = Integer.parseInt(parts[1]);
                String messageText = parts[2];

                User fromUser = messenger.getUser(fromId);
                User toUser = messenger.getUser(toId);

                if (fromUser != null && toUser != null) {
                    messenger.newMessage(toUser, fromUser, messageText);
                }
            }
        } catch (IOException e) {
            System.out.println("Hiba a messages.txt beolvasasa kozben: " + e.getMessage());
        }


        System.out.println("\n!!!! Osszes uzenet !!!");
        messenger.printMessages();

        System.out.println("\n!!!Chuck Norris uzenetek !!!");
        messenger.printMessagesWithKeyword("Chuck Norris");

        System.out.println("\n!!! uzenetszam felhasznalonkent !!!");
        messenger.printNumSentMessagesPerUsers();

    }
}
