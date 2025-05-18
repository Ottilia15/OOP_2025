package extra_uzenetkuldo_alk;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Messenger {
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Message> messages = new ArrayList<>();

    public Messenger() {

    }

    public boolean addUser(User newUser) {
        for (User user : users) {
            if(user.getId()==newUser.getId()){
                System.out.println("\nA felhasznalo mar letezik!" + newUser.getFirstName() + newUser.getLastName());
                return false;
            }
        }
        users.add(newUser);
        System.out.println("\nFelhasznalo hozzaadva: " +newUser.getFirstName()+newUser.getLastName() );
        return true;
    }
    public User getUser(int id){
        for(User user : users){
            if(user.getId()== id){
                return user;
            }
        }
        System.out.println("\nFelhasznalo nem talalhato id alapjan!"+id);
        return null;
    }
    public void newMessage(User toUser , User fromUser , String messageText){
        if(fromUser == null || toUser == null){
            System.out.println("\nHiba.A kuldo vagy cimzett nem letezik");
        }
        Message newMessage = new Message(fromUser,toUser,messageText);
        messages.add(newMessage);
        System.out.println("\nUj uzenet elkuldve!"+newMessage);
    }
    public int numMessages(){
        return messages.size();
    }
    public int numUsers(){
        return users.size();
    }
    public void printMessages(){
        for(Message message : messages){
            System.out.println(message.getFromUser()+"--->"+message.getToUser()+":"+message.getMessage());
        }
    }
    public void printMessagesWithKeyword(String keyword){
        boolean found=false;
        for(Message messagewkw : messages){
            if(messagewkw.getMessage().contains(keyword)){
                System.out.println("\nTalaltunk a kulcsoszoval ellatott uzenetet!"+keyword+messagewkw.getMessage());
                found = true;
            }
        }
        if(!found){
            System.out.println("\nNem talaltunk kulcsszoval ellatott uzenetet! :(");
        }
    }
    public void printNumSentMessagesPerUsers(){
        HashMap<User, Integer> sentMessageCount = new HashMap<>();
        for(Message message : messages){
            User sender = message.getFromUser();
            sentMessageCount.put(sender,sentMessageCount.getOrDefault(sender,0)+1);
        }
        System.out.println("\nFelhasznalokenti uzenetszam: ");
        for (User user : sentMessageCount.keySet()){
            System.out.println(user.getFirstName()+" "+user.getLastName()+"kuldott:"+sentMessageCount.get(user)+"uzenetet");
        }
    }
    public void readUsers(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 2) continue;
                String firstName = parts[0];
                String lastName = parts[1];
                User user = new User(firstName, lastName);
                addUser(user);
            }
        } catch (IOException e) {
            System.out.println("Hiba a users.csv beolvasása közben: " + e.getMessage());
        }
    }
}
