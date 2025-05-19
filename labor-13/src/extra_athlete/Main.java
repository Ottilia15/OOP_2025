package extra_athlete;

public class Main {
    public static void main(String[] args) {
        Footballer foci = new Footballer("Messi","Argentin",10,"FC Barca");
        Footballer foci2 = new Footballer("Ronaldo","Portugal",7,"Real Madrid");
        System.out.println(foci);
        System.out.println(foci2);

        GoldenBall goldenBall = new GoldenBall("focistak.txt");
        goldenBall.printFootballPlayers();
        System.out.println(goldenBall.countByJerseyNumber(10));
        System.out.println(goldenBall.minJerseyNumberByNationality("Angol"));
        goldenBall.printByTeam("Real Madrid");
        goldenBall.readAwards("awards.txt");
        goldenBall.printAward();
    }
}
