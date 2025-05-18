package extra_uzenetkuldo_alk;

public class User {
    private int id;
    private static int counter=0;
    private final String firstName;
    private final String lastName;

    public User(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = counter++;

       /* Random random = new Random();
        id = random.nextInt(1000);
        //System.out.println("\nA generalt ID: "+id);
*/
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){return lastName;}
    public int getId(){
        return id;
    }
    public String toString(){
        return firstName+" "+lastName+" "+id;
    }
}
