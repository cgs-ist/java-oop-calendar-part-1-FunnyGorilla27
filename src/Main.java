import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Current year for the calendar
        int currentYear = 2023;

        // Create a Calendar object
        Calendar calendar = new Calendar(currentYear);
        calendar.intialiseMonths();
        calendar.intialiseDay();
        // Example: Print the months and their corresponding number of days in the current year
        List<Month> months = calendar.getMonths();
        for (int i = 0; i < months.size(); i++) {
            Month month = months.get(i);
            System.out.println("Month: " + month.getName() + ", Days: " + month.getNumberOfDays());
        }
        System.out.println("This is after months should have been printed");
        System.out.println(months.size());
        // Example: Print all the days in the current year
        List<Day> days = calendar.getDays();
        for (Day day : days) {
            System.out.println("Day: " + day.getDayOfMonth() + "/" + day.getMonth() + "/" + day.getYear());
        }
    }
}

