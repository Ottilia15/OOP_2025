package extra_uzenetkuldo_alk;

public class Message {
    private User fromUser;
    private User toUser;
    private String message;

    public Message(User fromUser,User toUser,String message){
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.message = message;
    }
    public User getFromUser(){
        return  fromUser;
    }
    public String getMessage(){
        return message;
    }
    public User getToUser(){
        return toUser;
    }
    @Override
    public String toString(){
        return fromUser+" "+toUser+" "+message;
    }

}
