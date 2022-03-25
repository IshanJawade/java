import java.util.Scanner; 
import java.util.ArrayList;
import java.util.Collections;


public class javaCode{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> list1 = new ArrayList<String>();
        
        list1.add("I");
        list1.add("Love");
        list1.add("You");
        list1.add("Ayushi");
        list1.add(" .");

        list1.add(4, "Forever");
        list1.set(1, "am adiicted to");

        list1.remove(5);

        System.out.println(list1);
        System.out.println(list1.get(3));
        System.out.println(list1.size());

        for(String ele:list1){
            System.out.println(ele);
        }

        Collections.sort(list1);
        System.out.println(list1);

        sc.close();
    }
}


