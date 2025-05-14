package BAC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class BAC {

   private ArrayList<Student> students = new ArrayList<>();

   public BAC(String fileName){
       try (Scanner scanner = new Scanner(new File(fileName))) {
           while (scanner.hasNextLine()) {
               String line;
               line = scanner.nextLine();
               String[] tokens = line.split(" ");
               int id = Integer.parseInt(tokens[0].trim());
               String firstName = (tokens[1].trim());
               String lastName = tokens[2].trim();
               String course = tokens[3].trim();
               Student student = new Student(course,firstName,lastName,id);
               students.add(student);
           }
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }

   }

   public void printStudents() {
       for (int i = 0; i < students.size(); i++) {
           System.out.println(students);
       }
       System.out.println();
       //for(Students s : students){
     //  System.out.println(s);
   //}
   }

   public void printCourses(){
       HashSet<String> courses = new HashSet<>();
       for(Student student : students){
         courses.add(student.getCourse());
       }
       System.out.println("Szakok:");
       for(String s : courses){
           System.out.println(s);
       }
   }

   public void sortAlphabetically(){
       Collections.sort(students);
   }

}
