package exercise_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<MyDate> dates = new ArrayList<>();
        Random random = new Random();
        while(dates.size()<10){
            int year = 2025;
            int month = random.nextInt(12) + 1;
            int day = random.nextInt(31) + 1;
            if(DateUtil.isValidDate(year , month , day)) {
                dates.add(new MyDate(year , month , day));
            }
        }
        for (MyDate d : dates){
            System.out.println(d);
        }
        Collections.sort(dates);
        System.out.println("Idorendi soorendben : REGI-->UJ"); //REGI-->UJ //COMPARABLE HASZNALATA
        for (MyDate d : dates) {
            System.out.println(d);
        }
       Collections.sort(dates , new Comparator<MyDate>() {    //COMPARATOR HASZNALATA!!!!!!!!
           @Override
           public int compare(MyDate o1, MyDate o2) {
               if(o2.getYear() == o1.getYear()){
                   if(o2.getMonth() == o1.getMonth()){
                       return o2.getDay() - o1.getDay();
                   }
                   return o2.getMonth() - o1.getMonth();
               }
               return o2.getYear() - o1.getYear();
           }
       }
       );
        System.out.println("Idorendi sorrendben: UJ--->REGI");//comparator hasznala!!!
        for(MyDate date : dates){
            System.out.println(date);
        }
    }
}

//Parcialis=
//1.szarmaztatas
//2.implementacio ,interfeszekkel
//3.rendezes
//4.
//gyakorlasra lab10 employee-manager es lab11
