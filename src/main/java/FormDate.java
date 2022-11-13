import java.time.LocalDate;
import java.time.Month;

public class FormDate {

    public int day;
    public int month;
    public int year;

    public static void main(String[]args) {
     LocalDate specificDate = LocalDate.of(1993, Month.APRIL, 3);
    }
}
