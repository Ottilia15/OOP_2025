package extra_athlete;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class GoldenBall {
    private ArrayList<Footballer> footballers = new ArrayList<>();
    private TreeMap<Integer, String> awards = new TreeMap<>();   //kulcs-->ev , ertek-->focista neve

    public GoldenBall(String fileName) {
        footballers = new ArrayList<>();
        awards = new TreeMap<>();

        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(";");
                if (parts.length == 5) {
                    String id = parts[0];
                    String name = parts[1];
                    String nationality = parts[2];
                    int jerseyNumber = Integer.parseInt(parts[3]);
                    String team = parts[4];

                    Footballer f = new Footballer(name, nationality, jerseyNumber, team);
                    footballers.add(f);
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("\nHiba a fájl beolvasásakor: " + e.getMessage());
        }
    }

    public String minJerseyNumberByNationality(String nationality) {
        Footballer min = null;
        for (Footballer f : footballers) {
            if (f.getNationality().equals(nationality)) {
                if (min == null || f.getJerseyNumber() < min.getJerseyNumber()) {
                    min = f;
                }
            }
        }
        if (min != null) {
            return min.getName() + " --- " + min.getTeam();
        } else {
            return "\nNincs ilyen nemzetisegu focista!";
        }
    }

    public int countByJerseyNumber(int number) {
        int count = 0;
        for (Footballer f : footballers) {
            if (f.getJerseyNumber() == number) {
                count++;
            }
        }
        return count;

    }

    public void printAward() {
        System.out.println("\nDijak:");
        for (Integer year : awards.keySet()) {
            System.out.println(year + ":" + awards.get(year));
        }
    }

    private boolean registerNewAward(int year, String name) {
        if (!awards.containsKey(year)) {
            awards.put(year, name);
            return true;
        } else {
            System.out.println("\nERROR,ebben az evben mar van nyertes.");
            return false;
        }
    }

    public void readAwards(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(";");

                if (data.length == 2) {
                    int year = Integer.parseInt(data[0]);
                    String footballerName = data[1];

                    registerNewAward(year, footballerName); // Beillesztés a TreeMap-be
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("\nHiba: A fájl nem található!");
        } catch (NumberFormatException e) {
            System.out.println("\nHiba: Az év formátuma nem megfelelő!");
        }
    }

    public void printByTeam(String team) {
        boolean found = false;
        for (Footballer f : footballers) {
            if (f.getTeam().equals(team)) {
                System.out.println(f);
                found = true;
            }
        }
        if (!found) {
            System.out.println("\nNincs ilyen");
        }
    }

    private String getFootballerById(int id) {
        for (Footballer f : footballers) {
            if (f.getId() == id) {
                return f.getName();
            }
        }
        return  null;
    }
    public void printFootballPlayers(){
        for(Footballer f : footballers){
            System.out.println(f);
        }
    }
}
