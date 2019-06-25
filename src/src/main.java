import java.util.TimeZone;

public class main {
    public static void main(String[] args) {
        System.out.println("Today is Tuesday.");
        int a = 2, b = 4;
        System.out.println(a * b);
        for (String string : TimeZone.getAvailableIDs(TimeZone.getTimeZone("GMT+08:00").getRawOffset())) {
            System.out.println(string);
        }
    }
}