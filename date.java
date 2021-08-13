import java.util.Date;
public class date {
    public static void main(String[] args) {
        Date dateObj = new Date();
        System.out.println(dateObj);

        long millisec = System.currentTimeMillis();
        System.out.println(millisec);

        Date dateObj1 = new Date(millisec);
        System.out.println(dateObj1);
    }
}
