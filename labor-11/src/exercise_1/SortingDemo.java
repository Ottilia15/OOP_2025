package exercise_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingDemo {

    private ArrayList<String> fruits = new ArrayList<>();

    public SortingDemo(String fileName) {
        try(Scanner scanner = new Scanner(new File(fileName))) {
           while(scanner.hasNext()){
               String fruitName = scanner.next();
               fruits.add(fruitName);
           }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    public void printFruits() {
        for(String s : fruits){
            System.out.println(s + " ");
        }
        System.out.println();
    }

    public void sortAlphabetically(){
        Collections.sort(fruits);
    }

    public void sortReverseAlphabetically(){
        Collections.sort(fruits , Collections.reverseOrder());
    }


}
