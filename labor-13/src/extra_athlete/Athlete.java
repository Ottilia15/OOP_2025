package extra_athlete;

public class Athlete {
    private int id;
    private String nationality;
    private String name;
    private static int counter=0;

    public Athlete(String name,String nationality){
        this.id=counter++;
        this.name=name;
        this.nationality=nationality;
    }
    public String toString(){
        return id+" "+name+" "+nationality;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public String getNationality(){
        return nationality;
    }
}
