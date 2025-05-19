package extra_athlete;

public class Footballer extends Athlete {
    private int jerseyNumber;
    private String team;
    private String name;
    public Footballer(String name,String nationality,int jerseyNumber,String team){
        super(name, nationality);
        this.jerseyNumber = jerseyNumber;
        this.team = team;
    }
    public int getJerseyNumber(){
        return jerseyNumber;
    }
    public String getTeam(){
        return team;
    }
    public String getName(){
        return super.getName();
    }
    public String toString(){
        return super.toString()+" "+jerseyNumber+" "+team;
    }
}
