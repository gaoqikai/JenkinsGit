import java.util.TimeZone;

public class main {
    public static void main(String[] args) {
        System.out.println("This is a sample test");
        int a = 10, b = 1;
        System.out.println(a * b);
        for (String string : TimeZone.getAvailableIDs(TimeZone.getTimeZone("GMT+08:00").getRawOffset())) {
            System.out.println(string);
        }
    }
}