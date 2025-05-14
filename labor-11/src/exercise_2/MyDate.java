package exercise_2;

public class MyDate implements Comparable<MyDate> {
        private int year;
        private int month;
        private int day;

        public MyDate(int year,int month,int day ) {
            if (DateUtil.isValidDate(year, month, day)) {
                this.year = year;
                this.month = month;
                this.day = day;
            }else{
                this.year=-1;
                this.month=-1;
                this.day=-1;
            }
        }
        public int getYear(){
            return year;
        }
        public int getMonth(){
            return month;
        }
        public int getDay(){
            return day;
        }
        @Override
        public String toString(){
            if(year==-1){
                return "invalid date";
            }
            return year + "/" + month + "/" + day + "/";
        }

    @Override
    public int compareTo(MyDate that) {
            //this that
        if(this.year == that.year){
           if(this.month == that.month){
               return this.day - that.day;
           }
           return this.month - that.month;
        }
        return this.year - that.year;
    }
}
