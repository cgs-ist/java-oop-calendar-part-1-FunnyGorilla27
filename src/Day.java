public class Day {
    private int DayOfMonth;
    private int month;
    private int year;

    public Day(int DayOfMonth, int month, int year){
        this.DayOfMonth = DayOfMonth;
        this.month = month;
        this.year = year;
    }
    public int getDayOfMonth(){
        return DayOfMonth;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
}
