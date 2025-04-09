import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //mydate-es feladat a pont
        System.out.println(DateUtil.isValidDate(2000,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2000,2, 30) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 29) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 28) == true);
        System.out.println(DateUtil.isValidDate(-1900,2, 28) == false);
        System.out.println(DateUtil.isValidDate(0,2, 28) == false);
        System.out.println(DateUtil.isValidDate(2021,2, 29) == false);
        System.out.println(DateUtil.isValidDate(2020,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2020,1, 32) == false);
        System.out.println(DateUtil.isValidDate(2020,1, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,0, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,4, 31) == false);
        System.out.println(DateUtil.isValidDate(2020,1, 31) == true);
        // mydate-es feladat b pont

        Random rand = new Random();
                int errorcount=0;
        for(int i=0;i<50;i++){
            int year=rand.nextInt(2025)+1;
            int month=rand.nextInt(12)+1;
            int day=rand.nextInt(31)+1;

            MyDate date = new MyDate(year,month,day);

            if(date.getYear()==-1){
                errorcount++;
            }else{
                System.out.println(date);
            }
        }
        System.out.println("Number of incorrect dates: "+errorcount);
    }
}