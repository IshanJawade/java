import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class dateFormat {
    public static void main(String[] args) {
        Date date = new Date();

        DateFormat df = DateFormat.getDateInstance();
        String str1 = df.format(date);

        df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.UK);
        String str2 = df.format(date);

        df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.UK);
        String str3 = df.format(date);

        df = DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
        String str4 = df.format(date);

        df = DateFormat.getDateInstance(DateFormat.FULL, Locale.UK);
        String str5 = df.format(date);

        System.out.println(str1+"  //DEFAULT");
        System.out.println(str2+"  //SHORT");
        System.out.println(str3+"  //MEDIUM");
        System.out.println(str4+"  //LONG");
        System.out.println(str5+"  //FULL");
    }
}
