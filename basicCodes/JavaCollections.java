import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class JavaCollections {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> arrString = new ArrayList<String>();
        arrString.add("Ishan");
        arrString.add("Pratik");
        arrString.add("Advait");
        arrString.add("Rushikesh");
        arrString.add("Ameya");
        System.out.println(arrString);

        // HashSet
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(100);
        set1.add(200);
        set1.add(500);
        set1.add(700);
        set1.add(900);
        set1.add(000);
        System.out.println(set1);
    }
}

