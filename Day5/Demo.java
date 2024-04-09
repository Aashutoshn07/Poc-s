import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Date date = new Date();
        Date date1 = new Date();
        
        long currentTimeMillies= System.currentTimeMillis();

        java.sql.Date sqlDate = new java.sql.Date(currentTimeMillies);
        System.out.println();
        System.out.println(sqlDate);
        // Time time= new Time(0);
        // System.out.println(date);
    }
}
