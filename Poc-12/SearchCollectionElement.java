import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.LinkedList;

public class SearchCollectionElement {
    public static void main(String[] args) {

        LinkedList<String> monthlist = new LinkedList<>();
        LinkedList<String> weeklist = new LinkedList<>();

        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();

        String[] monthsArray = dateFormatSymbols.getMonths();
        String[] dateArray = dateFormatSymbols.getWeekdays();

        for (String month : monthsArray) {
            if (!month.isEmpty()) {
                monthlist.add(month);
            }
        }
        for (String week : dateArray) {
            if (!week.isEmpty()) {
                weeklist.add(week);
            }
        }
        Collections.sort(weeklist);
        Collections.sort(monthlist);

        System.out.println("Sorted Months:");
        System.out.println(monthlist);
        System.out.println(weeklist);

        String searchMonth = "April";
        int index = Collections.binarySearch(monthlist, searchMonth);

        if (index >= 0) {
            System.out.println("Position of " + searchMonth + " in the list: " + index);
        } else {
            System.out.println(searchMonth + " not found in the list.");
        }
    }
}