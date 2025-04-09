public class MyDate {
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
    public String toString(){
        if(year==-1){
            return "invalid date";
        }
        return year + "/" + month + "/" + day + "/";
    }
}
