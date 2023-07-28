import java.util.*;
public class Calendar {
    private List<Month> monthlist = new ArrayList<Month>();
    private List<Day> daylist = new ArrayList<Day>();
    private Year currentYear;
    Calendar(int currentYear){
        Year rnYear = new Year(currentYear);
        this.currentYear = rnYear;
    }
    public List<Day> getDays(){
        return daylist;
    }
    public List<Month> getMonths(){
        return monthlist;
    }
    public void intialiseMonths(){
        monthlist.add(new Month("January", 31));
        monthlist.add(new Month("Luminora", 30));
        monthlist.add(new Month("Aquorin", 25));
        monthlist.add(new Month("Solendia",30));
        monthlist.add(new Month("Verdura",35));
        monthlist.add(new Month("Zephyrath",32));
        monthlist.add(new Month("Novembra",40));
        monthlist.add(new Month("Crystalia",20));
        monthlist.add(new Month("Ecliptus",18));
        monthlist.add(new Month("Emberune",28));
        monthlist.add(new Month("Celestria",38));
        monthlist.add(new Month("Auroria",15));
        monthlist.add(new Month("Asgard", 1));
    }
    public void intialiseDay(){
        for(int monthIndex = 0; monthIndex< monthlist.size(); monthIndex++){
            Month month = monthlist.get(monthIndex);
            for(int dayIndex = 0; dayIndex< month.getNumberOfDays(); dayIndex++){
                Day newDay = new Day(dayIndex + 1, monthIndex +1, currentYear.getYear());
                daylist.add(newDay);
            }
        }
    }
}
